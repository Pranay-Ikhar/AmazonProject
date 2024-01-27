
	package Com.bookmyshow;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class R_Pages {
		
		//Declaration
		
		@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
		WebElement txtSignBtn;

		@FindBy(xpath="//a[@id='createAccountSubmit']")
		WebElement txtCreateAccBtn;
		
		
		@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
		WebElement txtFirstName;
		

		@FindBy(xpath="//*[@id=\"ap_phone_number\"]")
		WebElement txtMNumber;
		

		@FindBy(xpath="//input[@id='ap_email']")
		WebElement txtEmail;
		
		
		
		@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[4]/div/input")
		WebElement txtPassWord;
		
		@FindBy(xpath="//*[@id=\"continue\"]")
		WebElement txtBtn;
		
		//Initialization
		
		 R_Pages(WebDriver driver)
		 {
			 
			 PageFactory.initElements(driver,this);
			 
			 
		 }
			
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
		 public void clickCreateAcc1() {
			 
			 txtBtn.click();
			
		}
		
	

}
