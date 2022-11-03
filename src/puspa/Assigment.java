package puspa;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assigment {

	@Test
	
	public void MIDI() {
		//System.setProperty("webdriver.chrome.driver","D:\\Chromedrivernew\\chromedriver_win32 (2)\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver93_SeleniumFile\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("scroll(0,5700)");
		
		WebElement realesDate=d.findElement(By.xpath("//a[contains(text(),'December 17, 2021 (United States)')]"));
		
		String name=realesDate.getText();
		System.out.println(name);
		Assert.assertEquals(name,"December 17, 2021 (United States)");
		
		WebElement countyName=d.findElement(By.linkText("India"));
		String countyNameText=countyName.getText();
		System.out.println(countyNameText);
		Assert.assertEquals(countyNameText,"India");
		
	}	
}