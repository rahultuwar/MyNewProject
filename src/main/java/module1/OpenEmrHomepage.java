package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenEmrHomepage {
@FindBy(xpath="(//a[text()='Demo'])[1]") private WebElement Demo;
public OpenEmrHomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);}
public void clickOnDemoLink() {
	Demo.click();}}
