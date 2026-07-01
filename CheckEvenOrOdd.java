package JavaPractise;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int userNumber = scanner.nextInt();
        String numberType = "";
        if(userNumber % 2 == 0){
            numberType = "Even";
        }else{
            numberType = "Odd";
        }
        System.out.println(userNumber + " => " + numberType);
    }
}
