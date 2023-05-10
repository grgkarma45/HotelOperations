package com.yearup.hotel;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(null, null, null, 25.);
        e1.punchIn(LocalDateTime.now().minus(3, ChronoUnit.HOURS));
        e1.punchOut(LocalDateTime.now());
        double hoursWorked = e1.getHoursWorked();
        System.out.println(hoursWorked);
    }
}
