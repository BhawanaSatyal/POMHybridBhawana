package org.example;

import io.cucumber.java.en.*;

public class StepDefs {

    CategoryPage categoryPage = new CategoryPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegistrationPage registrationPage = new RegistrationPage();
    SocialMedia socialMedia = new SocialMedia();



    @Given("I am on homepage")
    public void i_am_on_homepage() {
        categoryPage.verifyUserIsOnHomepage();

    }

    @When("I click on {string} button")
    public void i_click_on_button(String categoryName) {
        categoryPage.clickOnCategoryButton(categoryName);
    }

    @And("I should be able to verify the URL {string} accordingly")
    public void i_should_be_able_to_verify_the_url_accordingly(String pageUrl) {
        categoryPage.verifyURL(pageUrl);
    }


    @Then("I should be able to verify the  title {string} accordingly")
    public void iShouldBeAbleToVerifyTheTitleAccordingly(String pageTitle) {
        categoryPage.verifyPageTitle(pageTitle);
    }


    @When("I hover on {string} button")
    public void iHoverOnButton(String category) {
        categoryPage.hoverOnCategory(category);
    }




    @Given("I am already logged in as registered user")
    public void i_am_already_logged_in_as_registered_user() {
        registrationPage.verifyUserIsHomePage();
        registrationPage.clickOnRegister();
        registrationPage.userEntersRegistrationDetails();
        registrationPage.clickOnRegister1();
        checkOutPage.verifyUserIsLoggedInSuccessfully();


    }
    @When("I hover around Computers and click on Desktops")
    public void i_hover_around_computers_and_click_on_desktops() {
        checkOutPage.hoverOnComputerAndClick();

    }
    @When("I add build your own computer to cart")
    public void i_add_build_your_own_computer_to_cart() {
        checkOutPage.clickOnCartBuildYourOwnComputer();

    }

    @When("I click required specifications")
    public void i_click_required_specifications() {
        checkOutPage.selectSpecs();
     //   checkOutPage.ScrollByVisibleElement();

    }

    @Then("I click on add to cart")
    public void i_click_on_add_to_cart() {
        checkOutPage.addToCart();

    }
    @Then("I click on Shopping cart")
    public void i_click_on_shopping_cart() {checkOutPage.clickOnShoppingCart();}

    @Then("I click on agree with terms of service")
    public void i_click_on_agree_with_terms_of_service() {checkOutPage.acceptTermsOfService();

    }
    @Then("I click on checkout")
    public void i_click_on_checkout() {checkOutPage.clickOnCheckout();}

    @Then("I update Billing Address")
    public void i_update_billing_address() {
        checkOutPage.fillUpBillingInformation();


    }
    @Then("I click on continue")
    public void i_click_on_continue() {
        checkOutPage.clickOnContinueAndContinueAgain();



    }
    @Then("click on payment method")
    public void click_on_payment_method() {
        checkOutPage.clickOnCreditCardAndContinue();

    }
    @Then("Click continue")
    public void click_continue() {

    }
    @Then("Fill up payment information")
    public void fill_up_payment_information() {
        checkOutPage.enterCreditCardContinueAndConfirm();


    }
    @Then("order should be processed successfully")
    public void order_should_be_processed_successfully() {
        checkOutPage.verifyUserHasCheckedOutSuccessfully();

    }

    @Given("I am on a homepage")
    public void i_am_on_a_homepage() {
        registrationPage.verifyUserIsHomePage();

    }
    @When("I click on social media icon")
    public void i_click_on_social_media_icon() {
        socialMedia.verifyUserIsLinkedToFacebookPage();
        socialMedia.verifynopCommerceIsOnFaceBookPage();
        socialMedia.verifyUserIsLinkedToTwitterPage();
        socialMedia.verifynopCommerceIsTwitterPage();
        socialMedia.verifyUserIsLinkedToYoutubePage();
        socialMedia.verifynopCommerceIsYoutubePage();

    }
    @Then("I should be navigated to social media on a new page")
    public void i_should_be_navigated_to_social_media_on_a_new_page() {


    }


}

