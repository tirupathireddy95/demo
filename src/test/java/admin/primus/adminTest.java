package admin.primus;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class adminTest {



	 WebDriver driver;
	
@AfterMethod
public void closeApp()
{
	driver.close();
}
@Test
public void loginApp() throws InterruptedException
{
driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
driver.findElement(By.cssSelector("#txtPword")).sendKeys("Admin");
driver.findElement(By.cssSelector("input[id='login']")).click();
String expected=driver.getTitle();
assertEquals(driver.getTitle(),expected);
System.out.println("testing");	System.out.println("testing");	System.out.println("testing");
System.out.println("");	System.out.println("");	System.out.println("");


}
@Test
public void logout()
{
	driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("#txtPword")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input[id='login']")).click();
	driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	String expected=driver.getTitle();
	System.out.println(expected);
	assertEquals(driver.getTitle(), expected);
	System.out.println("prakash");
	System.out.println("tirupathi");
	System.out.println("reddy");
}
@BeforeMethod
@Parameters("url")
public void launchApp(String primus)
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(primus);
}
@Test
public void gitdevelop()
     {
	System.out.println("gitdevelop");
	System.out.println("gitdevelop");
	
	
     }

}