package it.develhope.datetime;


import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {

        System.out.println("-----------Starting-----------------");

        LocalDate todaysDate = LocalDate.now();

        System.out.println("Today's date is " + todaysDate);

        System.out.println("Days left till the end of the month: " + (todaysDate.lengthOfMonth() - todaysDate.getDayOfMonth()));

        System.out.println("This is the day " + todaysDate.getDayOfYear() + " of the year");

        System.out.println("Days left till the end of the year: " + (java.time.Year.of(2023).length() - todaysDate.getDayOfYear()));

        System.out.println("------------------------------------");

    }
}
