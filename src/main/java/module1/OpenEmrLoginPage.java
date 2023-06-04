package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenEmrLoginPage {
@FindBy (xpath="//input[@id='authUser']")private WebElement UN;
@FindBy (xpath="//input[@id='clearPass']")private WebElement PWD;
@FindBy (xpath="//button[@id='login-button']")private WebElement Login;
public OpenEmrLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);}
public void inputUN(String name) {
	UN.sendKeys(name);}
public void inputPWD(String Pass) {
	PWD.sendKeys(Pass);}
public void clickOnLoginButton() {
	Login.click();}}
