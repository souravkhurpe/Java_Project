package com.sbi.service;

import com.sbi.model.*;


import java.util.Scanner;

public class SBI implements RBI {

//	Account a = new Account();
	Account[] accountArray = new Account[5];
//	Account account = new Account();

	static Scanner sc = new Scanner(System.in);

	static boolean checkAdhar(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < '0' || a.charAt(i) > '9') {
				return false;

			}

		}
		return true;

	}

	static boolean checkPan(String a) {

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) >= 65 && a.charAt(i) <= 90 && a.charAt(i) < '0' || a.charAt(i) > '9') {
				return true;

			}

		}
		return false;

	}

	static boolean checkContact(String no) {
		return no.length() == 10 && no.startsWith("9") || no.startsWith("8");

	}

	public void updateName(int accNo) {

		for (Account a : accountArray) {
			if (a != null && accNo == a.getAccountNo()) {
				System.out.println("Enter your first name: ");

				String first = sc.next();
				System.out.println("Enter your last name:");
				String last = sc.next();
				String name = first + " " + last;

				a.setAccName(name);
				System.out.println("Name updated successfully.....!!!!");
				break;
			}
		}
	}

	public void updateContactNumber(int accNo) {
		for (Account a : accountArray) {
			if (a != null && accNo == a.getAccountNo()) {
				System.out.println("Enter contact number u want to update: ");
				String no = sc.next();
				if (checkContact(no)) {
					a.setContact(no);
					System.out.println("Contact number updated successfully...!!!");
				} else {
					System.out.println("Invalid contact plz enter correct contact");
				}
				break;
			}
		}
	}

	@Override
	public void registerAccount() {
//		Account a = new Account();
		System.out.println("How many account u need to register: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Account a = new Account();
			System.out.println("Enter account number ");
			long accNO = sc.nextLong();
			a.setAccountNo(accNO);

			System.out.println();
			System.out.println("Enter your first name: ");
			String first = sc.next();
			System.out.println("Enter your last Name:");
			String last = sc.next();
//		String accName = first+" "+last;
			a.setAccName(first + " " + last);
			System.out.println();

			boolean flag = true;
			while (flag) {
				System.out.println("Enter aadharCard");
				String aadhar = sc.next();

				if (checkAdhar(aadhar)) {
					a.setAadharCard(aadhar);
					flag = false;
				} else {
					System.out.println("Enter valid adhar number, Cannot contain Alphabets");
				}
			}

			System.out.println();
			flag = true;
			while (flag) {
				System.out.println("Enter your pancard");
				String pancard = sc.next();
				if (checkPan(pancard)) {
					a.setPancard(pancard);
					flag = false;
				} else {
					System.out.println("Enter Valid Pan Card Number, Must contain Digit+ Alphabet");
				}
			}
			System.out.println();

			flag = true;
			while (flag) {
				System.out.println("Enter contact No details");
				String contact = sc.next();
				String no = String.valueOf(contact);
				if (checkContact(no)) {
					a.setContact(contact);
					flag = false;
				} else {
					System.out.println("invalid Contact");

				}
			}
			System.out.println();
			System.out.println("Enter account opening amount");
			double accAmount = sc.nextDouble();
			a.setAccBalance(accAmount);
			System.out.println();
			System.out.println("@@Account created successfully@@@@");

			accountArray[i] = a; // to add obj into array
		}

	}

	public static int accNo() {
		System.out.println("Enter your pin: ");
		int accNo = sc.nextInt();
		return accNo;
	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter Admin pin: ");
		int pin = sc.nextInt();
//		int accNo = accNo();
		int password = 123; // password for admin to get all account details
		if (pin == password) {
//			System.out.println("Account Holder name: " + a.getAccName() + " || Account Number: "
//					+ a.getAccountNo() + " || Contact Details: " + a.getContact() + " || Adhar card no: "
//					+ a.getAadharCard() + " || PAN card No: " + a.getPancard());
			for (Account a : accountArray) {
				if (a != null) {
					System.out.println(a);
			}
			}

		} else {
			System.out.println("Account doesn't exit");
		}
	}

	public void getSingleaccountDetails() {
		System.out.println("Enter your Account no: ");
		int accNo = sc.nextInt();
		boolean flag = true;
		for (Account a : accountArray) { // dout
			if (a != null && accNo == a.getAccountNo()) {
				System.out.println("Your account Details: " + a);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Account dosnt exist");
		}
	}

	@Override
	public void showAccountBalance() {

		System.out.println("Enter your account number");
		int accNo = sc.nextInt();
		boolean flag = true;
		for (Account a : accountArray) {
			if (a != null && accNo == a.getAccountNo()) {
				System.out.println("Current Account Balance : " + a.getAccBalance());
				flag = false;
				break;

			}

		}
		if (flag) {
			System.out.println("Account dosnt exist");

		}
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter your account number");
		int accNo = sc.nextInt();
		boolean flag = true;
		for (Account a : accountArray) {
			if (a != null && accNo == a.getAccountNo()) {
				System.out.println("Enter amount to withDraw: ");
				double ammount = sc.nextDouble();
				if (ammount <= a.getAccBalance()) {
					double updatedBalance = a.getAccBalance() - ammount;

					a.setAccBalance(updatedBalance);

					System.out.println(ammount + " Rs withdraw successfully....!!");
					flag = false;
					break;
				} else {
					System.out.println("Insufficient Balance");
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Account dosnt exist");
		}
	}

	public void deletAccount() { // dout

		System.out.println("Enter account number u want to delet: ");

		long pin = sc.nextLong();
		boolean flag = true;
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null && account.getAccountNo() == pin) {
				account = null;
				System.out.println("Account deleted successfully");
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("Account dosnt exist");
		}
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter your account number");
		int accNo = sc.nextInt();
		boolean flag = true;
		for (Account a : accountArray) {
			if (a != null && accNo == a.getAccountNo()) {
				System.out.println("Enter amount to deposite: ");
				double depoAmount = sc.nextDouble();
				double addMoney = a.getAccBalance() + depoAmount;
				a.setAccBalance(addMoney);
				System.out.println(depoAmount + " Rs added successfully...!!");
				flag = false;
				break;

			}
		}
		if (flag) {
			System.out.println("Account doesn't exit");
		}
	}

	@Override
	public void updateAccountDetails() {

		System.out.println("Enter your account number");
		int accNo = sc.nextInt();
		boolean ans = true;
		for (Account a : accountArray) {

			if (a != null && accNo == a.getAccountNo()) {
				boolean flag = true;
				ans = false;
				while (flag) {
					System.out.println("****************What u want to update..??****************\n"
							+ "1) Update your name.\n" + "2) Update your contact number.\n" + "3) To go to main menu");

					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						updateName(accNo);

						break;
					case 2:
						updateContactNumber(accNo);

						break;
					case 3:
						flag = false;

						break;
					default:

						System.out.println("Enter correct option, Invalid choice...!!");
					}
				}

			}

		}
		if (ans) {
			System.out.println("Account dosnt exist");
		}
	}

}
