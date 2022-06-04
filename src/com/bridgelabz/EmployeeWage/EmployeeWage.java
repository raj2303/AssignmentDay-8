package com.bridgelabz.EmployeeWage;

public class EmployeeWage {
    String EmployeeWage;

    public EmployeeWage() {
    }

    void employeeWage() {
        int WagePerfHour = 20;
        int FullDayHour = 8;
        int i = WagePerfHour * FullDayHour;
        System.out.println("daily wage of employee :"+(WagePerfHour * FullDayHour));
    }

    public static void main(String[] args) {

        EmployeeWage employee = new EmployeeWage();
        employee.employeeWage();
    }
}

