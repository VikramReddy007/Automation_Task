package Utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public static String getPropertyFromParameters(String paramName) {
        PropertiesConfiguration parameterProps = null;
        try {
            parameterProps = new PropertiesConfiguration("src/main/resources/data/Parameters.properties");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        return (String) parameterProps.getProperty(paramName);
    }

    public static void highlightElement( WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String backgroundAttribute = ele.getCssValue("background");
        String borderAttribute = ele.getCssValue("border");
        //use executeScript() method and pass the arguments
        //Here i pass values based on css style. Yellow background color with solid red color border.
            js.executeScript("arguments[0].scrollIntoView();", ele);
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
            WebUtils.waitForSeconds(0.3);
            js.executeScript("arguments[0].setAttribute('style', 'background: " + backgroundAttribute + "; border: " + borderAttribute + ";');", ele);
            WebUtils.waitForSeconds(0.3);
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
            WebUtils.waitForSeconds(0.3);
            js.executeScript("arguments[0].setAttribute('style', 'background: " + backgroundAttribute + "; border: " + borderAttribute + ";');", ele);
            WebUtils.waitForSeconds(0.3);
            js.executeScript("arguments[0].setAttribute('style', 'background: " + backgroundAttribute + "; border: " + borderAttribute + ";');", ele);
            WebUtils.waitForSeconds(0.3);
            WebUtils.waitForSeconds(2);
    }

    public static void waitForSeconds(double secondCount){
        try {
            Thread.sleep((long) (secondCount*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
