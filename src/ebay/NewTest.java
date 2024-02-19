package ebay;

import org.testng.annotations.Test;

public class NewTest extends Browser {
	EbayLoginaAndAdditemsToCart test1 = new EbayLoginaAndAdditemsToCart();
	CheckoutCart test2 = new CheckoutCart();
  @Test(priority = 0)
  public void test1() {
	  test1.searchAndAddItems();
	  
  }
  @Test(priority = 1)
  public void test2() {
	  test1.test();
  }
}
