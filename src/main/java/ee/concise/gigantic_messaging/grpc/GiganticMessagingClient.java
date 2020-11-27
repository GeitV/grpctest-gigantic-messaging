package ee.concise.gigantic_messaging.grpc;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import ee.concise.gigantic_messaging.BaseResponse;
import ee.concise.gigantic_messaging.EmailRequest;
import ee.concise.gigantic_messaging.GiganticMessagingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class GiganticMessagingClient {

	private static final Logger logger = Logger.getLogger(GiganticMessagingClient.class.getName());

	private GiganticMessagingGrpc.GiganticMessagingBlockingStub giganticMessagingServiceBlockingStub;

	@PostConstruct
	private void init() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

		giganticMessagingServiceBlockingStub = GiganticMessagingGrpc.newBlockingStub(managedChannel);
	}

	public BaseResponse sendEmail(EmailRequest request) {
		logger.info("client sending " + request);

		BaseResponse response = giganticMessagingServiceBlockingStub.sendEmail(request);

		logger.info("client received " + response);
		return response;
	}

}