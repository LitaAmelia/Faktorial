package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FaktorialPage {
    WebDriver driver;

    public FaktorialPage(WebDriver driver) {
        this.driver=driver;
    }

    //Locator

    By inputField = By.id("input");
    By countButton = By.id("hitung");

    public void inputData(String angka) {
        driver.findElement(inputField).sendKeys(angka);
    }
    public void clickHitung() {
        driver.findElement(countButton).click();
    }
}
