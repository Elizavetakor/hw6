package ru.netology.stats;

public class StatsService {
    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int sumSales(int[] sales) {
        int summarySales = 0;
        for (int i = 0; i < sales.length; i++) {
            summarySales += sales[i];
        }
        return summarySales;
    }
}

