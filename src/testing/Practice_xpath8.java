package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_xpath8 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.xpath("//tr/td[4][starts-with(text(),'demo')]/preceding-sibling::td[3]/input"));
		int rows = a.size();
		System.out.println(rows);
	
		
		for(int i=0;i<=rows-1;i++)
		{
			a.get(i).click();
			
				
			
			
		}

		

	}

}
