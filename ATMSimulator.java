package JavaPractise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        //SCANNER CLASS WHICH WILL TAKES INPUT FROM THE USER
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO ATM SIMULATOR SYSTEM");
        //USERS OPTIONS
        System.out.println("1 -> DEPOSIT AMOUNT");
        System.out.println("2 -> WITHDRAW AMOUNT");
        System.out.println("3 -> CHECK BANK BALANCE");
        System.out.println("4 -> EXIT APPLICATION");
        boolean start = true;

        //INITIAL BANK BALANCE
        int totalBankBalance = 10000;
        while (start){
            //USER TO SELECT THE OPTION
            System.out.println("Select Your Option: ");
            int userOption = scanner.nextInt();

            //IF USER ENTERS OPTION 1 THEN USER SHOULD DEPOSIT THE AMOUNT...
            if(userOption == 1){
                System.out.println("Enter the amount to deposit: ");
                int amountToDeposit = scanner.nextInt();
                totalBankBalance += amountToDeposit;

            //IF USER ENTERS 2 THEN USER SHOULD WITHDRAW THE AMOUNT AND BANK
                // BALANCE SHOULD BE MAINTAINED UPTO 10000
            }else if(userOption == 2) {
                if (totalBankBalance <= 10000) {
                    System.out.println("Please maintain proper bank balance...");
                    return;
                } else {
                    System.out.println("Enter the amount to withdraw");
                    int amountToWithdraw = scanner.nextInt();
                    totalBankBalance -= amountToWithdraw;

                }
            //IF USER ENTERS 3 THEN TOTAL BANK BALANCE WILL BE DISPLAYED
            }else if(userOption == 3){
                System.out.println("Total Bank Balance: " + totalBankBalance);
            //IF USER ENTERS 4 THE USER WILL BE TERMINATED FROM THE APPLICATION
            }else if(userOption == 4){
                start = false;
            //IF THE USER ENTERED OPTION IS NOT VALID THEN IT WILL SHOW AS RESTART APPLICATION
            }else{
                System.out.println("RESTART APPLICATION...");
            }
        }

    }
}

///FROM THE PROJECT I HAVE LEARNT ABOUT CONDITIONS, LOOPS(FOR, WHILE, DO-WHILE), VARIABLES, DATA TYPES,
//THIS PROJECT HELPED ME TO RECALL ALL THE BASICS IN THE JAVA.