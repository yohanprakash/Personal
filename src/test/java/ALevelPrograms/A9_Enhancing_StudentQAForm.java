package ALevelPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class A9_Enhancing_StudentQAForm {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bANNU111");
	  
	  driver.findElement(By.id("lastName")).sendKeys("Bimavaram111");
	  
	  driver.findElement(By.id("userEmail")).sendKeys("bannuwest111@gmail.com");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("userNumber")).sendKeys("9912345678");
	  Thread.sleep(3000);
	  
	  //Calender 
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(3000);
	  
	  //Selecting December
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("December");
	  Thread.sleep(3000);
	  
      //Selecting year 1990		  
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1990");
	  Thread.sleep(3000);
	  
	  //Click on dec 25 Date.
	  driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, December 25th, 1990']")).click();
	  Thread.sleep(8000);
	  
	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).sendKeys("Maths");
	  Thread.sleep(3000);
	  
	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //Explicitly Wait: 
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='hobbies-checkbox-2']")));
	 
	  //hobbies
	  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
	  Thread.sleep(3000);
	  
		  //Select picture
		  driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("D:\\Automation\\Selenium Classes\\My Practise ProgramsGrape.png");
		  Thread.sleep(3000);
	  
	  //CurrentAddress
	  driver.findElement(By.id("currentAddress")).sendKeys("Mumbai City Views");
	  

		  //Shift to Next as "TAB" works
		  driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
		  
		  
		 
		  //Selecting state 
		  driver.switchTo().activeElement().sendKeys("NCR");
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  Thread.sleep(5000);
		  
		  //Selecting City 
		  driver.switchTo().activeElement().sendKeys("Noida");
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  Thread.sleep(5000);
		  
		  //Click on Submit button
		  driver.findElement(By.xpath("//button[@id='submit']")).click();
		  Thread.sleep(3000);
		  
		  //Finally click on Close button
		  driver.findElement(By.id("closeLargeModal")).click();
		  Thread.sleep(5000);

	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-form");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
