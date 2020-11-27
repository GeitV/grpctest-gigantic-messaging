package ee.concise.gigantic_messaging.grpc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ee.concise.gigantic_messaging.BaseResponse;
import ee.concise.gigantic_messaging.EmailRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GiganticMessagingGrpcClientTest {

	@Autowired
	private GiganticMessagingClient giganticMessagingClient;

	@Test
	public void testGrpcSendEmail() {
		BaseResponse response = giganticMessagingClient.sendEmail(EmailRequest.newBuilder()
				.setEmail("test@mail.ee")
				.setMessageId(123)
				.setBody("Hello World")
				.build());

		assertEquals(BaseResponse.ResponseStatus.SUCCESS_OK, response.getStatus());
		assertEquals(123, response.getMessageId());
	}

	@Test
	public void testGrpcSendEmailFailed() {
		BaseResponse response = giganticMessagingClient.sendEmail(EmailRequest.newBuilder()
				.setEmail("test-wrong@mail.ee")
				.setMessageId(500)
				.setBody("Hello World")
				.build());

		assertEquals(BaseResponse.ResponseStatus.ERROR_INVALID_REQUEST, response.getStatus());
		assertEquals(500, response.getMessageId());
	}

}