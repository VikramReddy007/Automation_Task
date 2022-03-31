package pages;

import Utils.WebUtils;
import org.openqa.selenium.By;

public class ReactComplex extends BasePage{

    public void openReactComplexPage(){
        openReactComplex();
    }

    public void findEmailID(){
        int tableRowCount = driver.findElements(By.xpath("//tr")).size();
        String personNameFromPage = "";
        String personNameToSearch = WebUtils.getPropertyFromParameters("customer.name");
        for(int i=1; i<tableRowCount-1; i++){
            personNameFromPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[2]/span")).getText();
            if(personNameFromPage.equalsIgnoreCase(personNameToSearch)){
                String emailID = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[4]/span")).getText();
                System.out.println(personNameToSearch+"'s email id is : "+emailID);
                break;
            }
        }
    }

    public void findAddress(){
        int tableRowCount = driver.findElements(By.xpath("//tr")).size();
        String personNameFromPage = "";
        String personNameToSearch = WebUtils.getPropertyFromParameters("customer.name");
        for(int i=1; i<tableRowCount-1; i++){
            personNameFromPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[2]/span")).getText();
            if(personNameFromPage.equalsIgnoreCase(personNameToSearch)){
                String address = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[5]/span")).getText();
                System.out.println(personNameToSearch+"'s Address is : "+address);
                break;
            }
        }
    }

    public void findPhoneNum(){
        int tableRowCount = driver.findElements(By.xpath("//tr")).size();
        String personNameFromPage = "";
        String personNameToSearch = WebUtils.getPropertyFromParameters("customer.name");
        for(int i=1; i<tableRowCount-1; i++){
            personNameFromPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[2]/span")).getText();
            if(personNameFromPage.equalsIgnoreCase(personNameToSearch)){
                String phoneNumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[4]/table/tbody/tr["+i+"]/td[3]/span")).getText();
                System.out.println(personNameToSearch+"'s Phone number is : "+phoneNumber);
                break;
            }
        }
    }

}
