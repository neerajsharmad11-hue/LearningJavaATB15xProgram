package ex_02_Java_Basics;

public class Lab15_Float_Variables {
    static void main(String[] args) {
    float Pi = 3.07f; // Now value of PI can be changed since its not finalised.
        System.out.println(Pi);
//        But once we add final before datatype, changing the value of PI is not possible.
        final float PI = 3.14f;
        System.out.println(PI);

    }
}