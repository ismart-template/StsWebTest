package net.hibiznet.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

public class TestException {

	@Autowired 
	static MessageSource messageSource;
		
	 public static void divideByZero() throws NoSuchMessageException, Exception {
	
	   // throw an exception
	   throw new Exception(messageSource.getMessage("info.message", new Object[] { "divideByZero" }, null));
	 }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divideByZero();
		} catch (NoSuchMessageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
