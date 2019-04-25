package com.paypal;

import java.io.Serializable;

public class Transaction implements Serializable
{
	String tTime;
	String tDate;
	String narration;
	String reference;
	String status;
	float debit;
	float credit;
	
	public String toString()
	{
		//return the description of the transaction 
		return null;
	}
	
}
