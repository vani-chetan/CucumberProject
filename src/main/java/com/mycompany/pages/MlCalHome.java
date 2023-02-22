package com.mycompany.pages;

import com.mycompany.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MlCalHome extends TestBase {
    private By purchasePrice = By.id("ma");
    private By submitButton = By.cssSelector("#mortgageForm [value='Calculate']");

    public MlCalHome(WebDriver driver) {
        this.driver = driver;
    }

    public Result fillDetails(String pp) {
        clearAndSendKeys(purchasePrice, pp);
        explicitWait(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(submitButton).click();
        return new Result(driver);

    }
}
