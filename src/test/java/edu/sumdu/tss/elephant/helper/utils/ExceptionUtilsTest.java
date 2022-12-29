package edu.sumdu.tss.elephant.helper.utils;

import org.junit.Test;


import static org.junit.Assert.*;

public class ExceptionUtilsTest {

    @Test
    public void testIsSQLUniqueException() {
        Exception ex = new Exception("duplicate key value violates unique constraint");
        Exception ex2 = new Exception("invalid");
        assertTrue(ExceptionUtils.isSQLUniqueException(ex));
        assertFalse(ExceptionUtils.isSQLUniqueException(ex2));
    }

    @Test
    public void testStackTrace() {
        Exception ex = new Exception("Some message");

        String stacktrace = ExceptionUtils.stacktrace(ex);

        assertTrue(stacktrace.contains("java.lang.Exception: Some message"));
    }
}