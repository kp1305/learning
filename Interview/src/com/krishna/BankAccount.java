package com.krishna;

import java.util.Scanner;

public class BankAccount {
	
	String name;
	double balance;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		name = sc.nextLine();
		System.out.println("Enter the initial Balance");
		balance = sc.nextDouble();
				
	}
	
	void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit Amount");
		double depositAmount = sc.nextDouble();
	
	
		 if (depositAmount > 0) {
	            balance = balance + depositAmount;
	            System.out.println("Amount " + depositAmount + " deposited successfully!");
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	
	}
	
	void displayBalance() {
        System.out.println("==================================");
        System.out.println("Account Holder: " + name);
        System.out.println("Updated Balance: " + balance);
        System.out.println("==================================");
    }
	
	public static void main(String[] args) {
		
		
        BankAccount account = new BankAccount();

        // Call methods using object
        account.getData();
        account.deposit();
        account.displayBalance();
		
		
	}

}
