package com.sbi.model;

import java.util.Scanner;

public class test {

	Scanner s = new Scanner(System.in);

	public void checkContactNo() {
		boolean flag = true;
		while (flag) {

			System.out.print("Enter mobile number:");
			long no = s.nextLong();

			String mobileNo = String.valueOf(no);

			if (mobileNo.length() == 10 && mobileNo.startsWith("9") || mobileNo.startsWith("8")) {
				System.out.println("valid number");
				flag = false;
			} else {
				System.out.println("Invalid number");

			}
		}
	}

	public void checkName() {
		boolean flag = true;
		while (flag) {
			System.out.print("Enter your name:");
			String name = s.nextLine();
			String name2 = name.replaceAll("[0-9]", "");

			boolean test = name.length() == name2.length();
//		System.out.println(name2);
			if (name.charAt(0) >= 65 && name.charAt(0) <= 90 && test) {
				System.out.println("Valid name");
				flag = false;
			} else {
				System.out.println("Invalid name, name should not contain digits..!!");
			}
		}
	}

	public void checkPin() {
		boolean flag = true;

		while (flag) {
			System.out.print("Enter pin: ");
			String pin = s.next();

			String pin2 = pin.replaceAll("[a-zA-Z]", "");
//		System.out.println(pin2);
			boolean test = pin.length() == pin2.length();
			if (pin.length() <= 5 && test) {
				System.out.println("Valid pin");
				flag = false;
			} else {
				System.out.println("invalid pin");
				System.out.println();
				if (pin.length() > 5) {
					System.out.println("pin must be less than 5");
				}
				if (!test) {
					System.out.println("Pin must contain only Digits not Character");
				}

			}
		}

	}

	public void checkMail() {
		boolean flag = true;

		while (flag) {
			System.out.print("Enter email:");
			String email = s.next();
			if (email.endsWith("@gmail.com")) {
				System.out.println("Valid pin");
			} else {
				System.out.println("Invalid pin");
			}
		}
	}

	public void checkPan() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter Pan number: ");
			String pan = s.next();
			String pan2 = pan.replaceAll("[^A-Z0-9]", "");
			boolean test = pan.length() == pan2.length();
			if (test) {
				System.out.println("Valid pan");
				flag = false;
			} else {
				System.out.println("Invalid pan");

			}

		}
	}

	public void checkAdhar() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter adhar no: ");

			String adharNumber = s.next();
			String adharnu = adharNumber.replaceAll("[^0-9]", "");
			System.out.println(adharnu);
			boolean test = adharNumber.length() == adharnu.length();
			if (test) {
				System.out.println("Valid adhar");
			} else {
				System.out.println("Invalid adhar");
			}
		}
	}
	

	public static void main(String[] args) {
		test t = new test();

//		t.checkContactNo();
//		t.checkName();
//		t.checkPin();
//		t.checkMail();
//		t.checkPan();
//		t.checkAdhar();
	

	}

}
