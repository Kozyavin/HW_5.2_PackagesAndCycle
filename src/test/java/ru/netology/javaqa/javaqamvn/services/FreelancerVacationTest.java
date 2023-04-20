package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelancerVacationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacationDate.csv")

    public void CalculateVocationOne(int expected, int income, int expenses, int threshold) {
        FreelancerVacation service = new FreelancerVacation();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}