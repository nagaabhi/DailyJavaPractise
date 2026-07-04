package JavaPractise;

import java.util.Scanner;

public class ATMTransactionSystem {
    public static void main(String[] args) {

        //SCANNER CLASS TO TAKE THE INPUT FROM THE USER
        Scanner scanner = new Scanner(System.in);
        //INITIAL BANK BALANCE TO TRACK THE BALANCE
        int bankBalance = 5000;
        //SUGGESTING USER WHAT STEPS TO TAKE IN ORDER TO MAKE TRANSACTIONS
        System.out.println("=== ATM SIMULATOR SYSTEM ===");
        System.out.println("SELECT YOUR OPTIONS BELOW");
        System.out.println("1 -> DEPOSIT MONEY");
        System.out.println("2 -> WITHDRAW MONEY");
        System.out.println("3 -> CHECK BANK BALANCE");
        System.out.println("4 -> EXIT TRANSACTION");

        boolean start = true;
        while (start){
            //ASKING THE USER TO SELECT THERE CHOICES
            System.out.print("Select the options from above : ");
            int userOption = scanner.nextInt();
            switch (userOption){
                case 1 -> {
                    System.out.print("Enter the amount to deposit: ");
                    int amountToDeposit = scanner.nextInt();
                    bankBalance = depositMoney(amountToDeposit, bankBalance);
                }
                case 2 -> {
                    System.out.print("Enter the amount to withdraw : ");
                    int amountToWithdraw = scanner.nextInt();
                    bankBalance = withdrawMoney(amountToWithdraw, bankBalance);
                }
                case 3 -> {
                    checkTotalBankBalance(bankBalance);
                }

                case 4 -> {
                    System.out.println("TRANSACTION CANCELLED...");
                    start = false;

                }


            }

        }




    }

    //THIS IS METHOD MAINLY USED TO DEPOSIT THE AMOUNT
    public static int depositMoney(int holderMoney, int initialBankBalance){
        int totalBalance = (initialBankBalance += holderMoney);
        System.out.println("Before Deposit : " + (initialBankBalance - holderMoney));
        System.out.println("After Deposit : " + totalBalance);
        return totalBalance;

    }

    //THIS METHOD MAINLY USED TO WITHDRAW AMOUNT
    public static int withdrawMoney(int holderMoney, int initialBankBalance ){
        int totalBankBalance = (initialBankBalance -= holderMoney);
        System.out.println("Before Withdraw : " + initialBankBalance);
        System.out.println("After withdraw : " + totalBankBalance);
        return totalBankBalance;
    }

    //THIS METHOD MAINLY USED TO CHECK THE BANK BALANCE..
    public static int checkTotalBankBalance(int totalBankBalance){
        System.out.println("Total Bank Balance: " + totalBankBalance);
        return totalBankBalance;

    }
}

//THIS IS AN ATM SIMULATOR PROJECT WHICH WILL COVERS ALL THE FUNDAMENTALS OF JAVA...

