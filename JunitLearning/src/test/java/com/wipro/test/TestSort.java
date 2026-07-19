package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks dt = new DailyTasks();

        int input[] = {5, 2, 4, 1, 3};
        int expected[] = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, dt.sortValues(input));
    }
}