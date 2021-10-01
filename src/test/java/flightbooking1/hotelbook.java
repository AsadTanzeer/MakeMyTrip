package flightbooking1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class hotelbook {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
			
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")).click();
	    driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("city")).click();
		WebElement ls = driver.findElement(By.cssSelector("input[placeholder='Enter city/ Hotel/ Area/ Building']"));
		ls.click();
		ls.sendKeys("Delhi");
	    ls.sendKeys(Keys.ARROW_DOWN);
	    ls.sendKeys(Keys.ENTER);	
		
	    driver.findElement(By.xpath("//div[@aria-label='Wed Oct 27 2021']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Oct 30 2021']")).click();
		
		Thread.sleep(3000);
		
		  driver.findElement(By.id("guest")).click();
		  driver.findElement(By.xpath("//ul[@data-cy='adultCount']//li[contains(text(),'3')]")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[2]/button[2]")).click();
		  driver.findElement(By.id("hsw_search_button")).click();
		  driver.findElement(By.id("htl_id_seo_200901081324274244")).click();
		  driver.findElement(By.id("detpg_headerright_book_now")).click();
}
}