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

    @Test(testName = "ReactComplexCase1: Fetch Email id from table", groups = "testTemp")
    public void testCaseOneReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findEmailID();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactComplexCase2: Fetch Address from table", groups = "testTemp")
    public void testCaseTwoReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findAddress();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactComplexCase3: Fetch Phone num from table", groups = "testTemp")
    public void testCaseThreeReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findPhoneNum();
        basePage.closeBrowserSession();
    }




}
