package SeleniumDemo.SeleniumDemo3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVWriter;

public class Paytm_Test {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[4]/div/div/div/div[2]")).click();
		driver.findElement(By.xpath("(//*[@id=\"text-box\"])[1]")).sendKeys("Delhi");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@id=\"text-box\"])[2]")).sendKeys("Bengaluru");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datePickerOnward\"]/div/div/input")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datePickerOnward\"]/div[2]/div/div[2]/table/tbody/tr[5]/td[5]/div")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)", "");
		driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[8]/div/button")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[5]/div[1]/div[9]/a"));
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
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"flights-review-traveller-details\"]/div[2]/div[2]/div/div/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/span/div/div")).click();
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.xpath("//*[@id=\"flights-review-traveller-details\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id=\"text-box\"])[1]")).sendKeys("Durga");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id=\"text-box\"])[2]")).sendKeys("prasad");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[1]/div/div[2]/div[1]")).click();
		Thread.sleep(3000);
		List<WebElement> Flights=driver.findElements(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[1]/div[1]/div"));
		for(int i=0;i<Flights.size();i++)
		{
			WebElement element=driver.findElement(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[1]/div[1]/div[@id="+i+"]"));
			element.click();
			List<WebElement> list=driver.findElements(By.className("_2AV5"));
			ArrayList<String> arr=new ArrayList<String>();
			System.out.println("Flight:  "+i);
			for(int j=0;j<list.size();j++)
			{
				System.out.println(list.get(j).getText());
				
			}
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		

		
	}


}
