package com.mycompany;
import com.mycompany.config.Configs;
import com.mycompany.driver_factory.DriverFactory;
import com.mycompany.pages.MlCalHome;
import com.mycompany.pages.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestBase {
    //common code that can be used everywhere
    protected WebDriver driver;
    private String browser;
    private String originalWindowHandel;
    protected MlCalHome mlCalHome;
    protected Result result;

    @BeforeMethod
    public void setUp() {
        //if login is there call here
        driver = DriverFactory.getWebDriver(Configs.BROWSER);
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));
        //implicitly wait: wait for all the webelements for this max time which in this case is 20
        driver.manage().timeouts().implicitlyWait(Duration.of(Configs.MEDIUM_WAIT, ChronoUnit.SECONDS));
        driver.manage().window().maximize();
        driver.navigate().to(Configs.URL);
        originalWindowHandel = driver.getWindowHandle();
        createObjectOfPAges();
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    public void clearAndSendKeys(By by, String toType) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(toType);
    }

    public void explicitWait(ExpectedCondition<WebElement> by) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(by);
    }

    public void createObjectOfPAges() {
        mlCalHome = new MlCalHome(driver);
        result = new Result(driver);
    }
}

