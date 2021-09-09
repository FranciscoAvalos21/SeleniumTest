package com.qualitystream.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test2 {
	
	  WebDriver driver;
		By NombreTitular = By.id("1");
		By NumeroTarjeta = By.id("2");
		By TipoTarjeta = By.id("3");
		By MesAñoVencimiento = By.id("4");
		//By CodigoTarjeta = By.id("nombre");
		
		
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://supermarkettcs.netlify.app/");
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  WebElement nomtitular = driver.findElement(NombreTitular);
		  nomtitular.clear();
		  nomtitular.sendKeys("Benito Camelo");
		  Thread.sleep(1000);
		  //nomtitular.submit();
		  WebDriverWait wait = new WebDriverWait(driver, 7);
		  
		  WebElement numtarjeta = driver.findElement(NumeroTarjeta);
		  numtarjeta.clear();
		  numtarjeta.sendKeys("Hola mundo");
		  //numtarjeta.submit();
		  Thread.sleep(1000);
		  if(driver.findElement(NumeroTarjeta).isEnabled()) {
			System.out.println("Pasado");
		  }
		  
		  WebElement tipotarjeta = driver.findElement(TipoTarjeta);
		  tipotarjeta.clear();
		  tipotarjeta.sendKeys("Visa");
		  //tipotarjeta.submit();
		  Thread.sleep(1000);
		  WebElement mesañoven = driver.findElement(MesAñoVencimiento);
		  mesañoven.clear();
		  mesañoven.sendKeys("07/23");
		  Thread.sleep(1000);
		  mesañoven.submit();
		  Thread.sleep(2000);
		  /*WebElement codtarjeta = driver.findElement(CodigoTarjeta);
		  codtarjeta.clear();
		  codtarjeta.sendKeys("978");
		  codtarjeta.submit();*/
		  
		 
		  
	  }
	  
	  
	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	 

}
