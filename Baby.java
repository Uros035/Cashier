import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baby {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.777baby.com/");
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]")).click();
		driver.findElement(By.id("JapanLoginForm_username")).sendKeys("Luckytest");
		driver.findElement(By.id("JapanLoginForm_password")).sendKeys("Test123");
		driver.findElement(By.id("JapanLoginForm_submit")).click();
		Thread.sleep(2000L);
		//WebElement staticDropdown = driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/div[2]/span"));
		//Select dropdown =new Select(staticDropdown);
		//dropdown.selectByIndex(2);
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/div[2]/span")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div[4]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/section/span/a[2]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div/div/main/section/section/div/div[2]/div[1]/div/div")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("25");
		driver.findElement(By.xpath("/html/body/div/div/main/section/section/div/div[2]/div[2]/section/form/button")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000L);
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//da uzmem sliku ekrana
		FileUtils.copyFile(src,new File("C:\\Screenshot selenium\\screenshot.png"));

	}
}
