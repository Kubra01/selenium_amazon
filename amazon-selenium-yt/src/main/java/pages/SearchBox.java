package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {
    //arama kutusuna alacagın ürünü gir
    By searchBoxLocator = By.id("twotabsearchtextbox");
    //tıkla-ara
    By submitButtonLocator = By.id("nav-search-submit-button");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}
