package com.jpetstore.pages;

import org.openqa.selenium.By;

import com.jpetstore.utils.PetCategories;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {
	
private static final String ENTER_THE_STORE_LINK = "//a[@href='actions/Catalog.action']";
	
	private static final String SIGN_IN_LINK = "//*[@id='MenuContent']/a[contains(text(),'Sign In')]";
	
	private static final String LOGO_LINK = "div[id='LogoContent'] a[href$='.action']";

	private static final String SIGN_OUT_LINK = "//*[@id='MenuContent']/a[contains(text(),'Sign Out')]";

	private static final String MY_ACCT_LINK = "//*[@id='MenuContent']/a[contains(text(),'My Account')]";

	private static final String HELP_LINK = "//*[@id='MenuContent']/a[contains(text(),'?')]";

	private static final String SHOPPING_CART_LINK = "div[id='MenuContent'] a[href$='?viewCart=']";

	private static final String SEARCH_INPUT = "//input[@name='keyword']";

	private static final String SEARCH_BUTTON = "//input[@value='Search']";

	// Product Quick Links
	private static final String FISH_LINK = "div[id='QuickLinks'] a[href$='FISH']";

	private static final String DOGS_LINK = "div[id='QuickLinks'] a[href$='DOGS']";

	private static final String REPTILES_LINK = "div[id='QuickLinks'] a[href$='REPTILES']";

	private static final String CATS_LINK = "div[id='QuickLinks'] a[href$='CATS']";

	private static final String BIRDS_LINK = "div[id='QuickLinks'] a[href$='BIRDS']";

	private static final String BANNER_IMG = "//*[@id='Banner']/img";
	

	/***** Method used to navigate to the signOn Page******/
	
	public LoginPage navigateToSignOnPage() {
		
		open();
		waitForTextToAppear("Welcome to JPetStore 6");
		
		waitFor(ENTER_THE_STORE_LINK).$(ENTER_THE_STORE_LINK).click();
		
		waitFor(SIGN_IN_LINK).$(SIGN_IN_LINK).click();
		
		return this.switchToPage(LoginPage.class);

	}
	
   /**** Click on the sign in link****/
	public LoginPage clickOnSignOnLink() {
		
		waitFor(SIGN_IN_LINK).find(By.xpath(SIGN_IN_LINK)).click();
		
		return this.switchToPage(LoginPage.class);
	}
	
	
	/****Navigates to DashBoard Page ****/
	public DashBoardPage navigateToDashBoard() {
		
		waitFor(LOGO_LINK).$(LOGO_LINK).click();
		
		return this.switchToPage(DashBoardPage.class);
	}
	
	
	/** Sign out link**/
	public DashBoardPage signOut() {
		
		waitFor(SIGN_OUT_LINK).$(SIGN_OUT_LINK).click();;
		return this.switchToPage(DashBoardPage.class);
	}
	
	/** ***/
	public AccountsPage navigateToAccountsPage() {
		waitFor(MY_ACCT_LINK).$(MY_ACCT_LINK).click();
		return this.switchToPage(AccountsPage.class);
	}
	
	/** Search for products***/
	public ProductsPage searchForProducts(String searchValue) {
		waitFor(SEARCH_INPUT).$(SEARCH_INPUT).type(searchValue);
		waitFor(SEARCH_BUTTON).$(SEARCH_BUTTON).click();
		return this.switchToPage(ProductsPage.class);
	}
	
	/** Navigate to help page**/
	public HelpPage navigateToHelpPage() {
		
		waitFor(HELP_LINK).$(HELP_LINK).click();
		
		return this.switchToPage(HelpPage.class);
	}
	
	/** Navigate to shopping cart on the dash-board**/
	public ProductsPage navigateToShoppingCart() {
		waitFor(SHOPPING_CART_LINK).$(SHOPPING_CART_LINK).click();
		return this.switchToPage(ProductsPage.class);
	}
	
	/** Method to select product category from the header
	 * 
	 *  @param productCategeory
	 *  @return
	 *  **/
	
	public ProductsPage navigateToProductCategory(PetCategories productCategory) {
		
		switch (productCategory) {
		
		case FISH:
			waitFor(FISH_LINK).$(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);
			
		case DOGS:
			waitFor(FISH_LINK).$(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);
			
		case REPTILES:
			waitFor(FISH_LINK).$(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);
			
		case CATS:
			waitFor(FISH_LINK).$(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);
			
		case BIRDS:
			waitFor(FISH_LINK).$(FISH_LINK).click();
			return this.switchToPage(ProductsPage.class);				
			
		default:
			break;
		}
		
		return null;
	}

}
