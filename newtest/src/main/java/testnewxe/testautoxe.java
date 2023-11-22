package testnewxe;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testautoxe {
	
	
	
	@Test
	 public void sampledemo() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://dev.xml-edge.com/");
       driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@123");
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
		  driver.findElement(By.xpath("//input[@formcontrolname='title']")).sendKeys("Test automation-35566");
		  driver.findElement(By.xpath("//*[@formcontrolname='formType']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Search form type']")).sendKeys("10-Q");
		  driver.findElement(By.xpath("//span[@class=\"mdb-option-text {'active', active}\"][normalize-space()='10-Q']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='mdb-datepicker-1']")).sendKeys("2023-06-23");
		  Thread.sleep(2000);
        
        WebElement file = driver.findElement(By.xpath("//input[@formcontrolname='xbrlFile']"));
        file.sendKeys("D:/Sample docs for testing/iXBRL files/ck0001587982-20221231.zip");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	 }
	
	
	 public void sampledemo1(){
		 System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://dev.xml-edge.com/");
       driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	@Test
	 public void sampledemo2(){
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
         driver.get("https://dev.xml-edge.com/");
        driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void sampledemo3(){
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
         driver.get("https://dev.xml-edge.com/");
        driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
}

	}



