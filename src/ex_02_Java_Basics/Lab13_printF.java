package ex_02_Java_Basics;

public class Lab13_printF {
    static void main(String[] args) {

//        ln commands
        System.out.println("It will add a new line");
        //System.out.print("It will not add a new line");

        int a = 10;
        System.out.println("This is value of a -->"+a);
        System.out.print("This is value of a -->"+a);

//          f commands
        System.out.printf("Value of a is %d",a);
        // %d --> int, type, short, long -->data type
        // %s ---> String
        // %f --> float, double
        // %b --> boolean

        int b = 10;
        int c = 20;
        System.out.printf("when b multiplied with c result is = %d * %d", b, c);


    }
}