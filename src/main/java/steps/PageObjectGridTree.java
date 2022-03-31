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

    @Test(testName = "ReactTreeCase1")
    public void testCaseOneReactTree(){
        reactTree.openReactTreePage();
        reactTree.findEmailID();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactTreeCase2")
    public void testCaseTwoReactTree(){
        reactTree.openReactTreePage();
        reactTree.findAddress();
        basePage.closeBrowserSession();
    }

    @Test(testName = "ReactTreeCase3")
    public void testCaseThreeReactTree(){
        reactTree.openReactTreePage();
        reactTree.findPhoneNum();
        basePage.closeBrowserSession();
    }
}
