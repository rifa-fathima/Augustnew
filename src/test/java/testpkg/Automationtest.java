package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagepkg.Automatiologinpage;
import pagepkg.Automationpage;

public class Automationtest {
	
	
	WebDriver driver;
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/signup");
	}
	
	@Test(priority=0)
	public void Automationsignup()
	{
		Automationpage ob=new Automationpage(driver);
		
		ob.signup("rifafathima", "rifa123456@gmail.com");
		ob.signupbtn();
		ob.genders();
		ob.pwd("rifaaas1234");
		ob.day();
		ob.month();
		ob.year();
		ob.fstname("rifa");
		ob.lsname("fathima");
		ob.company("luminar");
		ob.adrs("mannassery");
		ob.adrss("aluva");
		ob.state("kerala");
		ob.cty("aluva");
		ob.zpcode("683106");
		ob.mob("9887867677");
		ob.submit();
	}
	
	@Test(priority=1)
	public void Automationlogin()
	{
		Automatiologinpage ob= new Automatiologinpage(driver);
		
		ob.login("rifa123456@gmail.com", "rifaaas1234");
		ob.loginbutton();
	}
}
