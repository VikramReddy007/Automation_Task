package pages;

import Utils.WebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver.exe");
    }

    public void beginPage(){
        driver = new ChromeDriver();
    }

    public void openReactHomePage(){
        driver.get("https://react-redux-grid.herokuapp.com/");
        WebUtils.waitForPageLoad();
        System.out.println("Page title ->"+driver.getTitle());
        System.out.println("Waited until page is loaded!");
    }

    public void openReactComplex(){
        beginPage();
        driver.get(WebUtils.getPropertyFromParameters("react.complex.url"));
        WebUtils.waitForPageLoad();
        driver.manage().window().maximize();
    }

    public void openReactTree(){
        beginPage();
        driver.get(WebUtils.getPropertyFromParameters("react.tree.url"));
        WebUtils.waitForPageLoad();
        driver.manage().window().maximize();
    }

    public void closeBrowserSession(){
        WebUtils.waitForPageLoad();
        System.out.println("Closing browser session!");
        driver.quit();
    }
}
