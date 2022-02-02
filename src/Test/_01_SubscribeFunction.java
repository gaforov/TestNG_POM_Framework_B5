package Test;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_SubscribeFunction extends BaseDriver {

    @Test
    public void subscribeFunctionTest() {

        HomePageElements homePageElements = new HomePageElements(driver);
        MyAccountPageElements myAccountPageElements = new MyAccountPageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

        myAccountPageElements.newsletterButton.click();
        myAccountPageElements.subscribeNewsletterButton.click();
        myAccountPageElements.continueButton.click();

        String actualMessage = myAccountPageElements.successMessage.getText();

        Assert.assertTrue(actualMessage.contains("Success"));
    }

}
