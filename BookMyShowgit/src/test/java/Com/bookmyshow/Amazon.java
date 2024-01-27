package Com.bookmyshow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91797\\eclipse-workspace\\BookMyShow\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		R_Pages Rp=new R_Pages(driver);
		Rp.clickSignBtn2();
		Rp.ClickCreateAcc();
		Rp.enterFirstName("Pranay Ikhar");
		Rp.enterMNumber("9876543212");
		Rp.enterEmail("pranay.ikhar1@gmail.com");
		Rp.enterPassword("abc@123");
		Rp.clickCreateAcc1();
		
	}

}
