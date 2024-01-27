package Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.AmazonLogin;
import Util.DriverUtils;
import Util.ExcelData;

public class LoginTest {
	@Test(priority=0)
	public void registration() throws Exception {
		DriverUtils.getDriver().get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=11916667305625660502&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		AmazonLogin lp=new AmazonLogin();
		Thread.sleep(4000);
		lp. clickSignBtn2();
		lp.ClickCreateAcc();
		lp.enterFirstName("Pranay");
		lp.enterMNumber("8767318377");
		lp.enterEmail("ikhar.pranay1@gmail.com");
		lp.enterPassword("AmaZon@123");
		lp.clickCreateAcc1();
		lp.startpuzzle();	
		Thread.sleep(15000);
		lp.amzaccbtn();
		String str1 = "Amazon Phone Verification";
		Assert.assertEquals(DriverUtils.getDriver().getTitle(),str1);
	
		}
	
	@Test(priority=1)
	public void verifyLogin() throws Exception {
		DriverUtils.getDriver().get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=11916667305625660502&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		AmazonLogin lp=new AmazonLogin();
		Thread.sleep(4000);
		lp. clickSignBtn2();
		lp.enterEmailLg("pranayikhar712@gmail.com");
		lp.clickCnt();
		lp.enterPasswordLg("Amz@098");
		lp.clickCnt1();
		String str1 = "Amazon Sign In";
		Assert.assertEquals(DriverUtils.getDriver().getTitle(),str1);
	}
		

}
