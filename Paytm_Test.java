package SeleniumDemo.SeleniumDemo3;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paytm_Test {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vijay\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.xpath("/html/body/div/section[4]/div/div/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/input")).sendKeys("Delhi");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[1]/input")).sendKeys("Bengaluru");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datePickerOnward\"]/div/div/input")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"datePickerOnward\"]/div[2]/div/div[2]/table/tbody/tr[5]/td[5]/div/div/div")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)", "");
		driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[8]/div/button")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div[1]/div[9]/a"));
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		ele.click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>  itr=handles.iterator();
		String str="";
		while(itr.hasNext())
		{
			str=itr.next();
		}
		driver.switchTo().window(str);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)", "");
		String FlightName=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		String DepTime=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]")).getText();
		String DepDate=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]")).getText();
		String ArrTime=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[2]")).getText();
		String ArrDate=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[3]")).getText();
		System.out.println("FlightName: "+FlightName);
		System.out.println("Departure Time: "+DepTime);
		System.out.println("Departure Date: "+DepDate);
		System.out.println("Arrival Time: "+ArrTime);
		System.out.println("Arrival Date: "+ArrDate);
		
		
		
		
		
		
	}


}
