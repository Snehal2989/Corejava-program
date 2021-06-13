package com.controller;

import java.util.Scanner;

import com.model.Account;
import com.service.*;

public class Admin {

	public static void main(String[] args) {
		//Account ac=new Account(int ac_no, String act_name, String act_address, String act_pan, double act_bal);
		Scanner sc=new Scanner(System.in);
		RBI r=new SBI();
		boolean a = true;
		while (a) {
			System.out.println("\n----------------Welcome-------------------\n");
			System.out.println("1.Create Account");
			System.out.println("2.Account Details");
			System.out.println("3.Withdrawl Money");
			System.out.println("4.Deposite Money");
			System.out.println("5.Update Bank Account Details");
			System.out.println("6.Exit");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				r.addAccount();
				break;
			case 2:
				r.viewAccountDetails();
				break;
			case 3:
				r.withdrawlMoney();
				break;
			case 4:
				r.depositeMoney();
				break;
			case 5:
				r.updateAccountDetails();
				break;
			case 6:
				System.out.println("Thank you for visiting......");
				a= false;
				break;
			default:
				System.out.println("Wrong input,Please select correcti/p!!!!!!!!! ");
				break;
		

	}
		}
}
	}
