package admin.primus;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multipleTest {
	 WebDriver driver;
		@BeforeMethod
		@Parameters("url")
		public void launchApp(String primus)
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(primus);
		}
		
		@DataProvider
		public Object[][] getData()
		{
			Object [][] data=new Object[3][2];
			data[0][0]="admin";
			data[0][1]="admin";
			data[1][0]="Admin";
			data[1][1]="Admin";
			data[2][0]="admin";
			data[2][1]="Admin";
			return data;
		}
		
		@Test(dataProvider = "getData")
		public void loginPrimus(String uname,String pswd)
		{
			driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys(uname);
			driver.findElement(By.cssSelector("#txtPword")).sendKeys(pswd);
			driver.findElement(By.cssSelector("input[id='login']")).click();
			String expected=driver.getTitle();
			assertEquals(driver.getTitle(),expected);
		}
		
		@AfterMethod
		public void closeApp()
		{
			driver.close();
		}
		
}
