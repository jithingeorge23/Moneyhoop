package moneyhop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\ce\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneyhop.co/send");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Request a Callback']//parent::button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"name\"]"))).sendKeys("Test Enginner assignment");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("test@test.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='phone']"))).sendKeys("99999990");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='city']"))).sendKeys("Kochi");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='amount']"))).sendKeys("200");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='message']"))).sendKeys("testing");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Submit']//parent::span"))).click();
		
		String expectedMessage = "Your request has been received";
		
		String msg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Your request has been received']//parent::div"))).getText();
		
		if(expectedMessage.contentEquals(msg)) {
			
			System.out.println("success");
		}
		else {
			
			System.out.println("Failed");
		}
		
		
		driver.close();

	}

}
