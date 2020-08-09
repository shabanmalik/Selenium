package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFrameTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        var nestedFramesPage = homePage.clickNestedFrames();
        String leftFrameText = nestedFramesPage.getLeftFrameText();
        String bottomFrameText = nestedFramesPage.getBottomFrameText();
        assertEquals(leftFrameText,"LEFT", "Left frame text incorrect");
        assertEquals(bottomFrameText,"BOTTOM", "Bottom frame text incorrect");
    }
}
