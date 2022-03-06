package Appium.stepdefinitions;

import Appium.pages.AmazonSignInPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import Appium.utilities.Driver;

public class AmazonSigninStepDef {
AmazonSignInPage amazon=new AmazonSignInPage();
    @Given("Run the App")
    public void run_the_app() throws InterruptedException {

        Driver.getAppiumDriver();
//        if(amazon.marketPlace.isDisplayed()){
//            amazon.marketPlace.click();
//        }

    }

    @Given("sign in an account")
    public void signInAnAccount() throws InterruptedException {
       TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
//        Dimension dimension=Driver.getAppiumDriver().manage().window().getSize();
//        int x= (int) (dimension.width*0.6);
//        int y= (int) (dimension.height*0.125);
//        touchAction.press(PointOption.point(x,y)).release().perform();
        Thread.sleep(10000);
//       WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), 10);
//        MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(Driver.getAppiumDriver().findElementById("com.amazon.mShop.android.shopping:id/sign_in_button")));

        touchAction.longPress(ElementOption.element(Driver.getAppiumDriver().findElementById("com.amazon.mShop.android.shopping:id/sign_in_button"))).release().perform();
        Thread.sleep(3000);

    amazon.emailUserNameEditText.click();
    amazon.emailUserNameEditText.sendKeys("sametdeneme001@gmail.com");
    amazon.continueButton.click();
    amazon.passwordEditText.click();
    amazon.passwordEditText.sendKeys("TEAM15");
    amazon.signInButton2.click();

    }

    @Given("validate sign in")
    public void validateSignIn() throws InterruptedException {
        Thread.sleep(5000);
        amazon.accountIcon.click();
        Thread.sleep(15000);

       Assert.assertTrue(amazon.TEAM15Element.isDisplayed());
    }

    @Given("click home button")
    public void clickHomeButton() {
        amazon.homeIcon.click();
        amazon.homeIcon.click();
    }

    @Given("scroll bottom of page and click {string}")
    public void scrollBottomOfPageAndClick(String string) throws InterruptedException {
        // amazon.scrollToText("All Departments");
//        List<MobileElement> list;
//        do {
//            list = amazon.allDepartmentsList;
//            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
//            int start_x = (int) (dimension.width * 0.9);
//            int start_y = (int) (dimension.height * 0.8);
//
//            int end_x = (int) (dimension.width * 0.9);
//            int end_y = (int) (dimension.height * 0.1);
//
//            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
//            touchAction.press(PointOption.point(start_x, start_y)).
//                    moveTo(PointOption.point(end_x, end_y)).release().perform();
//        }while(list.size()==0);


        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

            int start_x = (int) (dimension.width * 0.5);
           int start_y = (int) (dimension.height * 0.8);

            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.height * 0.1);
        Thread.sleep(5000);
           TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
           touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();
        touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).release().perform();

        Assert.assertTrue(amazon.allDepartmentsText.isDisplayed());
        amazon.allDepartmentsText.click();


    }


}
