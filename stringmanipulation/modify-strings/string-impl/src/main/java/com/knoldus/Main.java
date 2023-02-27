package com.knoldus;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        //Taking input from user
        System.out.println("Enter String: ");
        String stringInput= sc.next();
        //Creating object and calling function of StringManipulation class
        StringManipulation object=new StringManipulation();
        object.getStringLength(stringInput);
        object.reverseString(stringInput);
    }
}
