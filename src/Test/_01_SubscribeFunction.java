package Test;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.testng.annotations.Test;

public class _01_SubscribeFunction extends BaseDriver {

    @Test
    public void subscribeFunctionTest() {

        HomePageElements homePageElements = new HomePageElements(driver);
        MyAccountPageElements myAccountPageElements = new MyAccountPageElements(driver);
        ReusableMethods reusableMethods = new ReusableMethods();

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterButton.click();
        myAccountPageElements.subscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

    @Test
    public void unsubscribeFunctionTest() {

        HomePageElements homePageElements = new HomePageElements(driver);
        MyAccountPageElements myAccountPageElements = new MyAccountPageElements(driver);
        ReusableMethods reusableMethods = new ReusableMethods();

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterButton.click();
        myAccountPageElements.unsubscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

}
