package com.flyweightdesignpattern.demo.client;

import com.flyweightdesignpattern.demo.factory.ErrorMessageFactory;
import com.flyweightdesignpattern.demo.factory.ErrorMessageFactory.ErrorType;
import com.flyweightdesignpattern.demo.pojo.SystemErrorMessage;
import com.flyweightdesignpattern.demo.pojo.UserBannedErrorMessage;

public class MainClient {
	public static void main(String args[])
	{
		SystemErrorMessage err1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		
		 System.out.println(err1.getText("404"));
		 
		 UserBannedErrorMessage msg2= ErrorMessageFactory.getInstance().getUserBannerMessage("1204");
		 
		 System.out.println(msg2.getText("12"));
	}

}
