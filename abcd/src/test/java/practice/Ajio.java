package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Ajio {
 
  public void ajio_Test() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.ajio.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.close();
	  }
}
