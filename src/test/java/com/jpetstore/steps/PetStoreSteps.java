package com.jpetstore.steps;

import com.jpetstore.pages.AccountsPage;
import com.jpetstore.pages.BasePage;
import com.jpetstore.pages.DashBoardPage;
import com.jpetstore.pages.HelpPage;
import com.jpetstore.pages.LoginPage;
import com.jpetstore.pages.ProductsPage;
import com.jpetstore.utils.PetCategories;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoreSteps extends ScenarioSteps{
	
	BasePage basePage;
	
	/************************************************************************************************************
	 * **********************************************************************************************************
	 * 
	 *  BASE PAGE STEPS
	 * 
	 ***********************************************************************************************************
	 ***********************************************************************************************************/
	
	@Step("Signing out from the store")
	public DashBoardPage signOut() {
		
		return basePage.signOut();
	}
	
	@Step("Navigating to Login Page")
	public LoginPage navigateToLoginPage() {

		return basePage.navigateToSignOnPage();
	}

	@Step("Navigating to products page by cliking on : {0} link on header")
	public ProductsPage navigateToProductsCategory(PetCategories productCategory) {
		
		return basePage.navigateToProductCategory(productCategory);
	}

	@Step("Navigating to Products Page by clicking on shopping cart")
	public ProductsPage navigateToShoppingCartPage() {

		return basePage.navigateToShoppingCart();
	}

	@Step("Navigating to Help Page")
	public HelpPage navigateToHelpPage() {

		return basePage.navigateToHelpPage();
	}

	@Step("Clicking on Company Logo & navigating to the DashBoard")
	public DashBoardPage navigateToDashBoard() {
		
		return basePage.navigateToDashBoard();
	}

	@Step("Navigating to Accounts Page")
	public AccountsPage navigateToMyAccountsPage() {

		return basePage.navigateToAccountsPage();
	}

	@Step("Searching for product: {0}")
	public ProductsPage searchForProduct(String productName) {

		return basePage.searchForProducts(productName);
	}

}
