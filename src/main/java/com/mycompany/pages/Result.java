package com.mycompany.pages;

import com.mycompany.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Result extends TestBase {
    private By monthlyPayment= By.xpath("//table[@id='summary']//tr//tr[1]//td[1]//div[1]");
    public  Result(WebDriver driver){
        this.driver=driver;

    }
    public String getMonthlyPayment(){
        explicitWait(ExpectedConditions.presenceOfElementLocated(monthlyPayment));
        return driver.findElement(monthlyPayment).getText();

    }
}

