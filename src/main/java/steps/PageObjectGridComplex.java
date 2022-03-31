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

    @Test(testName = "ReactComplexCase1: Fetch Email id from table")
    public void testCaseOneReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findEmailID();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactComplexCase2: Fetch Address from table")
    public void testCaseTwoReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findAddress();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactComplexCase3: Fetch Phone num from table")
    public void testCaseThreeReactComplex(){
        reactComplex.openReactComplexPage();
        reactComplex.findPhoneNum();
        basePage.closeBrowserSession();
    }




}
