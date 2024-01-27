package Com.bookmyshow;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration_page {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91797\\eclipse-workspace\\BookMyShow\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\\\Users\\\\91797\\\\Pictures\\\\Camera Roll\\Screenshot_hex.png\\");
		FileUtils.copyFile(src, dest);
		
		
		
		//          ----  Verifying Valid And Invalid Naming Format  ----
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Pranay Ikhar");
		
		// Invalid Naming Format but Proceeds for the next step 
		//driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("@123");
		
		//Invalid First Name But Proceeds for the next step
		//driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("123Pranay Ikhar");
		Thread.sleep(3000);
		
		//      ----  Verifying Valid And Invalid Mobile Number  ----
		
		//Valid Phone Number /Work As Expected
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8766025710");
		
		//Invalid Phone Number (only 9 Digits)/ Proceeds For Next Entry
		//driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("984422881");
		
		//Invalid Phone Number / Work As Expected
		//driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("@#abc77267");
		Thread.sleep(3000);
		
		
		//      ----  Verifying Valid And Invalid Email  ----
		
		//valid Email / Work As Expected
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("ikhar.pranay0@gmail.com");
		

		//Invalid Email / Proceeds for Next Step
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("ikhar.pranay01@gmil.com");
		
		//Invalid Email(Without ' @ ') / Work As Expected
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("ikhar.pranay01gmail.com");
		
		Thread.sleep(3000);
		
		

		//      ----  Verifying Valid And Invalid Password  ----
		
		// Valid Password(More than 6 characters) / Work As Expected
		//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("AmaZon&098");
		
		// Invalid Password(Less than 6 characters) / Work As Expected
		// driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Ama&8");
		

		// Valid Password(Equals 6 characters) / Work As Expected
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amz&08");
		
		
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
    	driver.switchTo().frame("cvf-aamation-challenge-iframe");
		driver.switchTo().frame("aacb-arkose-frame");
		driver.switchTo().frame(0);
		driver.switchTo().frame("game-core-frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Start Puzzle']")).click();
		
//		Thread.sleep(5000);
//		TakeScreenshot t=(TakeScreenshot)driver;
//		File src=t.getScreenshotAs(Output.File);
//		File dest =new File("C:\\Users\\91797\\Pictures\\Camera Roll");
//		FileUtil.copyFile(src,dest);
//	    driver.findElement(By.xpath("//input[@ id ='auth-verify-button']")).click();
//	    
	    //TakesScreenshot t1=(TakesScreenshot)driver;
//		File src1=t.getScreenshotAs(OutputType.FILE);
//		File dest1=new File("C:\\\\Users\\\\91797\\\\Pictures\\\\Camera Roll\\Screenshot_hexa1.png\\");
//		FileUtils.copyFile(src, dest);
//		
	}

}

