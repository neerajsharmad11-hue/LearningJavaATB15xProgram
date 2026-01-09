package ex_05_TypeCasting;

public class Lab_06_ExtraExamples {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; //Widening
        System.out.println(ch);
        System.out.println(ascii);

        int num = 65;
        char ch1 = (char)num; //Narrowing Explicit
        System.out.println(ch1);
    }
}
