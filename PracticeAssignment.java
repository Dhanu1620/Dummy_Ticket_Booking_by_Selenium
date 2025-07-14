package WebDriver;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeAssignment {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.dummyticket.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 //Book Ticket
		 driver.findElement(By.xpath("//a[contains(text(),'Buy Ticket')]")).click();
		 Thread.sleep(3000);
		 //First Person Details
		 //FiratName and LastName
		 driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Dhanushree");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Sridhar");
		 Thread.sleep(1000);

		 //Addtional Information
		 driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("This dummy ticket is for visa application purposes only. Kindly ensure all details are correct and reflect an onward and return journey.");
		 Thread.sleep(1000);
		 
		 //DOB
		 String reqYear = "2004";
		 String reqMonth = "Apr";
		 String reqDate = "16";
		 
		//Selecting Year in DropDowm
		 driver.findElement(By.xpath("//input[@id='dob']")).click();
		 Thread.sleep(1000);
		 WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		 Select selectYear = new Select(year);
		 selectYear.selectByVisibleText(reqYear);
		 
		//Selecting Month in DropDowm
		 driver.findElement(By.xpath("//input[@id='dob']")).click();
		 WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		 Select selectMonth = new Select(Month);
		 selectMonth.selectByVisibleText(reqMonth);
		 
		//Selecting Date 
		List <WebElement> alldates = driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//tbody//tr//td"));
		for(WebElement dt:alldates)         
		{
			if(dt.getText().equals(reqDate))
			{
				dt.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		//Sex
		driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		Thread.sleep(1000);
		
		
		//Add one more Passenger
		driver.findElement(By.xpath("//input[@id='addmorepax']")).click();
		
		//Select DropDown
		//Click the dropdown (if it’s a custom dropdown)
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='addpaxno']"));
		Select drpCnt = new Select(dropdown);

		// 1)SelectbyVisibilityText() 
		//droCnt.selectByVisibleText("France");
				
		// 2)SelectByValue()
		//droCnt.selectByValue("uk");
				
	    // 3)SelectByIndex()
		drpCnt.selectByIndex(1);
		Thread.sleep(1000);
		
		//Second Person Details
		//FristNAme and LAstNAme
		driver.findElement(By.xpath("//input[@id='travname2']")).sendKeys("Sarvarshni");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='travlastname2']")).sendKeys("Sridhar");
		Thread.sleep(1000);
		
		//Dob
		String Yr = "2005";
		String Smonth = "Aug";
		String Sdate = "20";
				 
		//Selecting Year in DropDowm
		driver.findElement(By.xpath("//input[@id='dob2']")).click();
		
		WebElement Syear = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectSYear = new Select(Syear);
		selectSYear.selectByVisibleText(Yr);
				 
		//Selecting Month in DropDowm
		driver.findElement(By.xpath("//input[@id='dob2']")).click();
		WebElement SMon = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selectSMonth = new Select(SMon);
		selectSMonth.selectByVisibleText(Smonth);
				 
		//Selecting Date 
		List <WebElement> alldtes = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement ds:alldtes)         
		{
			if(ds.getText().equals(Sdate))
			{
				ds.click();
				break;
			}
		}
		
		
		//Sex
		driver.findElement(By.xpath("(//input[@id='sex2_2'])[1]")).click();
		Thread.sleep(1000);
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='paxtype2']"));
		Select drpCnt1 = new Select(dropdown1);

		// 1)SelectbyVisibilityText() 
		//droCnt.selectByVisibleText("France");
				
		// 2)SelectByValue()
		//droCnt.selectByValue("uk");
				
	    // 3)SelectByIndex()
		drpCnt1.selectByIndex(1);
		Thread.sleep(1000);
		
		//Trip Type
		driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
		Thread.sleep(1000);
		
		//Current Loc to Destination
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Greek");
		Thread.sleep(1000);
		//Departure Date and Return Date
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		
		//DepartureDate
		String DYear = "2025";
		String DMonth = "Jul";
		String Ddate = "15";
				
		WebElement DepYr = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectDepYear = new Select(DepYr);
		selectDepYear.selectByVisibleText(DYear);
						 
		//Selecting Month in DropDowm
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		WebElement DepMon = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selectDepMonth = new Select(DepMon);
		selectDepMonth.selectByVisibleText(DMonth);
						 
		//Selecting Date 
		List <WebElement> Depdtes = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement ds:Depdtes)         
		{
			if(ds.getText().equals(Ddate))
			{
				ds.click();
				break;
			}
		}
		
		//Return Date
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		
		//Return Date
		String RYear = "2025";
		String RMonth = "Aug";
		String Rdate = "10";
						
		WebElement RtnYr = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectRtnYear = new Select(RtnYr);
		selectRtnYear.selectByVisibleText(RYear);
								 
		//Selecting Month in DropDowm
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		WebElement RtnMon = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selectRtnMonth = new Select(RtnMon);
		selectRtnMonth.selectByVisibleText(RMonth);
								 
		//Selecting Date 
		List <WebElement> Rtndtes = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement ds:Rtndtes)         
		{
			if(ds.getText().equals(Rdate))
			{
				ds.click();
				break;
			}
		}
		Thread.sleep(1000);
		//Addtional Info
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("It's a harmless prank to fool my friend into thinking we’re going abroad! Make the ticket look super real. Add funny airline names if possible ");
		Thread.sleep(1000);
		
		//Delivery Option
		driver.findElement(By.xpath("//span[@class='woocommerce-input-wrapper']")).click();

		//Select DropDown
		WebElement Adropdown = driver.findElement(By.xpath("//select[@id='reasondummy']"));
		Select AdrpCnt = new Select(Adropdown);

		AdrpCnt.selectByIndex(5);
		Thread.sleep(1000);

		//Contact through
		driver.findElement(By.xpath("//input[@id='deliverymethod_1']")).click();
		Thread.sleep(1000);
		
		//Billing Details
		driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("DSN Company");
		Thread.sleep(1000);
		
		//Phone 
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("123456789");
		Thread.sleep(1000);
		
		//Email
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		
		//Country
		driver.findElement(By.xpath("//span[@aria-label='Country']")).click();
		Thread.sleep(1000); // or use WebDriverWait for better handling
		WebElement selectingCountry = driver.findElement(By.xpath("//input[@role='combobox']"));
		selectingCountry.sendKeys("India");
		Thread.sleep(1000);
		selectingCountry.sendKeys(Keys.ENTER); // Simulate Enter to select
		Thread.sleep(1000);
		
		//Address
		WebElement address1 = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		address1.sendKeys("No.128, Gandhi Road");
		Thread.sleep(1000);
		
		WebElement address2 = driver.findElement(By.xpath("//input[@id='billing_address_2']"));
		address2.sendKeys("Velacherry");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.xpath("//input[@id='billing_city']"));
		city.sendKeys("Chennai");
		Thread.sleep(1000);
		
		// Step 1: Click the visible dropdown wrapper, not the hidden <select>
		driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click(); 
		Thread.sleep(1000);

		// Step 2: Enter the state name into the visible input box
		WebElement selectingState = driver.findElement(By.xpath("//input[@role='combobox']"));
		selectingState.sendKeys("Tamil Nadu");
		Thread.sleep(1000);

		// Step 3: Press Enter to select the state
		selectingState.sendKeys(Keys.ENTER);
		
		//Pin COde
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("600094");
		Thread.sleep(1000);
		
		//Place Oreder Button
		driver.findElement(By.xpath("//button[normalize-space()='Place order']")).click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();


		

	}

}
