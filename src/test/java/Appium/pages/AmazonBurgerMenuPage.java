package Appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import Appium.utilities.Driver;

import java.time.Duration;
import java.util.List;

public class AmazonBurgerMenuPage {

    public AmazonBurgerMenuPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)),this);
    }

    @AndroidFindBy(accessibility = "Menu. Contains your orders, your account, shop by department, programs and features, settings, and customer service Tab 4 of 4")
    public MobileElement burgerMenu;

    @AndroidFindBy(xpath = "//*[@text='Shop by Department']")
    public MobileElement shopByDepartment;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
    public List<MobileElement> departmentList;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[13]")
    public MobileElement mensFashion;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
    public List<MobileElement> mensFashionList;

}
