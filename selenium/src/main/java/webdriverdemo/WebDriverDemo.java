package webdriverdemo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;	//Con selenium
import org.openqa.selenium.firefox.FirefoxDriver;	//Se trabajar[a con el navegador de Firefox

import org.junit.*;

public class WebDriverDemo {
	
	@Test
    public void numEnteros() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("50");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("100");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "50");
	      
	      driver.close();
    }
	
	@Test
    public void numDecimales() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("0.5");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("100");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "50");
	      
	      driver.close();
    }
	
	@Test
    public void numNegativos() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("-50");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("100");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "-50");
	      
	      driver.close();
    }
	
	@Test
    public void porcentajeCero() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("0");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("100");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "0");
	      
	      driver.close();
    }
	
	@Test
    public void porcentajeNoNumero() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("Hola");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("100");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "NaN");
	      
	      driver.close();
    }
	
	@Test
    public void porcentajeVacios() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("100");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "NaN");
	      
	      driver.close();
    }
	
	@Test
    public void porcentajeAmbosCeros() {
		//Con lo que se trabajara, las pruebas se automatizaran con firefox
		   //Nos conectaremos mediante una URL
		WebDriver driver = new FirefoxDriver();	
		  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Pasamos la URL de la Web del Calculator
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximizamos ventana del Navegador
	      driver.manage().window().maximize();
	      
	      // Encuentra el elemento y haz click
	      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
	      
	      // Vamos a la calculadora en especifico
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Ponemos el primer valor
	      driver.findElement(By.id("cpar1")).sendKeys("0");
	      
	      // Ponemos el segundo valor
	      driver.findElement(By.id("cpar2")).sendKeys("0");
	      
	      // Click en el boton de Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

	  
	      // Esperamos un tiempo
	      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
	      
	      //ASSERT
	      assertEquals(result, "NaN");
	      
	      driver.close();
    }
	
   public static void main(String[] args) {
   	//Set up web driver (chrome, firefox,...)
	//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
	   
	//Con lo que se trabajara, las pruebas se automatizaran con firefox
	   //Nos conectaremos mediante una URL
	WebDriver driver = new FirefoxDriver();	
	  
      // Esperamos un tiempo
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Pasamos la URL de la Web del Calculator
      driver.navigate().to("http://www.calculator.net/");
      
      //Maximizamos ventana del Navegador
      driver.manage().window().maximize();
      
      // Encuentra el elemento y haz click
      driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
      
      // Vamos a la calculadora en especifico
      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
      
      // Ponemos el primer valor
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Ponemos el segundo valor
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click en el boton de Calcular
      driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result =
         driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

  
      // Esperamos un tiempo
      driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
      
      // Print
      // Nelzon
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}