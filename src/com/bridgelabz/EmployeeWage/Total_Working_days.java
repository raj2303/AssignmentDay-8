package com.bridgelabz.EmployeeWage;

public class Total_Working_days{
    
    void Total_working_days() {
        
            int hour = 100;
            
            int wage = 20;
            int monthly = (hour * wage * 20);
            System.out.println("20 days Wage of an Employee: " +(monthly));
        }

        public static void main(String[] args) {
            Total_working_days employee = new Total_working_days();
            employee.Total_working_days();
            employee.Total_working_days();
        }

    private static class Total_working_days {
        public void Total_working_days() {
        }
    }
}

