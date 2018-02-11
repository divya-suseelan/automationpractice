package Stepdef;

import PageModels.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderingTshirtStep {
    private static MyAccountPage myAccountPage = new MyAccountPage();
    private static TshirtPage tshirtPage = new TshirtPage();
    private static YourShoppingCartPage yourShoppingCartPage = new YourShoppingCartPage();
    private static AddressPage addressPage = new AddressPage();
    private static ShippingPage shippingPage = new ShippingPage();
    private static YourPaymentMethodPage yourPaymentMethodPage = new YourPaymentMethodPage();
    private static OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    private static OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    String expectedReferenceNumber=null;

    @Given("^a user is on T-shirt page$")
    public void aUserIsOnTShirtPage() throws Throwable {
        myAccountPage.clickOnTshirtTab();
    }


    @When("^user add the T-shirt to cart by hovering over image and check out$")
    public void userAddTheTShirtToCartByHoveringOverImageAndCheckOut() throws Throwable {
        tshirtPage.clickOnAddToCart();
        tshirtPage.clickOnProceedToCheckout();
    }

    @And("^user click on proceed to check out from shopping cart summary page$")
    public void userClickOnProceedToCheckOutFromShoppingCartSummaryPage() throws Throwable {
        yourShoppingCartPage.clickOnProceedToCheckout();
    }

    @And("^user click on proceed to check out from Address page$")
    public void userClickOnProceedToCheckOutFromAddressPage() throws Throwable {
        addressPage.clickOnProceedToCheckout();
    }

    @And("^user click on proceed to check out from Shipping page$")
    public void userClickOnProceedToCheckOutFromShippingPage() throws Throwable {
        shippingPage.clickOnProceedToCheckout();
    }

    @And("^user select the \"([^\"]*)\"and confirm the order$")
    public void userSelectTheAndConfirmTheOrder(String paymentMethod) throws Throwable {
        yourPaymentMethodPage.processOrderPayment(paymentMethod);
        yourPaymentMethodPage.clickOnIConfirm();
    }


    @And("^User is taken to Order Confirmation page$")
    public void userIsTakenToOrderConfirmationPage() throws Throwable {
        String requiredMessage=orderConfirmationPage.getOrderReferenceNumber();
        expectedReferenceNumber=requiredMessage;
    }

    @And("^User click on Back to orders to naviagte to Order history$")
    public void userClickOnBackToOrdersToNaviagteToOrderHistory() throws Throwable {
        orderConfirmationPage.clickOnBackToOrders();
    }

    @Then("^latest order should be displayed in Order history$")
    public void latestOrderShouldBeDisplayedInOrderHistory() throws Throwable {
        String requiredReferenceNumber=orderHistoryPage.getOrderReferenceNumber();
        Assert.assertEquals(expectedReferenceNumber,requiredReferenceNumber);
    }


}
