package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testsContextMenu(){
        var contextMenu = homePage.clickContextMenu();
        contextMenu.box_rightClick();
        String text = contextMenu.alert_getText();
        contextMenu.alert_ClickToAccept();
        assertEquals(text,"You selected a context menu","Alert text incorrect");
    }
}
