package ex_08_Increment_decrement;

public class lab08_EXP2 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);


        // A + B
        // A --> ++a --> Exp A --> 11 , a=11
        // B --> ++a --> Exp B --> 12 , a=12
        // A+B --> Exp A+Exp B --> 11 + 12 = 23
    }
}
