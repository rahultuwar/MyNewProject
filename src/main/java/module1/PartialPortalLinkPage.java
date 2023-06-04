package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartialPortalLinkPage {
@FindBy (xpath="//a[text()='https://demo.openemr.io/openemr']")private WebElement partialPortalLink;
public PartialPortalLinkPage(WebDriver driver)
{PageFactory.initElements(driver, this);}
public void partialPortalLinkClick() {
	partialPortalLink.click();}}
