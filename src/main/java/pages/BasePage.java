package pages;

import Utils.WebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver.exe");
    }

    public void beginPage(){
        if(System.getProperty("os.name").equalsIgnoreCase("linux")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
        }
        else driver = new ChromeDriver();
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
