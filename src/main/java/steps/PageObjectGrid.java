package steps;

import org.testng.annotations.Test;
import pages.BasePage;

public class PageObjectGrid {
    BasePage basePage;

    public PageObjectGrid(){
        basePage = new BasePage();
    }

    @Test
    public void openHomePage(){
        basePage.openReactHomePage();
        basePage.closeBrowserSession();
    }
}
