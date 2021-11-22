import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Destinations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver\\chromedriver.exe");
		
		
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");
		driver.findElement(By.xpath("//*[@id=\"help\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"bg-white\"]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("/html/body/div[13]/div/div[1]/div[1]/p[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/div/a/div[1]/img")).click();
//		Set<String>ids = driver.getWindowHandles();
//       Iterator<String> it=ids.iterator();
//       String Parentid=it.next();
//       Thread.sleep(5000L);
//       driver.switchTo().window(Parentid);
      // driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();

	}

}
