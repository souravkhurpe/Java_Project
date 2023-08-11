package com.sbi.model;

public interface RBI {

	public abstract void registerAccount();
	public abstract void showAccountDetails();
	public abstract void showAccountBalance();
	public abstract void withdrawMoney();
	public abstract void depositMoney() ;
	public abstract void updateAccountDetails();
	public void getSingleaccountDetails();
	public void deletAccount();
	
}
