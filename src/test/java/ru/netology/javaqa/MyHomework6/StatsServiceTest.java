package ru.netology.javaqa.MyHomework6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateAmountOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.amountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxAmountMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxAmountMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinAmountMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minAmountMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}

