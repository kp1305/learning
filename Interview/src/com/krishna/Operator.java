package com.krishna;
 
import java.util.Scanner;

public class Operator {
		
		 void caculator()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your marks for a" );
			int a = sc.nextInt();
			System.out.println("Enter your marks for b" );
			int b = sc.nextInt();    
			int total = a+b;
			float average = total/2;
			int sub = a-b;
			int Mul = a*b;
		    System.out.println(" Sum: " + " " + total);
		    System.out.println(" Average:" + " " +average);
		    System.out.println(" Multiplication:" + " " +Mul);
		    System.out.println(" Subraction:" + " " +sub);
		}
		
		public static void main(String[] args) {
			
			Operator cal = new Operator();
			
			cal.caculator();
			
			
		}

	}



