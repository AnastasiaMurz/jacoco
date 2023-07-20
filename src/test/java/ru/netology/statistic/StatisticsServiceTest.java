package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxTwo() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1000000000, 15, 18, 3, 7, 190, 2594, 6758, 34567, 100, 1000000000};
        long expected = 1000000000;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxThree() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {0, 134, 3, 8, 50, 5, 25, 96, 10, 4, 0};
        long expected = 134;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}