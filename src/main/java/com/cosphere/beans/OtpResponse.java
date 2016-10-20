package com.cosphere.beans;

import java.util.List;

public class OtpResponse {

	private String ErrorCode;
	private String errorMessage;
	private String JobId;
	private List <MessageData> MessageData;
	
	public String getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getJobId() {
		return JobId;
	}
	public void setJobId(String jobId) {
		JobId = jobId;
	}
	public List<MessageData> getMessageData() {
		return MessageData;
	}
	public void setMessageData(List<MessageData> messageData) {
		MessageData = messageData;
	}
}
