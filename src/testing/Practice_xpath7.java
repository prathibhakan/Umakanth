package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_xpath7 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> a = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[3][text()='Vinod']/following-sibling::td[2][text()='Analyst']"));
		int rows = a.size();
	 
		System.out.println(rows);
		
		for(int i=0;i<=rows-1;i++)
		{
			String s = a.get(i).getText();
			
			System.out.println(s);
			List<WebElement> c = driver.findElements(By.xpath("//*[@id=\"VisitingTable\"]/tbody/tr/td[1]"));
			c.get(i).click();
			
				
		}

	}
	}
