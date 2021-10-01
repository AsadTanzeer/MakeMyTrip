package flightbooking1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.SendKeys;


public class hotels {
	
	

		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.makemytrip.com/");
			
				
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")).click();
			
			//Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
			
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//span[normalize-space()='City / Hotel / Area / Building']")).click();
			
			//driver.findElement(By.cssSelector("//input[@id='city']")).click();
			
			WebElement Field = driver.findElement(By.cssSelector("input[placeholder='Enter city/ Hotel/ Area/ Building']"));
			//Field.click();
			Field.sendKeys("Delhi");
			Thread.sleep(2000);
			Field.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			Field.sendKeys(Keys.ENTER);	
				
			driver.findElement(By.cssSelector("div[aria-label='Fri Oct 15 2021']")).click();
			driver.findElement(By.cssSelector("div[aria-label='Thu Oct 21 2021']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#htl_id_seo_201105251236115981")).click();
			Thread.sleep(3000);
			
				
		//	driver.findElement(By.xpath("//a[normalize-space()='BOOK THIS NOW']")).click();
		
			driver.findElement(By.cssSelector("a[class='primaryBtn']")).click();
			driver.findElement(By.xpath("//div[@id='room0']//div[1]//div[2]//div[1]//div[1]//div[2]//a[1]")).click();
			driver.findElement(By.xpath("//input[@id='fName']")).sendKeys("Raman");
			driver.findElement(By.xpath("//input[@id='lName']")).sendKeys("Singh");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramansingh@gmail.com");
			driver.findElement(By.xpath("//input[@id='mNo']")).sendKeys("9864012345");
			driver.findElement(By.xpath("//a[contains(text(),'Book @ ₹ 0')]")).click();
			
			
			
			
			
			

		}

	}


