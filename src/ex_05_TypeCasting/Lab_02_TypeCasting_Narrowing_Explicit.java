package ex_05_TypeCasting;

public class Lab_02_TypeCasting_Narrowing_Explicit {
    public static void main(String[] args) {
        int val = 300;
//        byte b = val; Not possible since it is implicit narrowing.
        byte b = (byte)val;
        System.out.println(b); //Explicit Narrowing

    }
}

