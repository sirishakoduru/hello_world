package utility;

import utility.logger_load;

public class logger_test {
	
	public void testInfo()
	{
		int c,a=10, b=20;
		c=a+b;
		System.out.println("Value of c :"+c);
		logger_load.info("Info  - Addition of integers");
	}
	
	public void testError()
	{
		try
			{
			int i=1/0;
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		finally
			{
			logger_load.error("Error - You can not divide a number by zero");
			}
	
	}
	
	public void testWarn()
	{
		logger_load.warn("Warning - Testing");
	}
	
	public static void main(String[] args) {
		
		logger_test obj = new logger_test();
		obj.testError();
		obj.testInfo();
		obj.testWarn();
	}
	

}
