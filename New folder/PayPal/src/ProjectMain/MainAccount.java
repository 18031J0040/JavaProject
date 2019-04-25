package ProjectMain;

import java.io.Serializable;

class MainAccount implements Serializable  {

	double balance;
	boolean boo=false;
	MainAccount(double  balance)
	{
		
		if(this.balance<0.0)
		{
		System.out.println("invailed balance");	
		}
		else
		{
			this.balance=balance;	
		}
	}
	public void credit(double credit)
	{this.boo=true;
		this.balance=this.balance+credit;
		System.out.println(credit+" amount is credited into your account");
		System.out.println(" your current balance is :"+this.balance);
		
	}
	public void debit(double debit)
	{
		if(this.balance<debit)
		{
			this.boo=false;
			 System.out.println("Amount cannot be debited");
			System.out.println("Debit amount exceeded account balance");	
		}
		else
		{
		this.balance=this.balance-debit;
		this.boo=true;
		System.out.println(debit+" amount is debited from your account");
		System.out.println(" your current balance is :"+this.balance);
		}
		
		
	}
	double getBalance()
	
	{
		return this.balance;
	}
	@Override
	public String toString() {
		return "Account Balance=" + getBalance();
	}
}
class Personal extends MainAccount
{
	
	Personal(double balance)
	{super(balance);
	}
	
}
class Student extends MainAccount
{
	Profile p;
public Student(double balance,Profile uc5) 
	{
		super(balance);
		this.p=uc5;
	}
	
}
class Business extends MainAccount 
{
	Personal p[];
Business(double balance,Personal[] p) {
		super(balance);
		this.p=p;
		
		
	}
	
}