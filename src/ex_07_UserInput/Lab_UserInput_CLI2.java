package ex_07_UserInput;

public class Lab_UserInput_CLI2 {

    public static void main(String[] args) {
        System.out.println(args[0]);  //java.lang.ArrayIndexOutOfBoundsException - if we do not pass value
        System.out.println(args[1]);

        System.out.println(args[2]);
        System.out.println(args[4]);  //java.lang.ArrayIndexOutOfBoundsException

    }

}
