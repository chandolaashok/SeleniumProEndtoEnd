package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am the number from last");
	}
	
	@Parameters({"URL","APIKey/username"})//Go and Catch this value as well
	@Test
	public void WebloginCarLoan(String urlname, String key)
	{ //selenium
		System.out.println("WebloginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I will execute first");
	}
	
	
	@Test(dataProvider="getData")
	public void MobileLogincarLoan( String username, String password)
	{
		//Appium
		System.out.println("MobileLogincarLoan");
		System.out.println(username);
		System.out.println(password);
		//System.out.println(URLName);
	}
	
	@BeforeMethod

	public void beforemethod()
	{
		System.out.println("I will execute before every test method in daya 3 class");
	}
	
  public void LoginApiCarLoan()
  {
	  //Rest API automation
	  System.out.println("LoginApiCarLoan");
  }
	
  @DataProvider
  public Object[][] getData()
  {
	  //1. test user name and password
	  //2. another users name and password.
	  
	  Object[][] data= new Object[3][2];  // (multi dimentional object  array) for each combination you are passing how many values
       data[0][0]="firstusername";//
   
       data[0][1]="firstpassword";
       //each data set will be treated as one row, columns in the row are values for particular combination(row)
       
       
       
               //2nd set
       
       data[1][0] ="Secondusername";
       data[1][1]="secondpassword";
       
       
     //3rd row
       
       data[2][0]="thirdusername";
       data[2][1]="thirdpassword";
    //now we have to trigger test case with data first, then test case will invoke and trigger second data  and finally send the data back
  
    return data;
    
  }
  
  
  
  
}
