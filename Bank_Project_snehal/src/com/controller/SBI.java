package com.controller;

import java.util.Scanner;

import com.model.Account;

public class SBI implements RBI
{
	Scanner sc=new Scanner(System.in);
	Account act=new Account();
	

	@Override
	public void addAccount() {
		System.out.println("Enter Account num");
		int act_num=sc.nextInt();
		act.setAccno(act_num);
		System.out.println("Enter the name");
		String act_name=sc.next();
		act_name+=sc.next();
		act.setAcc_holder_name(act_name);
		System.out.println("Enter the address");
		String add=sc.next();
		act.setAddress(add);
		System.out.println("Enter the pancard");
		String pan=sc.next();
		act.setPancard(pan);
		System.out.println("Enter the balance");
		double bal=sc.nextDouble();
		act.setBalance(bal);
		System.out.println("Enter the adharcard");
		long adhar=sc.nextLong();
		act.setAdhar_card(adhar);
		
	}

	@Override
	public void viewAccountDetails() {
		System.out.println("Enter Account num");
		int act_num=sc.nextInt();
		if(act_num==act.getAccno())
		{
			System.out.println("Account deatils"+act.toString());
		}
		else
		{
			System.out.println("Create account");
		}
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter Account num");
		int act_num=sc.nextInt();
		if(act_num==act.getAccno())
		{
			System.out.println("Account has a balance of rupee "+act.getBalance());
			System.out.println("Enter the money , \n How much money do  u want  to withdraw");
			double money=sc.nextInt();
			if(act.getBalance()>money)
			{
				double balance=act.getBalance()-money;
				act.setBalance(balance);
				System.out.println("After withdrawn the money account has balance of "+act.getBalance());
			}
			else
			{
				System.out.println("Insufficient balance");
			}
		}
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter Account num");
		int act_num=sc.nextInt();
		if(act_num==act.getAccno())
		{
			System.out.println("Account has a balance of rupee "+act.getBalance());
			System.out.println("Enter the money , \n How much money do  u want  to deposit");
			double money=sc.nextInt();
			double balance=act.getBalance()+money;
			act.setBalance(balance);
            System.out.println(act.getBalance());
		}
		else
		{
			System.out.println("create account");
		}
	}

	@Override
	public void updateAccountDetails() {
		boolean b=true;
		
		while(b)
		{
			System.out.println("------update the details-----------");
			System.out.println("\n1. update account name "+"\n 2. update pan card " +" \n 3.update adhar card");
		    System.out.println("Choose  the above opnion");
		    int ch=sc.nextInt();
		    switch(ch)
		    {
		    case 1:
		    	  System.out.println("update the account holder name");
		    	  System.out.println("Enter Account num");
		  		int act_num=sc.nextInt();
		  		if(act_num==act.getAccno())
		  		{
		  		    System.out.println("Plz ENTER THE Name ,which do u have to update");
		  		    String act_name=sc.next();
		  		    act_name+=sc.next();
		  		    act.setAcc_holder_name(act_name);
		  		    System.out.println("Update name is "+act.getAcc_holder_name());
		  		    System.out.println(act.toString());
		  		}
		  		else
		  		{
		  			System.out.println("Create the account");
		  		}
		  		break;
		    case 2:
		    	System.out.println("update the account holder pan card number");
		    	  System.out.println("Enter Account num");
		  		int act_num1=sc.nextInt();
		  		if(act_num1==act.getAccno())
		  		{
		  			System.out.println("Enter the pan card num");
		  			String num=sc.next();
		  			act.setPancard(num);
		  			System.out.println("Updated pancard number is :"+act.getPancard());
		  			 System.out.println(act.toString());
		  		}
		  		else
		  		{
		  			System.out.println("Create the account");
		  		}
		  		break;
		  		
		    case 3:
		    	System.out.println("update the account holder adharcard number");
		    	  System.out.println("Enter Account num");
		  		int act_num2=sc.nextInt();
		  		if(act_num2==act.getAccno())
		  		{
		  			System.out.println("Enter the adhar card num");
		  			int adhar_num=sc.nextInt();
		  			act.setAdhar_card(adhar_num);
		  			System.out.println("Updated adharcard number is :"+act.getAdhar_card());
		  			 System.out.println(act.toString());
		  		}
		  		else
		  		{
		  			System.out.println("Create the account");
		  		}
		  		break;
		  		
		case 4:
			System.out.println("Incorrect i/p");
			break;
		case 5:
			b=false;
			break;
		}
	}	
		
	}

}
