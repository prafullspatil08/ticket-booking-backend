package com.mb.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class BookingDetailDto
{

	@NotBlank
	private String name;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String mobile;

	@NotNull
	private long showId;

	private String[] reserved;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public long getShowId() {
		return showId;
	}

	public String[] getReserved() {
		return reserved;
	}

	

}
