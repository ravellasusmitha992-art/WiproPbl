package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks dt = new DailyTasks();

        String names[] = {"Ram", "Sita", "Ravi"};

        assertTrue(dt.checkPresence(names, "Ram"));

        assertFalse(dt.checkPresence(names, "Krishna"));
    }
}