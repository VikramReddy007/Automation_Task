package steps;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.ReactComplex;
import pages.ReactTree;

public class PageObjectGridTree {
    BasePage basePage;
    ReactTree reactTree;

    public PageObjectGridTree(){
        basePage = new BasePage();
        reactTree = new ReactTree();
    }

    @Test(testName = "ReactTreeCase1: Fetch Email id from table")
    public void testCaseOneReactTree(){
        reactTree.openReactTreePage();
        reactTree.findEmailID();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactTreeCase2: Fetch Address from table")
    public void testCaseTwoReactTree(){
        reactTree.openReactTreePage();
        reactTree.findAddress();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactTreeCase3: Fetch Phone number from table")
    public void testCaseThreeReactTree(){
        reactTree.openReactTreePage();
        reactTree.findPhoneNum();
        basePage.closeBrowserSession();
    }
}
