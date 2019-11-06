package Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day1 {
	
	
	@Test(groups={"Smoke"})
	public void Demo()
	{
		System.out.println("test");
		
	
	}
	
@Parameters({"URL"})
@Test
	public void demo2(String Urlname)
	{
		System.out.println(Urlname);
	}
	
@Test(dataProvider="getDta")
public void mobi(String uername, String password)
{
	System.out.println(uername);
	System.out.println(password);
	}

@DataProvider
public Object[][] getdata()
{
	Object[][] data= new Object[3][2];// in each combination you are passing how many values..?? is defined here
	data[0][0]="firtusername";
	data[0][1]="passwordfirst";
	// column data are the values..
	data[1][0]="secondusername";
	data[1][1]="passwrodsecodn";
	 
	
	data[2][0]="thirdusername";
	data[2][1]="thirdpassword";
	return data;
	
	
	
	}



}
