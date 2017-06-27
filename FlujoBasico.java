package casos;

import java.io.File;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FlujoBasico {

	private WebDriver driver;
 	WebElement element;
 	private String baseUrl;
 	String titulo="¡Felicitaciones!";

// @Before
// public void openBrowser() throws Exception{
//	} 

 @Test
 public void flujoPrincipal() throws Exception{
	 System.setProperty("webdriver.chrome.driver","C:\\driver1\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 baseUrl = "https://extranetdev.grupobbva.pe/";
	 driver.get(baseUrl + "/cuentax");
	 
	 //Pantalla Inicial
	 
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 element = (new WebDriverWait(driver,50))
	 .until(ExpectedConditions.elementToBeClickable(By.id("documentTypeForm")));
	 driver.findElement(By.xpath("//*[@id='documentTypeForm']/div/button")).click();
	 driver.findElement(By.linkText("DNI")).click();
	 
	 element = (new WebDriverWait(driver, 10))
	 .until(ExpectedConditions.elementToBeClickable(By.id("documentNumber")));
	 driver.findElement(By.id("documentNumber")).clear();
	 driver.findElement(By.id("documentNumber")).sendKeys("20160108");
	 driver.findElement(By.id("email")).clear();
	 driver.findElement(By.id("email")).sendKeys("ivan.mora@mdp.com.pe");
	 element= driver.findElement(By.id("email"));
	 element.sendKeys(Keys.TAB);
	 driver.findElement(By.xpath("//*[@id='hst-container']/div[1]/div/div/div[3]/div/div/label/span/i")).click();
	 driver.findElement(By.xpath("//*[@id='btnContinuarAlPaso2']")).click();
     
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile, new File("c:\\test\\Paso1.JPG"));
	 //Pantalla de Ingreso de cuentas

	 String primero="0814";
	 String segunda="0200005606";
	 String primero_1="0814";
	 String segunda_1="0200003646";
	 
	 //Primer Registro
	 driver.findElement(By.id("txtNumCtaParte1_1")).clear();
	 driver.findElement(By.id("txtNumCtaParte1_1")).sendKeys(primero.substring(0,1));
	 driver.findElement(By.id("txtNumCtaParte1_1")).sendKeys(primero.substring(1,2));
	 driver.findElement(By.id("txtNumCtaParte1_1")).sendKeys(primero.substring(2,3));
	 driver.findElement(By.id("txtNumCtaParte1_1")).sendKeys(primero.substring(3,4));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(0,1));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(1,2));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(2,3));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(3,4));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(4,5));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(5,6));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(6,7));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(7,8));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(8,9));
	 driver.findElement(By.id("txtNumCtaParte2_1")).sendKeys(segunda.substring(9,10));

	 WebElement element1 = (new WebDriverWait(driver, 10))
	 .until(ExpectedConditions.elementToBeClickable(By.id("btnAgregarNroCta_1")));
	 driver.findElement(By.xpath("//*[@id='btnAgregarNroCta_1']")).click();

	 //Segundo Registro

	 driver.findElement(By.id("txtNumCtaParte1_2")).clear();
	 driver.findElement(By.id("txtNumCtaParte1_2")).sendKeys(primero_1.substring(0,1));
	 driver.findElement(By.id("txtNumCtaParte1_2")).sendKeys(primero_1.substring(1,2));
	 driver.findElement(By.id("txtNumCtaParte1_2")).sendKeys(primero_1.substring(2,3));
	 driver.findElement(By.id("txtNumCtaParte1_2")).sendKeys(primero_1.substring(3,4));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(0,1));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(1,2));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(2,3));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(3,4));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(4,5));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(5,6));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(6,7));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(7,8));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(8,9));
	 driver.findElement(By.id("txtNumCtaParte2_2")).sendKeys(segunda_1.substring(9,10));
	 
	 
	 driver.findElement(By.xpath("//*[@id='lnkVerTyc']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='modalMostrarTyc']/div/div/div[3]/button")).click();
	 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile1, new File("c:\\test\\Paso2.JPG"));
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//*[@id='hst-container']/div[1]/div/div/div/div/div[5]/div/div/label/span/i")).click();
     
	 WebElement element = (new WebDriverWait(driver, 10))
	 .until(ExpectedConditions.elementToBeClickable(By.id("btnConfirmarCuentas"))); 
	 driver.findElement(By.xpath("//*[@id='btnConfirmarCuentas']")).click();
	 
	 String descriptionTextXPath = "//*[@id='hst-container']/div/div/div[1]/h1/strong";
	 
	 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile2, new File("c:\\test\\Paso3.JPG"));
	 
	 WebElement h1Element = driver.findElement(By.xpath(descriptionTextXPath));
	 String descriptionText = h1Element.getAttribute("innerText");
	 Assert.assertEquals(titulo,descriptionText);
	 System.out.println(descriptionText);
	 Thread.sleep(4000);
	 File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile3, new File("c:\\test\\Paso4.JPG"));

 }
// @After
// public void tearDown() throws Exception{
//	 driver.quit();
// }
}
