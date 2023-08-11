package com.sbi.model;

public class Account {

	private long accountNo;
	private String accName;
	private String aadharCard;
	private String pancard;
	private String contact;
	private double accBalance;
	

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String no) {
		this.contact = no;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accName=" + accName + ", aadharCard=" + aadharCard + ", pancard="
				+ pancard + ", contact=" + contact + ", accBalance=" + accBalance + "]";
	}

}
