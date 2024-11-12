package odyssey.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OdysseyPom {
    WebDriver driver;
    public OdysseyPom(WebDriver driver){
        this.driver=driver;
    }
    public void clickActionByXpath(String val)
    {
        driver.findElement(By.xpath(val)).click();
    }

    public void clickActionById(String val)
    {
        driver.findElement(By.id(val)).click();
    }

    public void sendkeysByXpath(String val,String val1)
    {
        driver.findElement(By.xpath(val)).sendKeys(val1);
    }

    public void sendkeysById(String val,String val1)
    {
        driver.findElement(By.id(val)).sendKeys(val1);
    }

    public boolean elementfindxpath(String val)
    {
        WebElement sk=driver.findElement(By.xpath(val));
        boolean a=sk.isDisplayed();
        return true;
    }

    public void elementfindid(String val)
    {
        WebElement sk=driver.findElement(By.id(val));
        boolean a=sk.isDisplayed();
    }

    public void toggleActionById(String val,String val1)
    {
        switch(val1)
        {
            case "select all" -> driver.findElement(By.id(val)).sendKeys(Keys.CONTROL+"A");
            case "backspace" -> driver.findElement(By.id(val)).sendKeys(Keys.BACK_SPACE);
            case "enter" -> driver.findElement(By.id(val)).sendKeys(Keys.ENTER);
        }
    }
    public void hoverXpath(String val)
    {
        WebElement hoveridwise=driver.findElement(By.xpath(val));
        Actions ak=new Actions(driver);
        ak.moveToElement(hoveridwise).perform();

    }
}
