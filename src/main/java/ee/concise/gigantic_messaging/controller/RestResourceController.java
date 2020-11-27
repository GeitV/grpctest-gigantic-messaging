package ee.concise.gigantic_messaging.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ee.concise.gigantic_messaging.dto.BaseResponse;
import ee.concise.gigantic_messaging.dto.SendEmailRequest;
import ee.concise.gigantic_messaging.enums.ResponseStatus;
import ee.concise.gigantic_messaging.service.EmailService;

@RestController
public class RestResourceController {

	private final EmailService emailService;

	public RestResourceController(EmailService emailService) {
		this.emailService = emailService;
	}

	@PostMapping("/emails/send")
	public @ResponseBody BaseResponse sendEmail(@RequestBody SendEmailRequest message) {
		ResponseStatus status = emailService.sendEmail(message.getEmail(), message.getMessageId(), message.getBody());

		if (status != ResponseStatus.SUCCESS_OK) {
			return new BaseResponse(status, "non-existing email, can't be delivered",
					message.getMessageId());
		}
		return new BaseResponse(message.getMessageId());
	}
}
