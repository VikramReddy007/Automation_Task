package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.function.Function;

public class WebUtils extends BasePage {


    public static void waitForPageLoad() {

        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(input -> (Function<WebDriver, Boolean>) driver -> {
            assert driver != null;
            System.out.println("Current Window State       : "
                    + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
            return String
                    .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                    .equals("complete");
        });
    }
}
