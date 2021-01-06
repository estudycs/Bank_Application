package com.company;

import java.util.Scanner;

public class BankAcc {
    private int id;
    private String name;
    int balance;
    int PreTransaction;
    Scanner sc = new Scanner(System.in);

    public BankAcc(int id, String name) {
        this.id=id;
        this.name=name;
    }

    void deposite(int amt){
        if (amt != 0) {
            balance = amt + balance;
            PreTransaction = amt;
        }
    }

    void withdraw(int amt){
        if (amt>=balance) {
            System.out.println("You Don't have sufficient balance in your Account");
        }
        else if(amt != 0){
            balance -= amt;
            PreTransaction = -amt;
        }

    }

    void LastTransaction(){
        if (PreTransaction>0){
            System.out.println("Deposited : $" + PreTransaction);
        }
        else if (PreTransaction<0){
            System.out.println("Withdrwaed : $" + Math.abs(PreTransaction));
        }
        else {
            System.out.println("No Transaction occured.");
        }
    }

    void showMenu(){
        char op = '\0';

        System.out.println("Welcome "+ name);
        System.out.println("Your Bank Acc No. "+ id);
        System.out.println("\n");
        System.out.println("A : Check Balance ");
        System.out.println("B : Deposite ");
        System.out.println("C : Withdraw ");
        System.out.println("D : Last Transaction ");
        System.out.println("E : Exit ");
        do {

            System.out.println("-------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
            op = sc.next().charAt(0);
            System.out.println("-------------------------------------------------------------");

            switch (op){
                case 'A' :
                    System.out.println("Balance = $"+ balance);
                    System.out.println('\n');
                    break;
                case 'B' :
                    System.out.print("Enter amout to deposite : $");
                    int Damount = sc.nextInt();
                    deposite(Damount);
                    System.out.println('\n');
                    break;
                case 'C' :
                    System.out.print("Enter amout to withdraw : $");
                    int Wamount = sc.nextInt();
                    withdraw(Wamount);
                    System.out.println('\n');
                    break;
                case 'D' :
                    LastTransaction();
                    break;
                case 'E' :
                    break;
                default:
                    System.out.println("Wrong Choice. Please enter again:");
            }
        }while (op != 'E');
        System.out.println("********* Thank You *********");
    }
}
