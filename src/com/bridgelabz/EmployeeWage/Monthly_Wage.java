package com.bridgelabz.EmployeeWage;

public class Monthly_Wage {

    public void employeeWage() {
        int hour = 8;
        int wage = 20;
        int monthly = (hour*wage*20);
        System.out.println("Monthly Wage of an Employee: "+monthly);
    }

    public static void main(String[] args) {

        Monthly_Wage employee = new Monthly_Wage();
        employee.Monthly_Wage();
    }

    private void Monthly_Wage() {
    }

}
