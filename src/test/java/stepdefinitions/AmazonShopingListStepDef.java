package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.android.AmazonShopingListPage;
import utilities.Driver;

public class AmazonShopingListStepDef {

    AmazonShopingListPage amazonShopingList=new AmazonShopingListPage();

    @And("click {string} button")
    public void clickButton(String list) {
        amazonShopingList.shopinglistButton.click();

    }

    @And("create a list")
    public void createAList() throws InterruptedException {
        Thread.sleep(4000);
        amazonShopingList.createAlistButton.click();
        amazonShopingList.createListNameInbox.click();
        Driver.getAppiumDriver().hideKeyboard();
        amazonShopingList.createListNameInbox.sendKeys("firstShop");
        amazonShopingList.createButton.click();


    }

    @And("add an idea on more options")
    public void addAnIdeaOnMoreOptions() {
        amazonShopingList.moreOptionsfirstShop.click();
        amazonShopingList.addIdeaButton.click();
        amazonShopingList.addIdeaInbox.click();
        Driver.getAppiumDriver().hideKeyboard();
        amazonShopingList.addIdeaInbox.sendKeys("books");
        amazonShopingList.addButton.click();
        amazonShopingList.doneButton.click();
    }

    @And("delete idea on more options")
    public void deleteIdeaOnMoreOptions() throws InterruptedException {
        amazonShopingList.moreOptionsIdea.click();
        amazonShopingList.deleteButton.click();
       Assert.assertTrue(amazonShopingList.deletedText.isDisplayed());
    }

    @And("delete ceated shoping list")
    public void deleteCeatedShopingList() {
        amazonShopingList.moreOptionsfirstShop.click();
        amazonShopingList.deleteListButton.click();
        amazonShopingList.deleteYESbutton.click();
       // Assert.assertFalse(amazonShopingList.firstShopText.isDisplayed());
    }
}
