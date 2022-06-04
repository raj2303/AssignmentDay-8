package com.bridgelabz.EmployeeWage;

public class compute_employee_wage {

        private int employeeId;
        private String employeeName;
        private double salary;
        private double netSalary;

        //setters
        public void setEmployeeId(int employeeId){
            this.employeeId=employeeId;
        }
        public void setEmployeeName(String employeeName){
            this.employeeName=employeeName;
        }
        public void setSalary(double salary){
            this.salary=salary;
        }
        public void netSalary(double netSalary){
            this.netSalary=netSalary;
        }

        //getters
        public int getEmployeeId(){
            return employeeId;
        }
        public String getEmployeeName(){
            return employeeName;
        }
        public double getSalary(){
            return salary;
        }
        public double getNetSalary(){
            return netSalary;
        }

        public void calculateNetSalary(int pfpercentage){

            double compute_employee_wage = salary * pfpercentage;
            netSalary=salary-compute_employee_wage ;
        }
    }
