package com.yearup.hotel;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Employee {
    private LocalDateTime punchInTime;
    private LocalDateTime punchOutTime;
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double regularHours = 45;
    private double overtimeHours = 0;
    private double hoursWorked = regularHours + overtimeHours;


    // Constructor
    public Employee(String employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.overtimeHours = 0;
        this.punchInTime = LocalDateTime.now();
        this.punchOutTime = LocalDateTime.now();
    }

    // Getters and Setters

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return payRate * (hoursWorked + overtimeHours);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    // other methods

    public void punchIn(LocalDateTime start) {
        this.punchInTime = start;
    }

    public void punchIn() { //overloaded method using the time now.
        this.punchInTime = LocalDateTime.now();
    }
    public void punchOut(LocalDateTime end) {
        this.punchOutTime = end;
        hoursWorked = ChronoUnit.MINUTES.between(punchInTime, punchOutTime) / 60.;
    }

    public void punchOut() { //overloaded method using the time now.
        this.punchOutTime = LocalDateTime.now();
        hoursWorked = ChronoUnit.MINUTES.between(punchInTime, punchOutTime) / 60.;
    }
}