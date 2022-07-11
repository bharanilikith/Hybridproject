package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejava;
	
	public CorejavaPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void corejavacourse() {
		corejava.click();
	}
	
	

}
