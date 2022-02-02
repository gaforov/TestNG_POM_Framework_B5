package Test;

import POM.HomePageElements;
import Utils.BaseDriver;
import org.testng.annotations.Test;

public class _01_SubscribeFunction extends BaseDriver {

    @Test
    public void subscribeFunctionTest() {

        HomePageElements homePageElements = new HomePageElements(driver);

        homePageElements.myAccountIcon.click();
        homePageElements.myAccountButton.click();

    }

}
