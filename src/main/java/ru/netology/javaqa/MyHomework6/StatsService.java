package ru.netology.javaqa.MyHomework6;

public class StatsService {

    public int amountOfSales(long[] sales) { //сумма продаж
        int amount = 0;

        for (long sale : sales) {
            amount = amount + (int) sale;
        }

        return amount;
    }

    public int averageSalesAmount(long[] sales) { //средняя сумма продаж
        int amount = amountOfSales(sales);
        int average = amount / sales.length;

        return average;
    }

    public int maxAmountMonth(long[] sales) { //номер месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minAmountMonth(long[] sales) { //номер месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthSalesAboveAverage(long[] sales) { //количество месяцев с продажами выше среднего
        int average = averageSalesAmount(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }

    public int monthSalesBelowAverage(long[] sales) { //количество месяцев с продажами ниже среднего
        double average = averageSalesAmount(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }
}
