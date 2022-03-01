package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class AmazonSearchPage {
    public AmazonSearchPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)),this);
    }

    @AndroidFindBy(accessibility = "Home Tab 1 of 4")
    public MobileElement homeIcon;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
    public MobileElement searchClick;
    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement searchInbox;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text")
    public MobileElement searchProduct;

    @AndroidFindBy(xpath = "//android.view.View[@text='Sony Wireless Noise Cancelling Headphones WHCH710N - Over The Ear Bluetooth Headset with Mic for Phone-Call – Black + NeeGo 3.5mm Headphone Extension Cable, 10ft']")
    public MobileElement textProduct;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='Filters']")
    public MobileElement filtersButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sort by']")
    public MobileElement sortBy;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Over-Ear Headphones']")
    public MobileElement aProductFromCategory;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Price: High to Low']")
    public List<MobileElement> sortbyHightoLowList;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Price: High to Low']")
    public MobileElement sortbyHightoLow;

    @AndroidFindBy(xpath = "//*[@text='Added to your cart']")
    public MobileElement addedToCart;

    @AndroidFindBy(xpath = "//*[@text='DONE']")
    public MobileElement doneButton;

   @AndroidFindBy(xpath = "//*[@text='Close']")
    public MobileElement closeButton;

    @AndroidFindBy(xpath = "//*[@text='Brands']")
    public MobileElement brandsText;

    @AndroidFindBy(xpath = "//android.view.View[@text='RESULTS']")
    public MobileElement resultText;

    @AndroidFindBy(xpath = "//*[contains(@text,'Sony')]")
    public List<MobileElement> containTextSony;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Samsung')]")
    public List<MobileElement> containTextSamsung;

    @AndroidFindBy(xpath = "//*[@text='Next']")
    public MobileElement nextButton;

    @AndroidFindBy(className = "android.widget.TextView")
    public List<MobileElement> nextList;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ape_detail_mobile-app-detail-ilm_mshop_text\")")
    public MobileElement sourcePoint;

    @AndroidFindBy(accessibility = "B07741S7Y8?pd_rd_w=pRl9Z&pf_rd_p=3dcbbcc3-a01a-4efd-a9e7-4ec7950cf494&pf_rd_r=2ET5Y7AAHTHZWTWAW92Z&pd_rd_r=bcf2b16f-064a-4605-a95f-2541229d6b00&pd_rd_wg=4yRYD")
    public MobileElement kindelText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
    public MobileElement addtoCartButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Cart 1 item Tab 3 of 4\"]/android.widget.ImageView")
    public MobileElement cartIcon;

     @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"sc-buy-box\")")
    public MobileElement subtotalText;

     @AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
    public MobileElement subTotalPrice;

    @AndroidFindBy(xpath = "(//android.view.View)[29]")
    public MobileElement firstProductPrice;

    @AndroidFindBy(xpath = "(//android.view.View)[58]")
    public MobileElement secondProductPrice;



}
