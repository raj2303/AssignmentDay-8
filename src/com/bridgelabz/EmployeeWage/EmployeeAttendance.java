package com.bridgelabz.EmployeeWage;


public class EmployeeAttendance {
    String employee;


    public void EmployeeAttendance() {

        employee = String.valueOf(Math.random() * 100 % 2);

        if (Object(employee = String.valueOf((Math.random() * 100 % 2)))) {
            System.out.println("present");
        } else {
            System.out.println("absent");
        }
    }

    private boolean Object(String s) {
        return true;
    }

    public boolean Object() {
        return false;
    }

    public static void main(String[] args) {

        EmployeeAttendance employee = new EmployeeAttendance();
        employee.EmployeeAttendance();
    }
}