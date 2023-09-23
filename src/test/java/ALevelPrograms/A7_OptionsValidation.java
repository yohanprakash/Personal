package ALevelPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_OptionsValidation {
	
	public WebDriver driver;
  @Test
  public void options() {
	  
	  List<WebElement> allvalues  = new Select(driver.findElement(By.id("day"))).getOptions();
		
		System.out.println(allvalues.get(5).getText());
		
		//Print all values from A to Z(Starting to ending)
		
		for (int i=0; i<allvalues.size(); i++) {
			
			System.out.println(allvalues.get(i).getText());
			

	if (allvalues.get(i).getText().contains("15")) {
	  
	  System.out.println(allvalues.get(i).getText());
		     
			System.out.println("its passed 15");
			
	}
		  
		else {
			System.out.println("Not Matched");
			
		}
		}

	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
