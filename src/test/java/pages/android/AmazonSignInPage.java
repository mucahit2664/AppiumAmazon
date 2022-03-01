package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class AmazonSignInPage {

    public AmazonSignInPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)),this);
    }

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/btn_stay_marketplace")
    public MobileElement marketPlace;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
    public MobileElement signInButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ap_email_login\")")
    public MobileElement emailUserNameEditText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"continue\")")
    public MobileElement continueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ap_password\")")
    public MobileElement passwordEditText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"signInSubmit\")")
    public MobileElement signInButton2;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Your Amazon.com Tab 2 of 4\"]/android.widget.ImageView")
    public MobileElement accountIcon;

    @AndroidFindBy(xpath = "//*[@text='TEAM15']")
    public MobileElement TEAM15Element;

    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"All Departments\"]/android.widget.TextView")
    public MobileElement allDepartmentsText;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"All Departments\"]/android.widget.TextView")
    public List<MobileElement> allDepartmentsList;

    @AndroidFindBy(id="com.amazon.mShop.android.shopping:id/mshop_webView_container")
    public MobileElement allDepartmentsContainer;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home Tab 1 of 4\"]")
    public MobileElement homeIcon;

    public void scrollToText(String text) {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
    }
}
