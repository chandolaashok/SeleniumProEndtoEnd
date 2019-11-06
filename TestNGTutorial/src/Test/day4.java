package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomerLoan(String urlstr)
	{ //selenium
		System.out.println("WebloginHomeLoan");
		System.out.println(urlstr);
	}
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	
  public void LoginApiHomeLoan()
  {
	  //Rest API automation
	  System.out.println("LoginApiHomeLoan");
  }
	
}
