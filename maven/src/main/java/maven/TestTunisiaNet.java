package maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTunisiaNet {
public static void main (String args []) throws InterruptedException

{     WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
      driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
      driver.get("https://www.tunisianet.com.tn/");
      Thread.sleep(2000);
	  //To click the user icon
      WebElement element = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
      element.click();
      Thread.sleep(2000);
      //To click on "connexion"
      element = driver.findElement(By.cssSelector(".user-down > li > a > span"));
      element.click();
      Thread.sleep(2000);
      //Filling the form
      element = driver.findElement(By.name("email"));
      element.sendKeys("missajaziri@gmail.com");
      element = driver.findElement(By.name("password"));
      element.sendKeys("pass12345");
      ////Clicking on submit
      element = driver.findElement(By.id("submit-login"));
      element.click();
      Thread.sleep(2000);
      // Filling search form
      element = driver.findElement(By.className("search_query"));
      element.sendKeys("PC portable MacBook M1 13.3");
      //Submitting
      element = driver.findElement(By.cssSelector("#sp-btn-search > button"));
      element.click();
      // Selecting the first product
      List<WebElement> productsTitle = driver.findElements(By.className("product-title"));
      productsTitle.get(0).click();
      // Adding the product to my cart
      element = driver.findElement(By.className("add-to-cart"));
      element.click();
      // Click to order
      element = driver.findElement(By.cssSelector("a.btn-block"));
      element.click();
      Thread.sleep(2000);
      // Confirm the order
      element = driver.findElement(By.cssSelector(".checkout > div > a"));
      element.click();
      Thread.sleep(2000);
      // Filling the adress form
      element = driver.findElement(By.name("address1"));
      element.sendKeys("Cité Olympique, Tunis");  
      element = driver.findElement(By.name("postcode"));
      element.sendKeys("1005");
      element = driver.findElement(By.name("city"));
      element.sendKeys("Tunis");
      element = driver.findElement(By.name("phone"));
      element.sendKeys("25011307");
      element = driver.findElement(By.name("confirm-addresses"));
      element.click();
      Thread.sleep(2000);
      // Confirm Delivery Option
      element = driver.findElement(By.name("confirmDeliveryOption"));
      element.click();
      Thread.sleep(2000);
      // Confirm Payment
      element = driver.findElement(By.id("payment-option-1"));
      element.click();
      element = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
      element.click();
      driver.quit();
}
}
