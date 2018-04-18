package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_xpath2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> a = driver.findElements(By.xpath("//tr/td[7][text()<='5']/preceding-sibling::td[3]"));
		int rows = a.size();
		System.out.println(rows);
		
		//List<WebElement> b = driver.findElements(By.xpath("//*[@id=\"VisitingTable\"]/tbody/tr/td[4]"));

		for(int i=0;i<=rows-1;i++)
		{
			String data= a.get(i).getText();
			
			System.out.println(data);
				
			
			
				
		}

		
		
	}

}
