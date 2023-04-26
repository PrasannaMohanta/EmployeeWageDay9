package com.Bridgelabz;
/**
 * 
 * @author pmoha
 *
 */

public class MonthlyEmployeeWage {
/**
 * 
 * @param args
 */

	public static final int present=1;
	public static final int partTime=2;
	public static final int ratePerHour=20;
	public static final int month=30;

	public static void main(String[] args) {
		/*
		 * variables
		 */
		int workingHours=0;
		int employeeWage=0;
		int totalEmployeeWage=0;
		for(int i=0;i<month;i++) {
			/*
			 * random check
			 */
			int employeeCheck=(int) (Math.floor(Math.random()*10)%3);
			/*
			 * switch case
			 */
			switch (employeeCheck) {
			case present:
				workingHours=8;
				break;
			case partTime:
				workingHours=4;
				break;
			default:
				workingHours=0;
			}
			/*
			 * calculate employeeWage
			 */
		employeeWage=workingHours*ratePerHour;
		totalEmployeeWage += employeeWage;
		System.out.println("employee wage :"+employeeWage);
		}
		System.out.println("total employee wage :"+totalEmployeeWage);
	}
}
