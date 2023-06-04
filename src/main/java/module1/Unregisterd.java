package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Unregisterd {
@FindBy (xpath="//a[@id='header_tab_.htmlspecialchars(UnReg,ENT_QUOTES).']")private WebElement Unregisterd;
@FindBy (xpath="(//input[@class='activate'])[1]")private WebElement Register;
@FindBy (xpath="//a[@id='header_tab_.htmlspecialchars(Registered,ENT_QUOTES).']")private WebElement Registerd;
@FindBy (xpath="(//input[@class='activate'])[1]")private WebElement Install;
@FindBy (xpath="(//input[@class='activate'])[1]")private WebElement Enable;
public Unregisterd(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnUnregisted() {
	Unregisterd.click();
}
public void clickOnRegisterButton() {
	Register.click();
	
}
public void clickOnRegisteredButton() {
	Register.click();
	
}
public void VerifyNewRegisterd() {
	Install.click();
}
}



