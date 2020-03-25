package Testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class links {

	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		String url= "https://myaccount.e2enetworks.com";
		HttpsURLConnection huc = null;
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String homepage ="https://myaccount.e2enetworks.com";
		int rescode = 200;
		System.out.println(driver);
		driver.get(homepage);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
		url = it.next().getAttribute("href");

		if(url==null || url.isEmpty())
		{
		System.out.println("Empty url");
		continue;
		}

		if(!url.startsWith(homepage))

		{
		System.out.println("Url belong to other domain");
		continue;
		}

		try {

		huc = (HttpsURLConnection)(new URL(url).openConnection());
		huc.setRequestMethod("HEAD");
		huc.connect();

		rescode = huc.getResponseCode();

		if(rescode>=400)
		{
		System.out.println("broken link");
		}

		else
		{
		System.out.println("Valid link");
		}

		}
		catch(Exception e){

			e.printStackTrace();
		}
		//driver.quit();
    }
  }
}