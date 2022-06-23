/*Compute Employee Wage for multiple companies
 - Note: Each Company has its own wage, number of working days and working hours per month
- Use Class Method with function parameters instead of Class Variables
*/

package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME=2;
    int wagePerHr;
    int empHrs = 0;
    int monthlyWage = 0;
    int totalWorkingHrs;
    int totalWorkingDays;
    int workedHrs=0;
    static int i;

    public static void main(String[] args){

        EmployeeWage company1 = new EmployeeWage();
        EmployeeWage company2 = new EmployeeWage();

        System.out.println("Employee wage for company1: ");
        company1.employeeWage();
        System.out.println("Employee wage for company2: ");
        company2.employeeWage();

    }
    public void employeeWage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wage_per_hr: ");
        wagePerHr = scanner.nextInt();
        System.out.println("Enter the total Working days: ");
        totalWorkingDays = scanner.nextInt();
        System.out.println("Enter the total working hrs in a month: ");
        totalWorkingHrs = scanner.nextInt();

        for ( i=0;i<totalWorkingDays && workedHrs<totalWorkingHrs;i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME -> empHrs = 8;
                case IS_PART_TIME -> empHrs = 4;
            }
            int empWage = empHrs * wagePerHr;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage+=empWage;
            workedHrs+=empHrs;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
        System.out.println("Working Days = " + i + ", Total working hrs = " + workedHrs);
    }

}