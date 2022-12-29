package edu.sumdu.tss.elephant.helper.enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class LangTest {
    @Test
    public void testByValue() {
        assertEquals(Lang.EN, Lang.byValue("en"));
        assertEquals(Lang.UK, Lang.byValue("uk"));

        try {
            Lang.byValue("invalid");
        } catch (RuntimeException e) {
            assertEquals("Language not found forinvalid", e.getMessage());
        }
    }
}