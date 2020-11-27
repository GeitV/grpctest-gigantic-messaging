package ee.concise.gigantic_messaging.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import ee.concise.gigantic_messaging.enums.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private ResponseStatus status = ResponseStatus.SUCCESS_OK;
	private String message;
	private Long messageId;

	public BaseResponse(Long messageId) {
		this.messageId = messageId;
	}
}
