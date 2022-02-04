package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElements {

    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='My Account']")
    public WebElement myAccountIcon;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@id='search']//button")
    public WebElement searchButton;

    // @FindAll works like -> driver.findElements()   |   @FindBy works like -> driver.findElement()
    @FindAll({@FindBy(xpath = "//h4")})
    public List<WebElement> searchResultItems;

}
