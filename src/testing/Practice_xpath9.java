package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_xpath9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> a = driver.findElements(By.xpath("//td[4][contains(text(),'demo')]"));
		int rows = a.size();
		
		for(int i=0;i<=rows-1;i++)
		{
			String s = a.get(i).getText();
			if(s.contains("demo"))
			{
			List<WebElement> c = driver.findElements(By.xpath("//*[@id=\"VisitingTable\"]/tbody/tr/td[1]"));
			c.get(i).click();
			}
				
		}

		

	}

}
