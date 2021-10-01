package flightbooking1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginwithGoogle {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.makemytrip.com/");
				driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='makeFlex googleLoginBtn flexOne paddingR10']")).click();
				Thread.sleep(3000);
				
				

	}
}
