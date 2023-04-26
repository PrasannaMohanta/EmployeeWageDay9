package com.Bridgelabz;
/**
 * 
 * @author pmoha
 *
 */

public class EmployeeWageCondition {
	/**
	 * 
	 * @param args
	 */

		public static final int present=1;
		public static final int partTime=2;
		public static final int ratePerHour=20;
		public static final int monthDay=20;
		public static final int maximumWorkingHour=100;

		public static void main(String[] args) {
			/*
			 * variables
			 */
			int workingHours=0;
			int totalWorkingHours=0;
			int totalWorkingDays=0;
			while(totalWorkingHours<=maximumWorkingHour && totalWorkingDays <=maximumWorkingHour) {
				totalWorkingDays++;
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
			totalWorkingHours+=workingHours;
			System.out.println("days :"+totalWorkingDays+" working hours : "+workingHours);
			}
			int totalEmployeeWage=totalWorkingHours*ratePerHour;
			System.out.println("total employee wage :"+totalEmployeeWage);
		}
}
