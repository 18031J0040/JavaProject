package pc4;

import java.util.Scanner;

class Account
{
	
	public double balance;
	
	public Account(double bal)
	{
		
		if(bal<0.0)
		{
			this.balance=0.0;
			System.out.println("invalid balance");
		}
		else
		{
			this.balance=bal;
		}
		
		
	}
	
	public void creditAccount(double amount)
	{
		this.balance=this.balance+amount;
	}
	
	public boolean debitAccount(double amount){
		
		boolean check=false;
		
		if(amount<this.balance)
		{
			this.balance=this.balance-amount;
			check=true;
		}
		else{
			System.out.println("Insufficient funds in the account to withdraw");
		}
		return check;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
}

class SavingsAccount extends Account
{
float interest;

public SavingsAccount(double balance,float interest)
{
	super(balance);
	this.interest=interest;
}
}

class CheckingAccount extends Account
{
	double fee;
	private double interest;
	public CheckingAccount(double balance,double fee)
	{
		super(balance);
		this.fee=fee;
	}
	
	public void creditAccount(double amount)
	{
		this.balance=this.balance+amount;
	}
	
	public boolean debitAccount(double amount)
	{
		boolean check=false;
		
		if(amount<this.balance)
		{
			double  fee=(amount*this.fee)/100;
			this.balance=this.balance-(amount+fee);
			check=true;
		}
		else{
			System.out.println("Insufficient funds in the account to withdraw");
		}
		
		return check;
	}
public double calculateInterest(int months)
{
	return( (this.balance*this.interest)/100)*months;
}
}

class CurrentAccount extends Account{
	double overDraftpercentage;
	
	public CurrentAccount(double balance,double overdraft){
		super(balance);
		this.overDraftpercentage=overdraft;
	}
	
	public boolean debitAccount(double amount)
	{
		boolean check=false;
		
		if(this.balance-amount<0)
		{
			if(amount<this.overDraftpercentage){
				this.overDraftpercentage=this.overDraftpercentage-amount;
				
				this.balance=this.balance-amount;
			}
			
			//check=true;
		}
		else
		{
			if(amount<this.balance)
			{
				check=true;
			this.balance=this.balance-amount;
			System.out.println("succesfully debited");
			}
		}
		
		return check;
	}

	
}
public class BankAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
			System.out.println("Enter 1 for Saving account\n2 for Check account\n 3 for Current account\n4 for exit");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			
			int choice;
			choice=sc.nextInt();
			switch(choice)
			{
			
			case 1:
				SavingsAccount sav=new SavingsAccount(200000, 2);
				while(true)
				{
					System.out.println("Enter \n1 for Credit account\n2 for Withdraw from account\n 3 for get balance\n 4 for exit");
					@SuppressWarnings("resource")
					Scanner sc1=new Scanner(System.in);
				
					int choice1;
					choice1=sc1.nextInt();
					
					switch(choice1)
					{
					case 1:
						sav.creditAccount(10000);
						break;
					case 2:
					boolean val=sav.debitAccount(10000);
					if(val){
						System.out.println("Amount with drawn successfully");
					}
					else{
						System.out.println("Insufficient funds/Service unavailable");
					}
						break;
					case 3:
						System.out.println(sav.getBalance());
						break;
					case 4:
						System.exit(0);
					default:
						continue;
					}
				}
				
			case 2:CheckingAccount ca=new CheckingAccount(200000, 2);
			while(true)
			{
				System.out.println("Enter \n1 for Credit account\n2 for Withdraw from account\n 3 for get balance\n 4 for exit");
				@SuppressWarnings("resource")
				Scanner sc2=new Scanner(System.in);
			
				int choice1;
				choice1=sc2.nextInt();
				
				switch(choice1)
				{
				case 1:
					ca.creditAccount(10000);
					break;
				case 2:
				boolean val=ca.debitAccount(10000);
				if(val){
					System.out.println("Amount with drawn successfully");
				}
				else{
					System.out.println("Insufficient funds/Service unavailable");
				}
					break;
				case 3:
					System.out.println(ca.getBalance());
					break;
				case 4:
					System.exit(0);
				default:
					continue;
				}
			}
				
			
			case 3:CurrentAccount cua=new CurrentAccount(200000, 2);
			while(true)
			{
				System.out.println("Enter \n1 for Credit account\n2 for Withdraw from account\n 3 for get balance\n 4 for exit");
				@SuppressWarnings("resource")
				Scanner sc3=new Scanner(System.in);
			
				int choice1;
				choice1=sc3.nextInt();
				
				switch(choice1)
				{
				case 1:
					cua.creditAccount(10000);
					break;
				case 2:
				boolean val=cua.debitAccount(10000);
				if(val){
					System.out.println("Amount with drawn successfully");
				}
				else{
					System.out.println("Insufficient funds/Service unavailable");
				}
					break;
				case 3:
					System.out.println(cua.getBalance());
					break;
				case 4:
					System.exit(0);
				default:
					continue;
				}
			}
			case 4:
				System.exit(0);
			}
			
			
		}

	}

}
