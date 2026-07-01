package JavaPractise;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int avgMarks = 0;
        int i;
        for(i = 1; i <= 5; i++){
            System.out.print("Enter the subject " + i + " Marks: ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        System.out.println("Total Marks: " + totalMarks);
        avgMarks = totalMarks / 5;
        System.out.println("Average Marks: " + avgMarks);

        String studentGrade = "";
        if(totalMarks == 500){
            studentGrade = "A+";
        }else if(totalMarks < 500 && totalMarks > 450){
            studentGrade = "A";
        }else if(totalMarks > 400 && totalMarks < 450) {

            studentGrade = "B";
        }else if(totalMarks > 350 && totalMarks < 400) {
            studentGrade = "C";
        }else if(totalMarks > 300 && totalMarks < 350) {
            studentGrade = "D";
        }else if(totalMarks < 300) {
            studentGrade = "Fail";
        }

        System.out.println("STUDENT GRADE: " + studentGrade);




        }

    }

