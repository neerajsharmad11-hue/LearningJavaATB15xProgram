package ex_05_TypeCasting;

public class Lab_05_TypeCasting_PracticalExample {
    public static void main(String[] args) {
int course = 300;
float GST = 18.45f;
//int total1 = course+GST; Implicit narrowing is not allowed.
//        System.out.println(total1);
//Now we will do Explicit Narrowing
        int total2 = course+(int)GST;
//        System.out.println(total2); // But here we are losing the after decimal amount.
//     Hence we will do widening and it will be implicitly done by java
        float total3 = course+GST;  //This is IMPLICIT Widening
        System.out.println(total3); // Here there is no loss of after decimal values.

        float total4 = (float)course+GST; //This is EXPLICIT Widening which is not required to do since JVM will do itself.
        System.out.println(total4);


    }
}
