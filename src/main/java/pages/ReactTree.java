package pages;

import Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReactTree extends BasePage {

        public void openReactTreePage(){
            openReactTree();
            expandTrees();
        }

    private void expandTrees() {
        List<WebElement> unexpandedTreeList = driver.findElements(By.xpath("//span[contains(@class, 'react-grid-node-unexpanded')]"));
        for(WebElement e:unexpandedTreeList){
//            WebUtils.highlightElement(e);
            try{e.click();}
            catch (ElementNotInteractableException ex){
                //--- catching exception if the tree can no longer be expanded
            }
            WebUtils.waitForSeconds(2);
        }
    }

    public void findEmailID(){
            int tableRowCount = driver.findElements(By.xpath("//tr")).size();
            String personNameFromPage = "";
            String treeCategory = WebUtils.getPropertyFromParameters("tree.category");
            for(int i=1; i<tableRowCount-1; i++){
                personNameFromPage = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/span")).getText();
                if(personNameFromPage.equalsIgnoreCase("Category "+treeCategory)){
                    WebUtils.highlightElement(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/span")));
                    String emailID = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/span")).getText();
                    System.out.println(treeCategory+"'s email id is : "+emailID);
                    break;
                }
            }
        }

        public void findAddress(){
            int tableRowCount = driver.findElements(By.xpath("//tr")).size();
            String personNameFromPage = "";
            String treeCategory = WebUtils.getPropertyFromParameters("tree.category");
            for(int i=1; i<tableRowCount-1; i++){
                personNameFromPage = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/span")).getText();
                if(personNameFromPage.equalsIgnoreCase("Category "+treeCategory)){
                    WebUtils.highlightElement(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]/span")));
                    String address = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]/span")).getText();
                    System.out.println(treeCategory+"'s Address is : "+address);
                    break;
                }
            }
        }

        public void findPhoneNum(){
            int tableRowCount = driver.findElements(By.xpath("//tr")).size();
            String personNameFromPage = "";
            String treeCategory = WebUtils.getPropertyFromParameters("tree.category");
            for(int i=1; i<tableRowCount-1; i++){
                personNameFromPage = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/span")).getText();
                if(personNameFromPage.equalsIgnoreCase("Category "+treeCategory)){
                    WebUtils.highlightElement(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/span")));
                    String phoneNumber = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]/span")).getText();
                    System.out.println(treeCategory+"'s Phone number is : "+phoneNumber);
                    break;
                }
            }
        }

}
