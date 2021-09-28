import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zipang {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zipangcasino.com/");
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]")).click();
		driver.findElement(By.id("JapanLoginForm_username")).sendKeys("test99");
		driver.findElement(By.id("JapanLoginForm_password")).sendKeys("Test123");
		driver.findElement(By.id("JapanLoginForm_submit")).click();
		Thread.sleep(2000L);
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//da uzmem sliku ekrana
		FileUtils.copyFile(src,new File("C:\\Screenshot selenium\\screenshot3.png"));
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/div[2]/span")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("/html/body/div[1]/div/main/section/section/span/a[2]")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("/html/body/div[1]/div/main/section/section/div/div[2]/div[1]/div/div")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("amount")).sendKeys("21");
		driver.findElement(By.xpath("/html/body/div[1]/div/main/section/section/div/div[2]/div[2]/section/form/button")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/form/fieldset/div[2]/div/button")).click();
		Thread.sleep(4000L);
		File src1=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//da uzmem sliku ekrana
		FileUtils.copyFile(src1,new File("C:\\Screenshot selenium\\screenshot4.png"));
		Thread.sleep(2000L);
		driver.close();
		

	}

}
