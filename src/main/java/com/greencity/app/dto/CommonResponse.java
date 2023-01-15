package com.greencity.app.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor
@Component
@Scope()
public class CommonResponse {
	private String responseBody;
	private boolean responseStatus;

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public boolean isResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(boolean responseStatus) {
		this.responseStatus = responseStatus;
	}
}
