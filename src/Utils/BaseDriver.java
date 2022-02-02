package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccountButton = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccountButton.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        WebElement usernameInput = driver.findElement(By.id("input-email"));
        usernameInput.sendKeys("test@technostudy.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("Test12345..");

        WebElement submitLoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitLoginButton.click();

        WebElement homePageButton = driver.findElement(By.xpath("//a[text()='Your Store']"));
        homePageButton.click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
