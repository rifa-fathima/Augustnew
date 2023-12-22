package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automatiologinpage {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")
	WebElement loginbtn;
	


	public Automatiologinpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void login(String email,String password)
	{
		
	    emailid.sendKeys(email);
	    pass.sendKeys(password);
	}
	
	public void loginbutton()
	{
		
	  loginbtn.click();
	}
	
}
