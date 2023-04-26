package com.Bridgelabz;
/**
 * 
 * @author pmoha
 *
 */
public class EmployeePresence {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/*
		 * variable
		 */
		int present=1;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		/*
		 * if condition check present or absent
		 */
		if (empCheck == present)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}

}
