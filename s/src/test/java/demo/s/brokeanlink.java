package demo.s;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class brokeanlink {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		int rescode =200;
		int count =0;
		List<WebElement> List = driver.findElements(By.tagName("a"));
		for(WebElement v:List)
		{
			String	url=v.getAttribute("href") ;
			try {
				URL urllink = new URL(url);
				HttpURLConnection a=(HttpURLConnection)urllink.openConnection();
				a.setRequestMethod("HEAD");
				rescode =a.getResponseCode();
				if (rescode>400) {
					System.out.println(url+"brokenlink");
					count++;

				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println(count+"totol broken linkcount");
			}
		}
		
		
	}


}
