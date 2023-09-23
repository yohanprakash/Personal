package GridConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitlePage {
	
	public WebDriver driver;
	
  @Test
  @Parameters("browser")
  public void gridC(String browserName) {
	  
	  if(browserName.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	  
	  else if(browserName.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }
	  
	  else if (browserName.equalsIgnoreCase("safari")) {
		  WebDriverManager.safaridriver().setup();
		  driver = new SafariDriver();
	  }
	  
	  else if (browserName.equalsIgnoreCase("IE")) {
		  WebDriverManager.iedriver().setup();
		  driver = new InternetExplorerDriver();
		  
	  }		  
	  }
	
}
