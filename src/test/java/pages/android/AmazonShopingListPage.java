package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AmazonShopingListPage {

    public AmazonShopingListPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)),this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"wl\")")
    public MobileElement shopinglistButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"+Create a List\"]/android.widget.TextView[2]")
    public MobileElement createAlistButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"createlist-list-name-textinput\")")
    public MobileElement createListNameInbox;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement createButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"More Options\"]")
    public MobileElement moreOptions;

    @AndroidFindBy(xpath = "//*[@text='Add an idea to list']")
    public MobileElement addIdeaButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"idea-text-input\")")
    public MobileElement addIdeaInbox;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add']")
    public MobileElement addButton;

    @AndroidFindBy(xpath = "//android.view.View[@text='Done']")
    public MobileElement doneButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"More Options\"])[2]")
    public MobileElement moreOptionsIdea;

    @AndroidFindBy(xpath = "//*[@text='Delete']")
    public MobileElement deleteButton;

    @AndroidFindBy(xpath = "//*[@text='bookswas deleted from this list']")
    public MobileElement deletedText;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"View lists\"]/android.widget.TextView")
    public MobileElement viewListButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"More Options\"])[1]")
    public MobileElement moreOptionsfirstShop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete List']")
    public MobileElement deleteListButton;

    @AndroidFindBy(xpath = "//*[@text='Yes']")
    public MobileElement deleteYESbutton;

    @AndroidFindBy(xpath = "(//*[@text='firstShop'])[1]")
    public MobileElement firstShopText;

}
