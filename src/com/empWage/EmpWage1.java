package com.empWage;

import java.util.Random;

public class EmpWage1 {

	
		public static void main(String[] args) {
			System.out.println("Welcome to empwage");

			int empCheck = Employee.empCheck();
			Employee.empSalary(empCheck);
		

	}
	class Employee {
		static final int is_full_time = 1;
		static final int Emp_Rate_Per_Hr= 20;

		public static int empCheck() {
			Random random = new Random();
			int empCheck = random.nextInt(2);
			return empCheck;
		}

		public static void empSalary(int empCheck) {
			int empWrkHrs = 0;
			if (empCheck == is_full_time) {
				empWrkHrs = 8;
			} else {
				empWrkHrs = 0;
			}
			int empWage = empWrkHrs * Emp_Rate_Per_Hr;
			System.out.println("empWage = " + empWage);
		}

	}

}
