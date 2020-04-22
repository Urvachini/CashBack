package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int boundary = 100;

        int actual = service.calculateRemain(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }
}
}