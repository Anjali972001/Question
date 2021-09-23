package com.Anjali;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the temperature in celcius : ");
        float tempC = input.nextFloat();
        float tempF = tempC * (9/5)+32;
        System.out.println(tempF);

    }
}
