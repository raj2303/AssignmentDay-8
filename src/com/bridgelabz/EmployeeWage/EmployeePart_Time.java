package com.bridgelabz.EmployeeWage;

public class EmployeePart_Time {
    String EmployeePart_time;

    public void EmployeePart_Time() {

        int WagePerHour = 20;
        int PartTimeHour = 8;
        int i = WagePerHour * PartTimeHour;
        System.out.println("part time employee & wage :" + (WagePerHour * PartTimeHour));

    }

    public static void main(String[] args) {
        EmployeePart_Time employee = new EmployeePart_Time();
        employee.EmployeePart_Time();
    }

}
