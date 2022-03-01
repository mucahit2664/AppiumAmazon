package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import pages.android.AmazonSearchPage;

import utilities.Driver;

import java.util.*;

public class AmazonSearchStepDef {
    AmazonSearchPage amazonSearchPage = new AmazonSearchPage();

    @Given("click search inbox")
    public void clickSearchInbox() throws InterruptedException {
        amazonSearchPage.homeIcon.click();
        Thread.sleep(4000);
        amazonSearchPage.searchClick.click();

        Thread.sleep(4000);
    }

    @And("search {string}")
    public void search(String product) throws InterruptedException {

        amazonSearchPage.searchInbox.sendKeys(product);
        ((AndroidDriver) Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));

        Thread.sleep(4000);
        Random rand = new Random();
        int randomProduct = rand.nextInt(amazonSearchPage.containTextSony.size());
        amazonSearchPage.containTextSony.get(randomProduct).click();
        Thread.sleep(3000);
        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);
        int end_x = (int) (dimension.width * 0.5);
        int end_y = (int) (dimension.height * 0.1);
        TouchAction touchAction1 = new TouchAction(Driver.getAppiumDriver());
        touchAction1.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        amazonSearchPage.addtoCartButton.click();
    }

    @And("validate first product include it")
    public void validateFirstProductIncludeIt() {
//        String actualProduct = amazonSearchPage.textProduct.getText();
//        Assert.assertTrue(actualProduct.contains(ConfigReader.getProperty("product")));
    }

    @Then("filters validate and click")
    public void filtersValidateAndClick() throws InterruptedException {
        amazonSearchPage.searchClick.click();
        ((AndroidDriver) Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
        Assert.assertTrue(amazonSearchPage.filtersButton.isDisplayed());
        amazonSearchPage.filtersButton.click();
        Thread.sleep(3000);
    }

    @Then("select {string} category")
    public void selectCategory(String aCategory) throws InterruptedException {
        Thread.sleep(3000);
        amazonSearchPage.aProductFromCategory.click();

    }

    @Then("validate sort and click high to low")
    public void validateSortAndClickHighToLow() {
            amazonSearchPage.brandsText.click();
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

            int start_x = (int) (dimension.width * 0.9);
            int start_y = (int) (dimension.height * 0.8);

            int end_x = (int) (dimension.width * 0.9);
            int end_y = (int) (dimension.height * 0.1);

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y)).
                    moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).
                moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).
                moveTo(PointOption.point(end_x, end_y)).release().perform();

        Assert.assertTrue(amazonSearchPage.sortBy.isDisplayed());
        amazonSearchPage.sortbyHightoLow.click();
    }

    @Then("scroll page and add product to a list")
    public void scrollPageAndAddProductToAList() throws InterruptedException {
        Thread.sleep(2000);
        amazonSearchPage.closeButton.click();
        amazonSearchPage.resultText.click();

        List<String> list=new ArrayList<>();
        for(MobileElement s:amazonSearchPage.containTextSony) {
            list.add(s.getText());
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
            int start_x = (int) (dimension.width * 0.8);
            int start_y = (int) (dimension.height * 0.8);
            int end_x = (int) (dimension.width * 0.8);
            int end_y = (int) (dimension.height * 0.2);
            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
            touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
            list.add(s.getText());
           touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
            list.add(s.getText());
//            if (amazonSearchPage.nextButton.isDisplayed()){
//                break;
//            };

         //touchAction.press(PointOption.point(end_x, end_y)).moveTo(PointOption.point(start_x, start_y)).release().perform();
        }
        System.out.println(list);


    }


    @Given("select random products add to cart")
    public void selectRandomProductsAddToCart() throws InterruptedException {
        amazonSearchPage.searchClick.click();
        amazonSearchPage.searchInbox.sendKeys("Samsung");
        ((AndroidDriver) Driver.getAppiumDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
        Random random = new Random();
        int randomSamsung = random.nextInt(amazonSearchPage.containTextSamsung.size());
        amazonSearchPage.containTextSamsung.get(randomSamsung).click();
        Thread.sleep(4000);

        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);
        int end_x = (int) (dimension.width * 0.5);
        int end_y = (int) (dimension.height * 0.1);
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(start_x, start_y)).
                moveTo(PointOption.point(end_x, end_y)).release().perform();
        amazonSearchPage.addtoCartButton.click();
    }

    @Then("validate them")
    public void validateThem() {
      // Assert.assertTrue(amazonSearchPage.addedToCart.isDisplayed());
      //  amazonSearchPage.doneButton.click();
    amazonSearchPage.cartIcon.click();
    Assert.assertTrue(amazonSearchPage.subtotalText.isDisplayed());

    String subtotal=amazonSearchPage.subTotalPrice.getText().replace("$", "");
    String firstProductPrice=amazonSearchPage.firstProductPrice.getText().replace("$", "");
    String secondProductPrice=amazonSearchPage.secondProductPrice.getText().replace("$", "");
        System.out.println(subtotal+" "+firstProductPrice+" "+secondProductPrice);
        double total = Double.parseDouble(firstProductPrice)+Double.parseDouble(secondProductPrice);
        String result = String.valueOf(total) ;
        Assert.assertEquals(subtotal,result);
    }
}

