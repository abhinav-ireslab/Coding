package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {
	
	static WebDriver driver;
	
public static void main(String[] arg) {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\E2E\\Desktop\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://paytmmall.com/menswear_tshirts-llpid-179733?use_mw=1&src=store&from=storefront&page=1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	JavascriptExecutor jse = ((JavascriptExecutor)driver);
	jse.executeScript("window.scrollBy(0,800)");
	
	
	driver.findElement(By.xpath("//div[contains(text(),'Material')]"));
	
	/*WebElement list = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[2]/div/div/div[4]/div/div[2]/div/div"));
	driver.switchTo().frame(list);*/
	
	
	//List checkbox = driver.findElements(By.xpath("//input[@id='filter-material-1' and @type='checkbox']"));
	
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0; i<checkbox.size(); i++)
		
	{
		if(checkbox.get(i).isSelected())
		{
			//checkbox.get(i-1).click();
			System.out.println("Selected");
		}
		
		else
		{
			checkbox.get(i).click();
			System.out.println("No matches");
		}
		
	}
		
}
}