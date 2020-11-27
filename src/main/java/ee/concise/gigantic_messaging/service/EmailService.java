package ee.concise.gigantic_messaging.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import ee.concise.gigantic_messaging.enums.ResponseStatus;

@Service
public class EmailService {

	private static final Logger logger = Logger.getLogger(EmailService.class.getName());

	public ResponseStatus sendEmail(String email, Long messageId, String body) {
		logger.info("Received email request for " + email + "(messageId " + messageId + ")");
		if (messageId != null && messageId % 250 == 0) {
			logger.info("Email for " + email + " wont be handled, as it's our lucky error message candidate");
			return ResponseStatus.ERROR_INVALID_REQUEST;
		}
		return ResponseStatus.SUCCESS_OK;
	}

}
