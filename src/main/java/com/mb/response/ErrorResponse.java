package com.mb.response;

import java.util.Date;
import java.util.List;

public class ErrorResponse
{

	private Date timestamp;
	private String message;
	private String details;
	private int statusCode;
	private String error;
	private List<ValidationErrorResponse> validationErrors;

	public ErrorResponse(Date timestamp, String message, String details, int statusCode, String error)
	{
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.statusCode = statusCode;
		this.error = error;
	}

	public Date getTimestamp()
	{
		return timestamp;
	}

	public String getMessage()
	{
		return message;
	}

	public String getDetails()
	{
		return details;
	}

	public int getStatusCode()
	{
		return statusCode;
	}

	public String getError()
	{
		return error;
	}

	public List<ValidationErrorResponse> getValidationErrors()
	{
		return validationErrors;
	}

	public void setValidationErrors(List<ValidationErrorResponse> validationErrors)
	{
		this.validationErrors = validationErrors;
	}
}
