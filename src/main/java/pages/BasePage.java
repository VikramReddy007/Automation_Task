package pages;

import Utils.WebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void openReactHomePage(){
        driver.get("https://react-redux-grid.herokuapp.com/");
        WebUtils.waitForPageLoad();
        System.out.println("Page title ->"+driver.getTitle());
        System.out.println("Waited until page is loaded!");
    }

    public void closeBrowserSession(){
        WebUtils.waitForPageLoad();
        System.out.println("Closing browser session!");
        driver.quit();
    }
}
