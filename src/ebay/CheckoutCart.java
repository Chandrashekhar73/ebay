package ebay;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckoutCart extends Browser {
	@Test
	public void checkout() {
		System.out.println("Hello");
		System.out.println("Started");
		System.out.println("THis is checkout page");

		/*
		 * try {
		 * driver.findElement(By.xpath("//button[contains(text(),'Go to checkout')]")).
		 * click(); } catch (Exception e) { System.out.println("Started");
		 * driver.findElement(By.xpath("//button[contains(text(),'Go to checkout')]")).
		 * click(); }
		 * //driver.findElement(By.xpath("//button[contains(text(),'Go to checkout')]"))
		 * .click(); System.out.println("first step "); try {
		 * driver.findElement(By.xpath("//a[contains(text(),'Change')]")).click(); }
		 * catch (Exception e) { System.out.println("Started");
		 * driver.findElement(By.xpath("//a[contains(text(),'Change')]")).click(); }
		 * 
		 * try {
		 * driver.findElement(By.xpath("//a[contains(text(),'Add a new address')]")).
		 * click(); } catch (Exception e) { System.out.println("Started");
		 * driver.findElement(By.xpath("//a[contains(text(),'Add a new address')]")).
		 * click(); }
		 * 
		 * 
		 * WebElement drp1 = driver.findElement(By.id("country")); Select countrydrp =
		 * new Select(drp1); // wait.until(ExpectedConditions.visibilityOf(countrydrp));
		 * countrydrp.selectByValue("India");
		 * 
		 * 
		 * //
		 * driver.findElement(By.xpath("//option[contains(text(),'India')]")).click();
		 * driver.findElement(By.id("firstName")).sendKeys("Bhanu");
		 * driver.findElement(By.id("lastName")).sendKeys("Prakash");
		 * driver.findElement(By.id("addressLine1")).sendKeys("Bench kottal");
		 * driver.findElement(By.id("addressLine2")).sendKeys("Near school");
		 * driver.findElement(By.id("city")).sendKeys("Guntakal");
		 * System.out.println("Till city added");
		 * driver.findElement(By.id("stateOrProvince")).sendKeys("Andhra Pradesh"); //
		 * driver.findElement(By.xpath("//option[contains(text(),'Andhra Pradesh')]")).
		 * click(); driver.findElement(By.id("postalCode")).sendKeys("515801");
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"phoneCountryCode\"]/span/span[2]/span/span[2]")).click();
		 * driver.findElement(By.xpath("//*[@id=\"listbox_btn_in_0\"]/span/span/span[1]"
		 * )).click();
		 * driver.findElement(By.id("phoneNumber")).sendKeys("+917416387473");
		 * driver.findElement(By.
		 * xpath("//button[contains(text(),'Add') and  @data-test-id='ADD_ADDRESS_SUBMIT']"
		 * )).click(); System.out.println("Checkout Ready");
		 */
	}
}
