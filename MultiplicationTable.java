package JavaPractise;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Multiplication Number: ");
        int multiNumber = scanner.nextInt();
        int i;
        for(i = 1; i <= 20; i++){
            System.out.println(multiNumber + " * " + i + " = " + multiNumber * i);
        }
    }
}
