package com.ibm.springmvc.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotBlank(message = "Name is required")
	@Size(min = 5, max = 30, message = "must be between 5 to 3 characters")
	private String name;
	@NotBlank(message = "Email is required")
	@Email(message = "should be a valid email format")
	private String email;
	@Pattern(regexp = "^[0-9]{10}$", message = "enter a valid phone number")
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
