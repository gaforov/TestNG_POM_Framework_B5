package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageElements {

    public MyAccountPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Newsletter']")
    public WebElement newsletterButton;

    @FindBy(xpath = "(//input[@name='newsletter'])[1]")
    public WebElement subscribeNewsletterButton;

    @FindBy(xpath = "(//input[@name='newsletter'])[2]")
    public WebElement unsubscribeNewsletterButton;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;

}
