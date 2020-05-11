package ru.netology;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CashbackHackServiceJupiterTest {

    @Test
    public void shouldCalculateCashBackReal() {
        CashbackHackService  service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateCashBackZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateCashBackSeven() {
        CashbackHackService service = new CashbackHackService();
        int amount = 7;

        int actual = service.remain(amount);
        int expected = 993;

        assertEquals(actual, expected);
    }

}