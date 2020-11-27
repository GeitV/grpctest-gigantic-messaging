package ee.concise.gigantic_messaging.grpc;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.lognet.springboot.grpc.GRpcService;

import ee.concise.gigantic_messaging.BaseResponse;
import ee.concise.gigantic_messaging.EmailRequest;
import ee.concise.gigantic_messaging.GiganticMessagingGrpc;
import ee.concise.gigantic_messaging.enums.ResponseStatus;
import ee.concise.gigantic_messaging.service.EmailService;
import io.grpc.stub.StreamObserver;

@GRpcService
public class GiganticMessagingService extends GiganticMessagingGrpc.GiganticMessagingImplBase {

	private static final Logger logger = Logger.getLogger(GiganticMessagingService.class.getName());

	private final EmailService emailService;

	public GiganticMessagingService(EmailService emailService) {
		this.emailService = emailService;
	}

	@Override
	public void sendEmail(EmailRequest request, StreamObserver<BaseResponse> responseObserver) {
		ResponseStatus status = emailService.sendEmail(request.getEmail(), (long) request.getMessageId(),
				request.getBody());

		responseObserver.onNext(buildBaseResponse(status, request));
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<EmailRequest> sendEmailStream(StreamObserver<BaseResponse> responseObserver) {
		return new StreamObserver<>() {
			@Override
			public void onNext(EmailRequest request) {
				ResponseStatus status = emailService.sendEmail(request.getEmail(), (long) request.getMessageId(),
						request.getBody());

				responseObserver.onNext(buildBaseResponse(status, request));
			}

			@Override
			public void onError(Throwable t) {
				logger.log(Level.WARNING, "Encountered error in sendEmail", t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}

	private static BaseResponse buildBaseResponse(ResponseStatus status, EmailRequest request) {
		if (status != ResponseStatus.SUCCESS_OK) {
			return BaseResponse.newBuilder()
					.setStatus(BaseResponse.ResponseStatus.ERROR_INVALID_REQUEST)
					.setMessageId(request.getMessageId())
					.setMessage("non-existing email, can't be delivered")
					.build();
		}
		return BaseResponse.newBuilder()
				.setStatus(BaseResponse.ResponseStatus.SUCCESS_OK)
				.setMessageId(request.getMessageId())
				.build();
	}

}
