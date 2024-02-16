package ebay;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayLoginaAndAdditemsToCart extends Browser {
	WebDriverWait wait;

	   @Test(
	      enabled = true
	   )
	   public void login() throws InterruptedException {
	      this.driver.findElement(By.xpath("//a[@href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F\"]")).click();
	      this.driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(new CharSequence[]{"chanduchandu739612@gmail.com"});
	      Thread.sleep(2000L);
	      this.driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
	      this.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(new CharSequence[]{"Chandu12$"});
	      Thread.sleep(2000L);
	      System.out.println("Hello");
	      this.driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
	      System.out.println("Login Successfull");
	   }

	   @Test(
	      priority = 1,
	      enabled = true
	   )
	   public void searchAndAddItems() {
	      WebElement search = this.driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
	      search.sendKeys(new CharSequence[]{"NEW! Pobeda Watch Aviation Mechanical USSR Soviet Wrist Russian Rare Men Vintage"});
	      this.driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	      this.driver.findElement(By.xpath("//*[@id=\"item28c3c4259f\"]/div/div[1]/div/a/div/img")).click();
	      String mainWindow = this.driver.getWindowHandle();
	      Set<String> allWindows = this.driver.getWindowHandles();
	      String childWindow = null;
	      Iterator var6 = allWindows.iterator();

	      String childWindow2;
	      while(var6.hasNext()) {
	         childWindow2 = (String)var6.next();
	         if (!childWindow2.equals(mainWindow)) {
	            childWindow = childWindow2;
	         }
	      }

	      this.driver.switchTo().window(childWindow);
	      this.driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	      System.out.println("Watch successfully added to cart");

	      try {
	         search.sendKeys(new CharSequence[]{"water bottles"});
	         this.driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	      } catch (StaleElementReferenceException var10) {
	         search = this.driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
	         search.sendKeys(new CharSequence[]{"water bottles"});
	         this.driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	      }

	      this.driver.findElement(By.xpath("//img[@alt='16 Oz Outdoor Sports Water Bottles Stainless Steel with Straw Vacuum Insulated']")).click();
	      allWindows = this.driver.getWindowHandles();
	      childWindow2 = null;
	      Iterator var7 = allWindows.iterator();

	      String childWindow3;
	      while(var7.hasNext()) {
	         childWindow3 = (String)var7.next();
	         if (!childWindow3.equals(mainWindow) & !childWindow3.equals(childWindow)) {
	            childWindow2 = childWindow3;
	         }
	      }

	      this.driver.switchTo().window(childWindow2);
	      this.driver.findElement(By.xpath("//select[@id='x-msku__select-box-1000']")).click();
	      this.driver.findElement(By.xpath("//option[@id='x-msku__option-box-1']")).click();
	      this.driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[8]/ul/li[2]/div/a")).click();
	      System.out.println("Water bottle successfully added to cart");

	      try {
	         search.sendKeys(new CharSequence[]{"PUMA Men's Axelion NXT Running Shoes"});
	         this.driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	      } catch (StaleElementReferenceException var9) {
	         search = this.driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
	         search.sendKeys(new CharSequence[]{"PUMA Men's Axelion NXT Running Shoes"});
	         this.driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	      }

	      this.driver.findElement(By.xpath("//img[@src=\"https://i.ebayimg.com/thumbs/images/g/060AAOSw4Zlkyxn8/s-l300.webp\" and @alt=\"PUMA Men's Axelion NXT Running Shoes\"]")).click();
	      allWindows = this.driver.getWindowHandles();
	      childWindow3 = null;
	      Iterator var8 = allWindows.iterator();

	      while(var8.hasNext()) {
	         String id = (String)var8.next();
	         if (!id.equals(mainWindow) & !id.equals(childWindow)) {
	            childWindow3 = id;
	         }
	      }

	      this.driver.switchTo().window(childWindow3);
	      this.driver.findElement(By.xpath("//select[@id='x-msku__select-box-1000']")).click();
	      this.driver.findElement(By.xpath("//option[@id='x-msku__option-box-10']")).click();
	      this.driver.findElement(By.xpath("//select[@id='x-msku__select-box-1001']")).click();
	      this.driver.findElement(By.xpath("//option[@id='x-msku__option-box-15']")).click();
	      this.driver.findElement(By.xpath("//select[@id='x-msku__select-box-1002']")).click();
	      this.driver.findElement(By.xpath("//option[@id='x-msku__option-box-19']")).click();
	      this.driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	      System.out.println("Added shoes to cart");
	      WebElement total = this.driver.findElement(By.xpath("//div[@class='cart-summary-line-item'][4]//div[2]/span[1]/span/span"));
	      System.out.println("Total amount =" + total.getText());
	      System.out.println("Successfully added three items");
	      this.driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[1]/div[1]/div[1]/ul/li/div[1]/div/div/div[2]/span[2]/button")).click();
	      this.driver.switchTo().window(mainWindow);
	      this.driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).click();
	   }

	   @Test(
	      enabled = false
	   )
	   public void checkout() {
	      this.driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a/svg")).click();
	      this.driver.findElement(By.xpath("//button[@data-test-id=\"cart-remove-item\"]")).click();
	   }

	   @BeforeTest
	   public void beforeTest() throws Exception {
	      this.setUp();
	   }
}
