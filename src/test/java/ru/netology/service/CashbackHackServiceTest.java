package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainWhenAmountIsBelowBoundary() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWhenAmountIsAboveBoundary() {
        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldWorkWithBoundaryValuesBelowBoundary() {
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldWorkWithBoundaryValuesAboveBoundary() {
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWhenAmountEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
