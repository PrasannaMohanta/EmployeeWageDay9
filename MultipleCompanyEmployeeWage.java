package com.Bridgelabz;

public class MultipleCompanyEmployeeWage {
	/**
	 * 
	 * @param args
	 */

		public static final int present=1;
		public static final int partTime=2;
		public static int computeEmployeeWage(String company,int ratePerHour,int numberOfWorkingDays ,
				int maxHoursPerMonth) {
			/*
			 * variables
			 */
			int workingHours=0;
			int totalWorkingHours=0;
			int totalWorkingDays=0;
			while(totalWorkingHours<=maxHoursPerMonth && totalWorkingDays <=numberOfWorkingDays) {
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
			System.out.println("company name : "+ company+" total employee wage :"+totalEmployeeWage);
			return totalEmployeeWage;
		}
		public static void main(String[]args) {
			computeEmployeeWage("ios" , 20, 24, 120);
			computeEmployeeWage("android" , 10, 22, 100);
		}

}
