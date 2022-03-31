package steps;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.ReactComplex;

public class PageObjectGridComplex {
    BasePage basePage;
    ReactComplex reactComplex;

    public PageObjectGridComplex(){
        basePage = new BasePage();
        reactComplex = new ReactComplex();
    }

    @Test(testName = "ReactComplexCase1")
    public void testCaseOneReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findEmailID();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactComplexCase2")
    public void testCaseTwoReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findAddress();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactComplexCase3")
    public void testCaseThreeReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findPhoneNum();
        basePage.closeBrowserSession();
    }




}
