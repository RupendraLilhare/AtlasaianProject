package puspa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Traverse {
	@Test
	public static void collomn()
	{
    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver93_SeleniumFile\\chromedriver_win32 (3)\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    d.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
    d.manage().window().maximize();
    
   List<WebElement> ele=d.findElements(By.xpath("//table[contains(@id,'customers')]//th"));
   
   System.out.println(ele.size());
   
   Assert.assertEquals(ele.size(),5);
   boolean status=false;
   for(WebElement clmn:ele)
   {
	 String value=clmn.getText();
	 System.out.println(value);
	 
	 if(value.contains("Country"))
	 {
		 status=true;
		 break;
	 }
   }
   Assert.assertTrue(status);
    
}
}