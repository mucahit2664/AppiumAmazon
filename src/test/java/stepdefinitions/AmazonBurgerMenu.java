package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.android.AmazonBurgerMenuPage;
import utilities.Driver;

public class AmazonBurgerMenu {
    AmazonBurgerMenuPage amazonBurgerMenuPage=new AmazonBurgerMenuPage();

    @Given("click burger button")
    public void clickBurgerButton() {
    amazonBurgerMenuPage.burgerMenu.click();

    }

    @And("click shop by department")
    public void clickShopByDepartment() throws InterruptedException {
        amazonBurgerMenuPage.shopByDepartment.click();
        Thread.sleep(5000);
    }

    @And("list categories")
    public void listCategories() throws InterruptedException {
       Thread.sleep(4000);
        for (WebElement departments : amazonBurgerMenuPage.departmentList) {
            //System.out.println(departments.getText());
        }
    }

    @And("select a category")
    public void selectACategory() {
        amazonBurgerMenuPage.mensFashion.click();
    }

    @And("list sub categories")
    public void listSubCategories() throws InterruptedException {
        Thread.sleep(5000);
        for(WebElement mensList:amazonBurgerMenuPage.mensFashionList){
            //System.out.println(mensList.getText());
        }
        amazonBurgerMenuPage.burgerMenu.click();
    }
}
