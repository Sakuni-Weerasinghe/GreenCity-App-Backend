package com.greencity.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "CollectionCenters")
public class CollectionCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int centerId;
	@Column(unique = true)
	private String username;
	@NotEmpty
	@Column
	private String centertName;
	@NotEmpty
	@Column
	private String password;
	@NotEmpty
	@Column(length = 10, unique = true)
	private int contactNumber;
	@NotEmpty
	@Column(unique = true)
	private String email;
	@NotEmpty
	@Column
	private String addressLine1;
	@NotEmpty
	@Column
	private String addressLine2;
	@Column
	private String addressLine3;
	@NotEmpty
	@Column
	private boolean accountStatus;

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCentertName() {
		return centertName;
	}

	public void setCentertName(String centertName) {
		this.centertName = centertName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public boolean isAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
}
