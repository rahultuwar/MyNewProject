package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageModulePage {
@FindBy (xpath="(//div[@class='menuLabel px-1 dropdown-toggle oe-dropdown-toggle'])[1]")private WebElement Modules;
@FindBy (xpath="(//div[@class='menuLabel px-1'])[1]")private WebElement ManageModule;
WebDriver driver1;
	public ManageModulePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void moveToElement() {
		Actions A=new Actions(driver1);
		A.click(Modules).perform();
	}
	public void clickOnManageModule() {
		ManageModule.click();
	}
}
