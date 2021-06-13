package com.service;

import java.util.*;

import com.model.Account;

public class SBI implements RBI{
	Scanner sc=new Scanner(System.in);
	
   List<Account> aclist=new ArrayList<Account>();
 
	@Override
	public void addAccount() {
		System.out.println("Enter the number of account");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			Account act= new Account();
			System.out.println("Account number "+i);
			System.out.println("Enter the account num" );
			int ac_no=sc.nextInt();
			System.out.println("Enter the account holder name" );
			String act_name=sc.next();
			act_name+=sc.next();
			System.out.println("Enter the account holder address" );
			String act_address=sc.next();
			System.out.println("Enter the pan card number");
			String act_pan=sc.next();
			System.out.println("Enter the balance in account");
			double act_bal=sc.nextDouble();
			
			act.setAc_no(ac_no);
			act.setAct_name(act_name);
			act.setAct_address(act_address);
			act.setAct_pan(act_pan);
			act.setAct_bal(act_bal);
			aclist.add(act);
			
		}
		
		System.out.println("List created");
		//System.out.println(act.toString());
	}

	@Override
	public void viewAccountDetails() {
		System.out.println("Enter the account number");
		int num=sc.nextInt();
		boolean b=false;
		for(Account act:aclist)
		{
			if(num==act.getAc_no()&& act.getAc_no()!=0)
			{
				System.out.println(act.toString());
				
			}
			
		}
//		if(true)
//		{
//			
//		}
	}
	@Override
	public void withdrawlMoney() {
		System.out.println("Enter the account number");
		int num=sc.nextInt();
		boolean b=false;
		Account act1=null;
		for(Account act:aclist)
		{
			if(num==act.getAc_no()&& act.getAc_no()!=0)
			{
				
				System.out.println("Current balance in acount"+act.getAct_bal());
				System.out.println("Enter the money \n How much do umwant to withdraw ");
				double money=sc.nextDouble();
						if(act.getAct_bal()>=money)
						{
							b=true;
							double balance=act.getAct_bal()-money;
							act.setAct_bal(balance);
							System.out.println("After withdrawning money,current balance is "+act.getAct_bal());
							act1=act;
							System.out.println(act1);
							break;
						}
						else
						{
							System.out.println("Insufficient balance");
						}
						
			}
			
			else
			{
				System.out.println("Account not found");
			}
			
				
				
			}
	}
	@Override
	public void depositeMoney() {
		System.out.println("Enter the account number");
		int num=sc.nextInt();
		boolean b=false;
		Account act1=null;
		for(Account act:aclist)
		{
			if(num==act.getAc_no()&& act.getAc_no()!=0)
			{
				
				System.out.println("Current balance in acount"+act.getAct_bal());
				System.out.println("Enter the money \n How much do u mwant to deposit ");
				double money=sc.nextDouble();
						if(act.getAct_bal()>=money)
						{
							b=true;
							double balance=act.getAct_bal()+money;
							
							act.setAct_bal(balance);
							System.out.println("After depositing money,current balance is "+act.getAct_bal());
							act1=act;
							break;
						}
						else
						{
							System.out.println("Insufficient balance");
						}
						
			}
			if(b=true)
			{
				System.out.println(act1);
			}
			else
			{
				System.out.println("Account not found");
			}
			}
		}
	@Override
	public void updateAccountDetails() {
	//	Account act=new Account();
		System.out.println("Enter the account number");
		int num=sc.nextInt();
		boolean b=true;
		for(Account act: aclist)
		{
		if(num==act.getAc_no()&& act.getAc_no()!=0)
		{
			while(b)
			{
				System.out.println("1.Update name");
				System.out.println("2.Update address");
				System.out.println("3.update pan card number");
				System.out.println("Select the choice");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the name,which do u want to update");
					String name=sc.next();
					name+=sc.next();
					act.setAct_name(name);
					System.out.println("Updated name is "+act.getAct_name());
					System.out.println(act);
					break;
				case 2:
					System.out.println("Enter the address,which do u want to update");
					String add=sc.next();
					act.setAct_address(add);
					System.out.println("Updated address is "+act.getAct_address());
					System.out.println(act);
					break;
				case 3:
					System.out.println("Enter the pancard,which do u want to update");
					String num1=sc.next();
					act.setAct_pan(num1);
					System.out.println("Updated name is "+act.getAct_pan());
					System.out.println(act);
					break;
				case 4:
					b=false;
					break;
				default:
					System.out.println("-----------Incoorect i/p----------");
					break;
				}
			}
	   }
		else
		{
			System.out.println("Account is not found");
		}
	
		}
		}
}
