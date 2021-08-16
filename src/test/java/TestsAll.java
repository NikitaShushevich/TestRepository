import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestsAll extends TestInit {

    @Test
    public void testCart() {
        HeaderElements headerElements = new HeaderElements(driver);
        driver.manage().window().fullscreen();
        driver.get("https://dou.ua");
        headerElements.getBtnForums().click();
        checkUrl("https://dou.ua/forums/");
        headerElements.getBtnLenta().click();
        checkUrl("https://dou.ua/lenta/");
        headerElements.getBtnSalary().click();
        checkUrl("https://jobs.dou.ua/salaries/");
        headerElements.getBtnWork().click();
        checkUrl("https://jobs.dou.ua/");
        headerElements.getBtnCalendar().click();
        checkUrl("https://dou.ua/calendar/");



    }
    @Test
    public void testSearch(){
        HeaderElements headerElements = new HeaderElements(driver);
        driver.get("https://dou.ua");
        headerElements.getBtnSearch().sendKeys("character");
        enter();
    }

    private WebElement findElementByXpath(String locatorXpath) {
        return driver.findElement(By.xpath(locatorXpath));
    }

    private void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }

    private void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    public void enter(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);

    }

}
