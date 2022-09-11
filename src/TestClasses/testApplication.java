package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageFactory.createFacebookPage;
import PageFactory.facebookLogin;

public class testApplication {
	
	@Test
	
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\selenium tools\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		facebookLogin fb=new facebookLogin(driver);
		
		fb.EmailId().sendKeys("9970023648");
		
		fb.inputPassword().sendKeys("123645885");
		
		//fb.submitButton().click();
		Thread.sleep(2000);
		
		fb.createNewAccount().click();
		
		createFacebookPage crPage=new createFacebookPage(driver);
		crPage.removeWindowPopup().click();
		
		Thread.sleep(2000);
		crPage.getStardedForBusiness().click();
	}
	

}
