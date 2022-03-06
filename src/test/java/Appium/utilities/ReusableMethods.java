package Appium.utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReusableMethods {

      public static void clickOnPage(String pageName) throws InterruptedException {
          Thread.sleep(4000);
          List<MobileElement> pages = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
          for (MobileElement page: pages) {
              if (page.getText().equals(pageName)){
                  page.click();
                  break;
              }else{
                  scrollWithUiScrollable(pageName);
                  break;
              }
          }
      }

//ikinci alternatif bir method
    public static void clickOnPage1(String pageName) throws InterruptedException {
        Thread.sleep(4000);
        List<MobileElement> pages = Driver.getAppiumDriver().findElementsByXPath("//*[@text='"+pageName+"']");
        if (pages.size()>0){
            pages.get(0).click();
        }else scrollWithUiScrollable(pageName);
    }



      public static void scrollWithUiScrollable(String elementText){
          AndroidDriver  driver = (AndroidDriver) Driver.getAppiumDriver();
          driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
          driver.findElementByXPath("//*[@text='"+elementText+"']").click();
      }

      public static void longPressOnElement(MobileElement mobileElement){
          TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
          touchAction.longPress(ElementOption.element(mobileElement)).release().perform();
      }

      public static void clickOnPageIOS(String text){
          List<MobileElement> pages = Driver.getAppiumDriver().findElementsByXPath("//XCUIElementTypeStaticText[@name='"+text+"']");
          if (pages.get(0).isDisplayed()){
              pages.get(0).click();
          }else{
              scrollAndClickOnIOS(text);
          }


      }

      public static void scrollAndClickOnIOS(String text){
          HashMap<String, Object> scrollObject = new HashMap<>();
          scrollObject.put("direction", "down");
          scrollObject.put("value",text);
          Driver.getAppiumDriver().executeScript("mobile: scroll", scrollObject);

          Driver.getAppiumDriver().findElementByXPath("//XCUIElementTypeStaticText[@name='"+text+"']").click();
      }
    // To get the text of the lists
    public List<String> getLists(String element) {
        List<String> list = new ArrayList<String>();
        List<MobileElement> lists = (List<MobileElement>) Driver.getAppiumDriver().findElementByXPath(element);
        for (int i = 0; i < lists.size(); i++) {
            String text = lists.get(i).getText();
            list.add(text);
        }
        return list;
    }

    public void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollscreenJS() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getAppiumDriver();
        js.executeScript("window.scrollBy(0,1000)");



    }

}
