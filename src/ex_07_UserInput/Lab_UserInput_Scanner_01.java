package ex_07_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = number.nextInt();
        String CanIVote = age>18? "YES" : "NO";
        System.out.println(CanIVote);
    }
}

