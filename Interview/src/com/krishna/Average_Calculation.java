package com.krishna;

import java.util.Scanner;

public class Average_Calculation {

	int math, science, social;

	void Marks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The marks of Maths");
		math = sc.nextInt();
		System.out.println("Enter the mrks for science");
		science = sc.nextInt();
		System.out.println("Enter the marks for social");
		social = sc.nextInt();
	}

		int gettotal()
		{ 
			int total = math+science+social;
			return total;
		}

		float getaverage() {
			float average  =  gettotal() / 3.0f;
			return average;
		}


	

	public static void main(String[] args) {

		Average_Calculation av = new Average_Calculation();
		av.Marks();

		System.out.println("Student Total: " + av.gettotal());
		System.out.println("Student Average: " + av.getaverage());

	}


}
