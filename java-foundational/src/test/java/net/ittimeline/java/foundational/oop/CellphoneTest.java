package net.ittimeline.java.foundational.oop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CellphoneTest {
    Cellphone cellphone = new Cellphone("model", "brand", Integer.valueOf(0), "color", Integer.valueOf(0));

    @Test
    public void testShowCellphoneInfo() {
        cellphone.showCellphoneInfo();
    }

    @Test
    public void testCall() {
        cellphone.call(0L);
    }

    @Test
    public void testSendMessage() {
        cellphone.sendMessage(0L, "message");
    }

    @Test
    public void testToString() {
        String result = cellphone.toString();
        Assert.assertEquals(result, "replaceMeWithExpectedResult");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme