package edu.sumdu.tss.elephant.helper.utils;

import edu.sumdu.tss.elephant.helper.exception.BackupException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CmdUtilTest {

    @Test
    public void testExec() {
        try {
            CmdUtil.exec("ipconfig");
        } catch (BackupException e) {
            fail("Should not throw an exception");
        }

        assertThrows(BackupException.class, () -> {
            CmdUtil.exec("ipconfig invalid");
        });

        assertThrows(BackupException.class, () -> {
            CmdUtil.exec("invalid command");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            CmdUtil.exec("");
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            CmdUtil.exec(" ");
        });

        assertThrows(NullPointerException.class, () -> {
            CmdUtil.exec(null);
        });
    }
}