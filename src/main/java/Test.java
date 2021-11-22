import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver\\chromedriver.exe");
		//access the url case
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
	    option.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver w = new ChromeDriver(option);
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.eazydiner.com/");
		w.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[3]/a/div/div[1]/img")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id=\"restaurants\"]/div[7]/div/div[2]/a")).click();
		Thread.sleep(2000);
		System.out.println(w.getTitle());
		System.out.println(w.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div[2]/p[1]")).getText());
		w.findElement(By.xpath("/html/body/div[12]/div/div[1]/div[3]/p[5]/a")).click();
		
		
		//w.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[2]/div/div[3]")).click();
		//Thread.sleep(3000);
		//w.findElement(By.xpath("/html/body/div[20]/div/table/tbody/tr[5]/td[2]")).click();
		//w.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[3]/div[3]/div/div[3]/div[1]/div[1]/div[8]/a/img")).click();
		//Thread.sleep(3000);
		//w.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div")).click();
//		w.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[3]/div[3]/div/div[3]/div[1]/div[2]/div[2]/div[2]/svg/use")).click();
//		w.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[3]/div[3]/div/div[3]/div[1]/div[1]/div[2]/a/img")).click();
//		

	}

}
