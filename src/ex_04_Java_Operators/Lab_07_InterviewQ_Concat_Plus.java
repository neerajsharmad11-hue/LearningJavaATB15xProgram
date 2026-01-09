package ex_04_Java_Operators;

public class Lab_07_InterviewQ_Concat_Plus {
    public static void main() {
// Here + operator behave as arithmetic operator in case of integers or numeric values
        int a = 10;
        int b = 20;
        System.out.println(a+b);

//        But in case of String + symbol act to concatenate strings

        String first_name = "Neeraj";
        String last_name = "Sharma";
        System.out.println(first_name+last_name);

//        Interview Question1 -
//        Rule 01
//        So when String is also available, all + operator act to concatenate
//        JVM follows left to right and since first concatenation is done hence + follows to do same  for rest operands also.
//        Arithmetic operation is not performed here.
        first_name = "Neeraj";
        last_name = "Sharma";
        a = 10;
        b = 20;
        System.out.println(first_name+last_name+a+b);

        //        Interview Question2 -
//        Rule 02
//      Here first arithmetic operation is performed and than concatenation.
        first_name = "Neeraj";
        last_name = "Sharma";
        a = 10;
        b = 20;
        System.out.println(a+b+first_name+last_name);

//        Interview Question3 -
//      Rule 03
//      Here BODMAS formula is used
        System.out.println(first_name+last_name+(a+b));

//        Interview Question4 -
//      Here BODMAS formula is used -- Brackets off Div, mul, add,  sub
        System.out.println((a+b)+first_name+last_name);




    }
}
