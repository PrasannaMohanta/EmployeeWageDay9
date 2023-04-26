package com.Bridgelabz;
/**
 * 
 * @author pmoha
 *
 */

public class DailyEmployeeWage {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * variable
		 */
		int present=1;
		int ratePerHour=20;
		int employeeHours=0;
		int employeeWage=0;
		
		double employeeCheck=Math.floor(Math.random()*10)%2;
		/*
		 * if condition check present or absent
		 */
		if (employeeCheck==present)
			employeeHours=8;
		else
			employeeHours=0;
		/*
		 * calculate daily employee wage
		 */
		employeeWage=employeeHours*ratePerHour;
		System.out.println("Daily Employee Wage: "+employeeWage);
	}

}
