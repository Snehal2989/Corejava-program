package com.service;

import java.util.Scanner;

import com.controller.*;

public class Admin {

	public static void main(String[] args) {
		RBI r=new SBI();
		Scanner sc= new Scanner(System.in);
		boolean b=true;
		while(b)
		{
		System.out.println("------Welcome to bank---------");
		System.out.println(" 1.Add Account" +"\n 2.View account details" +"\n 3.Withdraw money" +" \n 4. Deposit Money" +
		                   " \n 5.Update account details");
        System.out.println(" Plz select the option");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        	  r.addAccount();
        	  break;
        case 2:
        	r.viewAccountDetails();
        	break;
        case 3:
        	r.withdrawMoney();
        	break;
        case 4:
        	r.depositMoney();
        	break;
        case 5:
        	r.updateAccountDetails();
        	break;
        case 6:
        	System.out.println("wrong i/p");
        	break;
        case 7:
        	b=false;
        	break;
        }
	}
	}
}
