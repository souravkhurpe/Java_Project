package com.sbi.controller;
import com.sbi.model.*;
import com.sbi.service.*;

import java.util.Scanner;

public class DehuSBIBranch {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();
		while (flag) {
			System.out.println("-----------------------------------");
			System.out.println("--------WELCOME TO SBI-------------");
			System.out.println("1:   CREATE BANK ACCOUNT           |");
			System.out.println("2:   SHOW ACCOUNT DETAILS          |");
			System.out.println("3:   SHOW ACCOUNT BALANCE          |");
			System.out.println("4:   DEPOSIT MONEY                 |");
			System.out.println("5:   WITHDRAW MONEY                |");
			System.out.println("6:   SHOW SINGLE ACCOUNT DETAILS   |");
			System.out.println("7:   UPDATE ACCOUNT DETAILS        |");
			System.out.println("8:   DELET ACCOUNT		           |");
			System.out.println("9:   EXIT                          |");
			System.out.println("-----------------------------------");
			System.out.println("-----------------------------------");
			System.out.println("*****Enter your Choice*****");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.registerAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositMoney();
				break;
			case 5:
				rbi.withdrawMoney();
				break;
			case 6:
				
				rbi.getSingleaccountDetails();;
				break;
			case 7:

				rbi.updateAccountDetails();
				break;
			case 8:
				
				rbi.deletAccount();
				break;
			case 9:
				flag = false;
				break;
			default:
				System.out.println("Wrong Choice");
				break;

			}

		}

		sc.close();
		System.out.println("Thank You For Banking....!!!!");

	}

}
