package ex_07_IncrementDecrement_Operator;

public class Lab_01_PreIncrement_Ex01 {
    public static void main(String[] args){
    int a = 10;
    int b = ++a;
        System.out.println(a);
        System.out.println(b);
//        a++ --> a+1
//        Exp and result table - ERT
//        Line no   |   a    |  Result b
//        5         |   10   |  NA
//        6         |   11   |  11
//        7         |   11   |  Not printing
//        8         |   NP   |  11
}

}
