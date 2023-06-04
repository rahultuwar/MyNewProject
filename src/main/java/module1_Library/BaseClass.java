package module1_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;
public  void openEmrUrl() {
	driver=new ChromeDriver();
	driver.get("https://www.open-emr.org/");
}
}
