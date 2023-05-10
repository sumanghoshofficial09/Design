package com.flyweightdesignpattern.demo.factory;

import java.util.HashMap;
import java.util.Map;

import com.flyweightdesignpattern.demo.pojo.SystemErrorMessage;
import com.flyweightdesignpattern.demo.pojo.UserBannedErrorMessage;

public class ErrorMessageFactory {
	public  enum ErrorType {GenericSystemError,PageNotFoundError,ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();
	
	public static ErrorMessageFactory getInstance()
	{
		return FACTORY;
	}

	private Map<ErrorType,SystemErrorMessage> errorMessages = new HashMap<>();
	private ErrorMessageFactory()
	{
		
		errorMessages.put(ErrorType.GenericSystemError,  new SystemErrorMessage("A generic error of type $errorCode occurred. Please refer to:\n", "https:\\myurl?code="));
		errorMessages.put(ErrorType.PageNotFoundError,  new SystemErrorMessage("A page error of type $errorCode occurred. Please refer to:\n", "https:\\myurl?code="));
		
	}
	
	public SystemErrorMessage  getError(ErrorType  type)
	{
		return errorMessages.get(type);
	}
	
	public UserBannedErrorMessage getUserBannerMessage(String caseId)
	{
		
		return new UserBannedErrorMessage(caseId);
		
	}
}
