package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;

    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameText(){
        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String text = getFrameText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }
    public String getBottomFrameText(){
        switchToFrame(bottomFrame);
        String text = getFrameText();
        switchToParentFrame();
        return text;
    }

    public String getFrameText(){
        return driver.findElement(body).getText();
    }

    private void switchToFrame(String frame){
        driver.switchTo().frame(frame);
    }

    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
}
