package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createFacebookPage {
	
WebDriver driver;
	
	public createFacebookPage(WebDriver driver)
	{
		this.driver=driver;
				
	}
	
	By getStarted =By.xpath("//td[@class='prl _51m-']//div[@class='_1q5p _38h7']//div[@class='_3a5o _38gw']//div[@class='_4zcq']//button[@type='button']//div[@class='_43rl']//div[@class='_43rm'][contains(text(),'Get Started')]");
	By removePopup= By.xpath("//span[@style='color: white']");
	
	public WebElement removeWindowPopup()
	{
		return driver.findElement(removePopup);
	}
	
	
	public WebElement getStardedForBusiness()
	{
		return driver.findElement(getStarted);
	}

}
