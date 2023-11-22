package testnewxe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AnnotationDemo {
	
	@Parameters({"URL","APIkey/username"})
	 @Test
	 public void sampledemo(String urlname,String key) throws InterruptedException
	 {
				System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
			 	WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
		        driver.get("https://dev.xml-edge.com/");
		       driver.manage().window().maximize();
			      driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
			     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@1234");
			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			    Thread.sleep(5000);
				  driver.findElement(By.xpath("//div[@class='card-header']//*[text()='EAsyView']")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//a[normalize-space()='Companies']")).click();
				  Thread.sleep(5000);
				  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Test Santhosh");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//td[normalize-space()='Test Santhosh']")).click();
				  Thread.sleep(5000);
				  driver.findElement(By.xpath("//div[@class='popup-controls']")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@formcontrolname='title']")).sendKeys("Test automation-355665");
				  driver.findElement(By.xpath("//*[@formcontrolname='formType']")).click();
				  driver.findElement(By.xpath("//input[@placeholder='Search form type']")).sendKeys("10-Q");
				  driver.findElement(By.xpath("//span[@class=\"mdb-option-text {'active', active}\"][normalize-space()='10-Q']")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id='mdb-datepicker-1']")).sendKeys("2023-06-24");
				  Thread.sleep(2000);
		        
		        WebElement file = driver.findElement(By.xpath("//input[@formcontrolname='xbrlFile']"));
		        file.sendKeys("D:/Sample docs for testing/iXBRL files/ck0001587982-20221231.zip");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		        System.out.println("Printing f");
		        System.out.println(urlname);
		        System.out.println(key);
	 }
	 


	 

	}


