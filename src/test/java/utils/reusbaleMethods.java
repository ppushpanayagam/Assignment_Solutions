package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class reusbaleMethods {
    public static WebDriver driver;
    public static Properties prop;


    public void invokeApp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("Base_URL"));
    }
    public void loadProperties() throws IOException {
        FileInputStream fis = new FileInputStream(new File("./src/main/resources/object.properties"));
        prop = new Properties();
        prop.load(fis);
    }
    public void clickButtonbyXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void verifyTitle(String data){
        String title = driver.getTitle();
        Assert.assertEquals(data, title);
    }
    public void enterTextById(String locator, String data){
        driver.findElement(By.id(locator)).clear();
        driver.findElement(By.id(locator)).sendKeys(data);
    }
    public void clickButtonbyId(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void verifyTextByXpath(String locator, String data){
        String text = driver.findElement(By.xpath(locator)).getText();
        Assert.assertEquals(data, text.trim());
    }
    public void moseHover(String locator, String locator1){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(locator));
        WebElement element2 = driver.findElement(By.xpath(locator1));
        action.moveToElement(element).moveToElement(element2).build();
    }
    public void clickButtonByName(String locator){
        driver.findElement(By.name(locator)).click();
    }
    public void switchToFrame(){
        driver.switchTo().frame(0);
    }
    public void switchTodefaultContent(){
        driver.switchTo().defaultContent();
    }
    public void quitDriver(){
        driver.close();
        driver.quit();
    }
}
