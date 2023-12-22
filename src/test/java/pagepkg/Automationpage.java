package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automationpage {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signupbutton;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"id_gender2\"]")
	WebElement gender;
																			
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement dayelement;
	
	@FindBy(xpath="//*[@id='months']")
	WebElement monthelement;
	
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement yearelement;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement fsname;
	
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement lsname;
	
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement cmpny;
	
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement addr;
	
	@FindBy(xpath="//*[@id=\"address2\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement zip;
	
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement sub;
	
	
	
	

	
	public Automationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void signup(String username,String email)
	{
		name.sendKeys(username);
	    emailid.sendKeys(email);
	}
	
	public void signupbtn()
	{
		signupbutton.click();
	}
	public void genders()
	{
		gender.click();
	}
	public void pwd(String pwd)
	{
		pass.sendKeys(pwd);
	}
	
	
	public void day()
	{
		Select day =new Select(dayelement);
		day.selectByValue("14");
	
	}
	public void month()
	{
	
		Select month =new Select(monthelement);

		month.selectByVisibleText("February");
	}
	
	public void year()
	{
		Select year =new Select(yearelement);
		year.selectByVisibleText("2000");
	}
	
	public void fstname(String fname)
	{
		fsname.sendKeys(fname);
	}
	
	public void lsname(String lname)
	{
		lsname.sendKeys(lname);
	}
	
	public void company(String cpyname)
	{
		cmpny.sendKeys(cpyname);
	}
	
	public void adrs(String ad)
	{
		addr.sendKeys(ad);
	}
	
	public void adrss(String addrs)
	{
		address.sendKeys(addrs);
	}
	
	public void state(String st)
	{
		state.sendKeys(st);
	}
	
	public void cty(String ct)
	{
		city.sendKeys(ct);
	}
	
	
	public void zpcode(String cd)
	{
		zip.sendKeys(cd);
	}
	
	public void mob(String mb)
	{
		mobile.sendKeys(mb);
	}
	
	public void submit()
	{
		sub.click();
	}
	
}

