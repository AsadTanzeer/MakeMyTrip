package flightbooking1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class fb1 {
	WebDriver driver;
  @Test(priority=1,description="Checking website and Flight button")
  public void fbpage1() throws Exception{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='https://www.makemytrip.com/flights/']")).click();	
		Thread.sleep(1000);
		
  }
  
  
  @Test (priority=2, description="Checking From Location")
  public void fbpage2() throws Exception{
	  
	  driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		
		List<WebElement>locationList=driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText'"));
		
		for(int i=0;i<locationList.size();i++)
		{
			String text=locationList.get(i).getText();
			System.out.println("Text is"+text);
			if(text.contains("Hyderabad"))
			{
				locationList.get(i).click();
				break;
			}
		}
		
  }
		
  @Test (priority=3, description="Checking To Location")
  public void fbpage3() throws Exception{
	  
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween']/div/input")).sendKeys("Dubai");
		Thread.sleep(3000);
		
		List<WebElement>location2List=driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText"));
		Thread.sleep(2000);
		for(int i=0;i<location2List.size();i++)
		{
			String text=location2List.get(i).getText();
			System.out.println("Text is"+text);
			if(text.contains("Dubai"))
			{
				location2List.get(i).click();
				break;
			}
		}
  }
  
  @Test (priority=4, description="Checking Departing Date")
  public void fbpage4() throws Exception{
		driver.findElement(By.xpath("//div[@aria-label='Wed Oct 13 2021']")).click();
		Thread.sleep(1000);
  }
  
  @Test (priority=5, description="Checking Return date")
  public void fbpage5() throws Exception{
		driver.findElement(By.xpath("//div[@class='widgetSection appendBottom40 primaryTraveler']//div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Fri Oct 22 2021']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		Thread.sleep(3000);
  }
		
  @Test (priority=6, description="Selecting Flight")
  public void fbpage6() throws Exception{
	  
	  List<WebElement>flightList=driver.findElements(By.xpath("//button[@class='ViewFareBtn  text-uppercase ']"));
		
	  flightList.get(0).click();
	  
	  try{
		  driver.findElement(By.id("bookbutton-RKEY:e006bf2a-fe4f-45bf-9f59-ef05346b76c3:43_0")).click();
			Thread.sleep(1000);
	  }
	  catch(Exception NoSuchElementException) 
	  {
		  try{
			  driver.findElement(By.xpath("//button[@class='buttonPrimary buttonBig  lato-black button']")).click();
			  Thread.sleep(1000);
		  }
		  catch(Exception NoSuchElementException1){
			  try {
				  driver.findElement(By.xpath("//button[@class='splitFooterButton button buttonPrimary buttonBig ']")).click();
				  Thread.sleep(1000);
			  }
			  catch(Exception NoSuchElementException2)
			  {
				  driver.findElement(By.xpath("//button[@class='button corp-btn latoBlack buttonPrimary fontSize13  ']")).click();
				  Thread.sleep(1000);
			  }
		  
	  }
	  
	  }
	
	  
	  	
  }

  
  @Test (priority=7, description="Switching to new window")
		  public void fbpage7() throws Exception{
	   
	
	  
	  driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		  
  }
  
  @Test (priority=8, description="giving credentials and clicking continue")
  public void fbpage8() throws Exception{
	  try {
		  driver.findElement(By.xpath("//input[@value='yes']")).click();
		  Thread.sleep(1000);
		  //driver.findElement(By.xpath("//span[contains(@data-ischecked,'true')]//span[contains(@class,'inner')]")).click();
		  //Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		  Thread.sleep(1000);
		  
	  }
	  finally
	  {
		  try{driver.findElement(By.xpath("//button[@class='addTravellerBtn']")).click();
		  Thread.sleep(1000);}
		  finally {
		  driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("Rajini");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kanth");
		  Thread.sleep(1000);
		 
		  /*
		   Select select = new Select(driver.findElement(By.xpath("//div[@class='trvl-formfield-col']//div//div[1]//label[1]")));
    select.deselectAll();
    select.selectByVisibleText("MALE"); 
    Thread.sleep(1000);
		   
		  WebElement ls = driver.findElement(By.xpath("//div[@class='dropdown__value-container css-1hwfws3']"));
			ls.click();
			ls.sendKeys("Ind");
		    ls.sendKeys(Keys.ARROW_DOWN);
		    ls.sendKeys(Keys.ENTER);	
		  */
		  driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile No')]")).sendKeys("9876543210");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rajinikanth007@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@data-ischecked='true']//span[@class='inner']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		  Thread.sleep(1000);
		  }
	  }
	  
	 
	  
  }
		
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
				
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(2000);
	  //driver.quit();
  }

}
