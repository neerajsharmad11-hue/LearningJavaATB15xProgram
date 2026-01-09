package ex_04_Java_Operators;

public class Lab_14_InterviewQ_Char_INT {
    public static void main(String[] args) {
        char a1 = 'A';
        char a2 = 'B';
        System.out.println(a1);
        System.out.println(a2);

//        But If we print a1+a2, system will print with characters real value that is
//        It will show sum of ASCI value of both a1 and a2 and print. a1=65 and a2=66.
//        Hence proved characters are nothing but integers.
        System.out.println(a1+a2);
        System.out.println(a1-a2);

    }
}
