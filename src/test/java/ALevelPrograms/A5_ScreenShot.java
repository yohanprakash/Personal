package ALevelPrograms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_ScreenShot {
	
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		 
		
String ATM ="Orange";
		
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\Automation\\Selenium Classes\\My Practise Programs"+ATM+".png"));
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
      driver.manage().window().maximize();
      
      String ATM ="Grape";
      
      File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\Automation\\Selenium Classes\\My Practise Programs"+ATM+".png"));
      
  }

  @AfterTest
  public void afterTest() {
  }

}
