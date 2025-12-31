package ex_03_Java_Literals;

public class Lab_05_Literals_P4 {
    public static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Binary System
        // https://www.rapidtables.com/convert/number/binary-to-decimal.html?x=1010

        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        System.out.println(binary_num);
        System.out.println(octal);
        System.out.println(hex);
    }
}
