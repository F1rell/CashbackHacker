package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void test1() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackService.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testIfPurchaseEquals1000() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}