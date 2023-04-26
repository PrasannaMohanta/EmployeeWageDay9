package com.Bridgelabz;
/**
 * 
 * @author pmoha
 *
 */

public class SwitchCase {
	/**
	 * 
	 * @param args
	 */
	public static final int present=1;
	public static final int partTime=2;
	public static final int ratePerHour=20;

	public static void main(String[] args) {
		/*
		 * variables
		 */
		int workingHours=0;
		int employeeWage=0;
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
		System.out.println("employee wage :"+employeeWage);
	}

}
