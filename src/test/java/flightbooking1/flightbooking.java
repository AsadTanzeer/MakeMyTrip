package flightbooking1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flightbooking {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.makemytrip.com/");
				driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("a[href='https://www.makemytrip.com/flights/']")).click();	
				Thread.sleep(3000);
				driver.findElement(By.id("fromCity")).sendKeys("Hyderabad");
				Thread.sleep(3000);
				Select sc=new Select(driver.findElement(By.xpath("//input[@placeholder='From']")));
				sc.selectByVisibleText("Rajiv Gandhi International Airport");
				Thread.sleep(3000);


	}

}
