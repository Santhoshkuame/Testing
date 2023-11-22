package testnewxe;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testautoxe3 {
	
	
	
	@Test
	 
	 public void sampledemo(){
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://dev.xml-edge.com/");
       driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	
	 public void sampledemo1(){
		 //System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://dev.xml-edge.com/");
       driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	 
	 public void sampledemo2(){
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
         driver.get("https://dev.xml-edge.com/");
        driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void sampledemo3(){
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
         driver.get("https://dev.xml-edge.com/");
        driver.manage().window().maximize();
	driver.findElement(By.id("inputEmail4MD")).sendKeys("santhoshkumar.ilangovan@edgaragents.in");
	     driver.findElement(By.id("inputPassword4MD")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
}

	}



