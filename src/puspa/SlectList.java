package puspa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SlectList {

	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver93_SeleniumFile\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://fatcow.com/");
	d.manage().window().maximize();
	
   WebElement  ele=d.findElement(By.id("countrySelect"));
   Select e=new Select(ele);
   e.selectByValue("CAD");
	
	}
}
