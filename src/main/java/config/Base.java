package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
    protected WebDriver driver;
    public WebDriver invokeBrowser(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    protected String baseURL = "https://qa.putraprima.id/";
}
