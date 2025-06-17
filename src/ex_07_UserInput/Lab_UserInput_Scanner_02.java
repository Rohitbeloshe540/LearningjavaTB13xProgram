package ex_07_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = number.next();
        System.out.println(name);

        System.out.println("Enter the rollno");
        int rollno = number.nextInt();
        System.out.println(rollno);


        System.out.println("Enter the double");
        double double_input  = number.nextDouble();
        System.out.println(double_input );

    }
}
