package ee.concise.gigantic_messaging.controller;

import static ee.concise.gigantic_messaging.enums.ResponseStatus.ERROR_INVALID_REQUEST;
import static ee.concise.gigantic_messaging.enums.ResponseStatus.SUCCESS_OK;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ee.concise.gigantic_messaging.Application;
import ee.concise.gigantic_messaging.dto.BaseResponse;
import ee.concise.gigantic_messaging.dto.SendEmailRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestResourceTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testRestSendEmail() {
		BaseResponse response = restTemplate.postForObject("http://localhost:" + port + "/emails/send",
				new SendEmailRequest("test@mail.ee", 123L, "Hello World"), BaseResponse.class);

		assertEquals(SUCCESS_OK, response.getStatus());
		assertEquals(Long.valueOf(123L), response.getMessageId());
	}

	@Test
	public void testRestSendEmailFailed() {
		BaseResponse response = restTemplate.postForObject("http://localhost:" + port + "/emails/send",
				new SendEmailRequest("test-wrong@mail.ee", 500L, "Hello World"), BaseResponse.class);

		assertEquals(ERROR_INVALID_REQUEST, response.getStatus());
		assertEquals(Long.valueOf(500L), response.getMessageId());
	}

}