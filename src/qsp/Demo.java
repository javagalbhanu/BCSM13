package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void testDemo() throws MalformedURLException{
		URL node=new URL("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(node,DesiredCapabilities.chrome());
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
//		driver.quit();
	}
}
