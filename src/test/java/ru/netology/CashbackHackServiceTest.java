package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {


    @org.junit.Test
    public void shouldCalculateCashBackReal() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }


    @org.junit.Test
    public void shouldCalculateCashBackZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }


    @org.junit.Test
    public void shouldCalculateCashBackUnrealSeven() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7;

        int actual = service.remain(amount);
        int expected = 993;

        assertEquals(actual, expected);
    }
}
