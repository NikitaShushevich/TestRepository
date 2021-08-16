import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestInit {

    @Test
    public void testHomePage() {
        HomePageElements homePageElements = new HomePageElements(driver);
        driver.manage().window().fullscreen();
        driver.get("https://dou.ua");
        homePageElements.getAddClick().click();

        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        checkUrl("https://squad.ua/?from=header");

        driver.close();
        driver.switchTo().window(winHandleBefore);


    }
    @Test
    public void testMenu() {
        HomePageElements homePageElements = new HomePageElements(driver);
        driver.get("https://dou.ua");
        homePageElements.getBtnFirstJob().click();
        checkUrl("https://jobs.dou.ua/first-job/?from=doufp");
        back();
        homePageElements.getBtnCareer().click();
        checkUrl("https://dou.ua/lenta/tags/%D0%9A%D0%B0%D1%80%D1%8C%D0%B5%D1%80%D0%B0%20%D0%B2%20IT/?from=doufp");
        back();
        homePageElements.getBtnJunior().click();
        checkUrl("https://dou.ua/lenta/articles/juniors-2020/?from=doufp");
        back();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (WebElement ls: homePageElements.getList() ) {
            System.out.println(ls.findElement(By.xpath("//a")).getAttribute("href"));
        }
    }

    private void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }

    private void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    private void back() {
        driver.navigate().to("https://dou.ua");
    }

}
