package com.greencity.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor
public class LoginResponse {
	private String authenticationtoken;
	private String username;
	private String userRole;

	public LoginResponse() {
	}

	public String getAuthenticationtoken() {
		return authenticationtoken;
	}

	public void setAuthenticationtoken(String authenticationtoken) {
		this.authenticationtoken = authenticationtoken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}
