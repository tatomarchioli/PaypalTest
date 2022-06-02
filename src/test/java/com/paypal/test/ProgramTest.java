package com.paypal.test;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;


class ProgramTest {

    @Test
    void fourNumberSumTestCase1() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);
        assertThat(result,
                hasItems(new Integer[]{7, 6, 4, -1},
                        new Integer[]{7, 6, 1, 2}));
    }

    @Test
    void fourNumberSumTestCase2() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);
        assertThat(result, hasItem(new Integer[]{1, 2, 3, 4}));
    }

    @Test
    void fourNumberSumTestCase3() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{5, -5, -2, 2, 3, -3}, 0);
        assertThat(result,
                hasItems(new Integer[]{5, -5, -2, 2},
                        new Integer[]{5, -5, 3, -3},
                        new Integer[]{-2, 2, 3, -3}));
    }

    @Test
    void fourNumberSumTestCase4() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        assertThat(result,
                hasItems(new Integer[]{-2, -1, 1, 6},
                        new Integer[]{-2, 1, 2, 3},
                        new Integer[]{-2, -1, 2, 5},
                        new Integer[]{-2, -1, 3, 4}));
    }

    @Test
    void fourNumberSumTestCase5() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3}, 30);
        assertThat(result,
                hasItems(new Integer[]{-1, 22, 7, 2},
                        new Integer[]{22, 4, 7, -3},
                        new Integer[]{-1, 18, 11, 2},
                        new Integer[]{18, 4, 11, -3},
                        new Integer[]{22, 11, 2, -5}));
    }

    @Test
    void fourNumberSumTestCase6() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, 20);
        assertThat(result,
                hasItems(new Integer[]{-5, 2, 15, 8},
                        new Integer[]{-3, 2, -7, 28},
                        new Integer[]{-10, -3, 28, 5},
                        new Integer[]{-10, 28, -6, 8},
                        new Integer[]{-7, 28, -6, 5},
                        new Integer[]{-5, 2, 12, 11},
                        new Integer[]{-5, 12, 8, 5}));
    }

    @Test
    void fourNumberSumTestCase7() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5}, 100);
        assertThat(result, hasSize(0));
    }

    @Test
    void fourNumberSumTestCase8() {
        List<Integer[]> result = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, 5);
        assertThat(result,
                hasItems(new Integer[]{2, 3, 5, -5},
                        new Integer[]{1, 4, 5, -5},
                        new Integer[]{2, 4, 5, -6},
                        new Integer[]{1, 3, -5, 6},
                        new Integer[]{2, 3, 6, -6},
                        new Integer[]{1, 4, 6, -6}));
    }
}