import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search_kfc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver\\chromedriver.exe");
		//access the url case
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
		WebDriver w = new ChromeDriver(option);
		w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		w.get("https://www.eazydiner.com/");
		//search case
		WebElement ws=w.findElement(By.id("home-search"));
		ws.click();
    	ws.sendKeys("kfc");
    	Thread.sleep(2000);
    	ws.submit();
     	w.findElement(By.xpath("//button[@id='apxor_search']")).click();
     	w.findElement(By.xpath("//*[@id=\"restaurants\"]/div[6]/div/div[2]/a/h3[1]")).click();
     	System.out.println(w.getTitle());
	}

}
