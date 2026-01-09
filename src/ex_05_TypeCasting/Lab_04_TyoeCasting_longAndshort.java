package ex_05_TypeCasting;

public class Lab_04_TyoeCasting_longAndshort {
    public static void main(String[] args) {
        long phone = 9566139989l;
//        short s = phone; //Narrowing Implicit. This is not allowed
//        Implicit Narraowing is never allowed in Java
        short s1 = (short)phone;
        System.out.println(s1);



    }
}
