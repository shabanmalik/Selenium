package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void box_rightClick(){
        WebElement box_click = driver.findElement(box);
        Actions actions = new Actions(driver);
        actions.contextClick(box_click).perform();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_ClickToAccept(){
        driver.switchTo().alert().accept();
    }
}
