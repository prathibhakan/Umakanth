package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_xpath6 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> a = driver.findElements(By.xpath("//*[@id=\"VisitingTable\"]/tbody/tr/td[8]"));
		int rows = a.size();
		
		for(int i=0;i<=rows-1;i++)
		{
			String data= a.get(i).getText();
			System.out.println(data);
			
			if(data.contentEquals("Accepted"))
			{
				List<WebElement> b = driver.findElements(By.xpath("//*[@id=\"VisitingTable\"]/tbody/tr/td[2]"));
				int rows_id = b.size();
				String data_id = b.get(i).getText();
				System.out.println(data_id);
			}
			
		}
		
		
		
		
	}
	

}
