package pageObject;

public interface ProductPageObjects {

	String selectProduct = "//div[text()='%s']/../../..//button[text()='Add to cart']";
	String gotoCheckoutPage = "//a[@class='shopping_cart_link']";
	String getProductnameinCart = "//div[@class='inventory_item_name']";

	String checkOutButton = "//button[@id='checkout']";
	String firstName = "//input[@id='first-name']";
	String lastName = "//input[@id='last-name']";

	String postalCode = "//input[@id='postal-code']";

	String continueButton = "//input[@id='continue']";
	String finishButton = "//button[@id='finish']";

	public static String selectProduct(String runTimePackageName) {
		String value = selectProduct;
		String value2;
		value2 = value.replace("%s", runTimePackageName);
		return value2;
	}

}
