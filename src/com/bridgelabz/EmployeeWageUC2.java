/*
      Q.2) Calculate Daily Employee Wage

      a)  Assume Wage per Hour is 20
      b)  Assume Full Day Hour is 8

 */

package com.bridgelabz;

public class EmployeeWageUC2 {
    public static void main(String[] args){

        int WAGE_PER_HR = 20;
        int WORKING_HRS = 8;

        int dailyWage=WAGE_PER_HR*WORKING_HRS;
        System.out.println("Daily wage of Employee is: " + dailyWage);

    }
}
