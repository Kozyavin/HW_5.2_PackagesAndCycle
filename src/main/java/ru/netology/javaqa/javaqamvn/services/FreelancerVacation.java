package ru.netology.javaqa.javaqamvn.services;

public class FreelancerVacation {
    public int calculate(int income, int expenses, int threshold) {

        int monthVacation = 0;
        int balance = 0;

        for (int month = 1; month < 12; month++) {

            if (balance < threshold) {
                balance = balance - expenses + income;
            } else {
                monthVacation++;
                balance = (balance - expenses) / 3;
            }
        }
        return monthVacation;
    }
}

