package ex_09_If_Condition;

import java.util.Scanner;

public class lab02_If_02 {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("you are allowed to vote");
        }
        else {
            System.out.println("you are not allowed to vote");

        }
    }
}
