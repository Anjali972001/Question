package com.Anjali;



import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the required number: ");
        float number = input.nextFloat();
        // automatic conversion from float data type to int data type
        // As we can also give int value instead of float. It will not give any error. And it will directly convert
        // integer into float.
        System.out.println(number);
        System.out.println("Second operation");
        System.out.println("Enter the required number: ");
        int number2 = input.nextInt();
        // we cannot give float value instead of integer value and it will not execute
        // and will give error.
        System.out.println(number2);
        float sum = number + number2;
        System.out.println("sum of the given number is " + sum);
        // Narrowing conversion or type casting: as there is no automatic conversion.
        // compressing the bigger number into smaller type called type casting.
        float num = (int)(78.2f);
        System.out.println("integer value is " +num);

        // Automatic type promotion in expression
        int a = 258;
        byte b = (byte)(a);
        System.out.println(b);// Here, output will be 1 as we can only store 256 value in byte so this 2 is remainder.
        // 258 % 256 = 2


        byte e = 50;
        byte f = 40;
        byte c = 100;
        int  g = (e*f)/c;
        System.out.println(g); // output=20(int)
        // Automatic type casting as byte is smaller than integer.

        int num4 = 'e';
        System.out.println(num4); // output= 101
        // automatic type conversion ( ascii value of e)

        //// Java follow unicode system as it can  also have symbols.


        //// Very important concept related to data type.
        byte z = 42;
        char h = 'a';
        short s =1024;
        int i =50000;
        float o=5.67f;
        double t=0.1234;
        double result=(o*z) + (i/c) -(t*s);
        System.out.println((o*z)+" " + (i/c)+ " " + (t*s));
        System.out.println(result);  //output = 238.14 500 126.3616 and 611.77841....
        // float + int - double = double
        // we will get result in largest data type.








    }
}
