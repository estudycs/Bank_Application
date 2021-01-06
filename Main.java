package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String cname = scan.nextLine();
        System.out.print("Enter your Account no. : ");
        int cid = scan.nextInt();

        System.out.println('\n');
	// write your code here
        BankAcc cust = new BankAcc(cid, cname);
        cust.showMenu();

    }
}
