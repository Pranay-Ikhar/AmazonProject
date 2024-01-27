package POM;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLogin extends BasePage{
	
	//Declaration
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement txtSignBtn;

	@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
	WebElement txtCreateAccBtn;
	
	@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	WebElement txtFirstName;
	
	@FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	WebElement txtMNumber;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement txtPassWord;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement txtBtn;
	
	@FindBy(xpath="//button[text()='Start Puzzle']")
	WebElement txtStrpz;
	
	@FindBy(xpath="//*[@id=\"auth-verify-button\"]")
	WebElement txtAccbtn;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement txtemaillg;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement cntbtn;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement txtpasslg;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement cnt1btn;
	
	
		
	 //Utilization
	 
	 
	 public void clickSignBtn2() {
		 
		 txtSignBtn.click();
		 
	 }
	 public void ClickCreateAcc() {
		 
		 txtCreateAccBtn.click();
		
	}
	 public void enterFirstName(String str) {
		 
		 txtFirstName.sendKeys(str);
		
	}
	 public void enterMNumber(String a) {
		 
		 txtMNumber.sendKeys(a);
		
	}
	 public void enterEmail(String a) {
		 
		 txtEmail.sendKeys(a);
		
	}
	 public void enterPassword(String a) {
		 
		 txtPassWord.sendKeys(a);
		
	}
	 public void enterEmailLg(String a) {
		 
		 txtemaillg.sendKeys(a);
		
	}
	 public void clickCnt() {
		 
		 cntbtn.click();;
		
	}
	 public void enterPasswordLg(String a) {
		 
		 txtpasslg.sendKeys(a);
		
	}
	 public void clickCnt1() {
		 
		 cnt1btn.click();;
		
	}		
	public void clickCreateAcc1() {
		 
		 txtBtn.click();
		
	}
	 public void startpuzzle() {
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.switchTo().frame("cvf-aamation-challenge-iframe");
			driver.switchTo().frame("aacb-arkose-frame");
			driver.switchTo().frame(0);
			driver.switchTo().frame("game-core-frame");
			//Thread.sleep(2000);
			 txtStrpz.click();
			 			
	}
	 public void amzaccbtn() {
		txtAccbtn.click();
		
	} 
	 
}
