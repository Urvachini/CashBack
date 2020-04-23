package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateCashBackReal() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldCalculateCashBackZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldCalculateCashBackUnrealSeven() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7;

        int actual = service.remain(amount);
        int expected = 993;

        assertEquals(actual, expected);
    }
}