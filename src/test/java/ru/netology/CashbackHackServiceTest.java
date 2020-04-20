package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateCashBackReal() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateCashBackUnreal() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}