package JavaPractise;

import java.util.Scanner;

public class CheckNumberType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int userNumber = scanner.nextInt();
        String numberType = "";
        if(userNumber > 0){
            numberType = "Positive";
        }else if(userNumber < 0){
            numberType = "Negative";
        }else{
            numberType = "Zero";
        }
        System.out.println(userNumber + " => " + numberType);
    }
}
