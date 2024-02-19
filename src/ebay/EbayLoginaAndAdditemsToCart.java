package ebay;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayLoginaAndAdditemsToCart extends Browser {
	WebDriverWait wait;

	// CheckoutCart cart = new CheckoutCart();
	@Test(priority = 0, enabled = true)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath(
				"//a[@href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F\"]"))
				.click();
		driver.findElement(By.xpath("//input[@id='userid']"))
				.sendKeys(new CharSequence[] { "chanduchandu739612@gmail.com" });
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(new CharSequence[] { "Chandu12$" });
		Thread.sleep(2000L);
		System.out.println("Hello");
		driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
		System.out.println("Login Successfull");
	}

	@Test(priority = 1, enabled = true)
	public void searchAndAddItems() {
		WebElement search = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		search.sendKeys(new CharSequence[] {
				"NEW! Pobeda Watch Aviation Mechanical USSR Soviet Wrist Russian Rare Men Vintage" });
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("//*[@id=\"item28c3c4259f\"]/div/div[1]/div/a/div/img")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		String childWindow = null;
		Iterator var6 = allWindows.iterator();

		String childWindow2;
		while (var6.hasNext()) {
			childWindow2 = (String) var6.next();
			if (!childWindow2.equals(mainWindow)) {
				childWindow = childWindow2;
			}
		}

		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		System.out.println("Watch successfully added to cart");

		try {
			search.sendKeys(new CharSequence[] { "water bottles" });
			driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		} catch (StaleElementReferenceException var10) {
			search = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
			search.sendKeys(new CharSequence[] { "water bottles" });
			driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		}

		driver.findElement(By
				.xpath("//img[@alt='16 Oz Outdoor Sports Water Bottles Stainless Steel with Straw Vacuum Insulated']"))
				.click();
		allWindows = driver.getWindowHandles();
		childWindow2 = null;
		Iterator var7 = allWindows.iterator();

		String childWindow3;
		while (var7.hasNext()) {
			childWindow3 = (String) var7.next();
			if (!childWindow3.equals(mainWindow) & !childWindow3.equals(childWindow)) {
				childWindow2 = childWindow3;
			}
		}

		driver.switchTo().window(childWindow2);
		driver.findElement(By.xpath("//select[@id='x-msku__select-box-1000']")).click();
		driver.findElement(By.xpath("//option[@id='x-msku__option-box-1']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		System.out.println("Water bottle successfully added to cart");

		try {
			search.sendKeys(new CharSequence[] { "PUMA Men's Axelion NXT Running Shoes" });
			driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		} catch (StaleElementReferenceException var9) {
			search = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
			search.sendKeys(new CharSequence[] { "PUMA Men's Axelion NXT Running Shoes" });
			driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		}

		driver.findElement(By.xpath(
				"//img[@src=\"https://i.ebayimg.com/thumbs/images/g/060AAOSw4Zlkyxn8/s-l300.webp\" and @alt=\"PUMA Men's Axelion NXT Running Shoes\"]"))
				.click();
		allWindows = driver.getWindowHandles();
		childWindow3 = null;
		Iterator var8 = allWindows.iterator();

		while (var8.hasNext()) {
			String id = (String) var8.next();
			if (!id.equals(mainWindow) & !id.equals(childWindow)) {
				childWindow3 = id;
			}
		}

		driver.switchTo().window(childWindow3);
		driver.findElement(By.xpath("//select[@id='x-msku__select-box-1000']")).click();
		driver.findElement(By.xpath("//option[@id='x-msku__option-box-10']")).click();
		driver.findElement(By.xpath("//select[@id='x-msku__select-box-1001']")).click();
		driver.findElement(By.xpath("//option[@id='x-msku__option-box-15']")).click();
		driver.findElement(By.xpath("//select[@id='x-msku__select-box-1002']")).click();
		driver.findElement(By.xpath("//option[@id='x-msku__option-box-19']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		System.out.println("Added shoes to cart");
		WebElement total = driver.findElement(
				By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/span/span/span"));
		System.out.println("Total amount =" + total.getText());
		System.out.println("Successfully added three items");
		// driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[2]/div/div[2]/div[5]/div[2]/span/span/span")).click();
		/*
		 * driver.switchTo().window(mainWindow);
		 * driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).
		 * click();
		 */

	}

	/*
	 * @Test( priority = 2, enabled = true ) public void checkout() {
	 * 
	 * }
	 */

	@Test(priority = 2, enabled = true)
	public void test() {
		CheckoutCart cart = new CheckoutCart();
		cart.checkout();
	}

	// Cloned repository and making changes of checkout after this push this code to
	// master with diff branch rasie a PR and get approved and pull these changes to
	// lead and try to run the code their

	@BeforeTest(enabled = true)
	public void beforeTest() throws Exception {
		this.setUp();
	}
}
