package Test;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.testng.annotations.Test;

public class _01_SubscribeFunction extends BaseDriver {

    HomePageElements homePageElements;
    MyAccountPageElements myAccountPageElements;
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void subscribeFunctionTest() {

        homePageElements = new HomePageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterButton.click();
        myAccountPageElements.subscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

    @Test
    public void unsubscribeFunctionTest() {

        homePageElements = new HomePageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterButton.click();
        myAccountPageElements.unsubscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

}
