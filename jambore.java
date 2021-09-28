import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jambore {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.casinojamboree.com/");
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]")).click();
		driver.findElement(By.id("JapanLoginForm_username")).sendKeys("JAR20045790");
		driver.findElement(By.id("JapanLoginForm_password")).sendKeys("Test123");
		driver.findElement(By.id("JapanLoginForm_submit")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"account-menu\"]/li[2]/a")).click();
		Thread.sleep(4000L);
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//da uzmem sliku ekrana
		FileUtils.copyFile(src,new File("C:\\Screenshot selenium\\screenshot3.png"));
		Thread.sleep(2000L);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(parentId);
		driver.switchTo().window(childId);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/ul[1]/li/div/div/ul/li[3]/a")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//*[@id=\"accordion__heading-1\"]/div")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div/div/main/section/section/div/div[2]/div[2]/section/form/span/div/span/input")).sendKeys("55");
		driver.findElement(By.xpath("//*[@id=\"accordion__panel-1\"]/section/form/button")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div/div/main/section/section/div/div[2]/div[2]/section/form/button")).click();
		Thread.sleep(4000L);
		File src1=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//da uzmem sliku ekrana
		FileUtils.copyFile(src1,new File("C:\\Screenshot selenium\\screenshot4.png"));
		Thread.sleep(2000L);
		driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(2000L);
		driver.close();

	}

}
