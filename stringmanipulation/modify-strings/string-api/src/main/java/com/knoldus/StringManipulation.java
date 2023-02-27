package com.knoldus;

public class StringManipulation {
    public int getStringLength(String userInput) // Function for finding length of string
    {
        int charachterCount=0;
        // loop for counting number of characters in array
        for(char charachter: userInput.toCharArray())
        {
            charachterCount++;
        }
        System.out.println("Length of string= "+charachterCount);
        return charachterCount;
    }

    public void reverseString(String userInput) //Function for reversing string
    {
        String reverse="";
        // loop for extracting each character staring from the end and concatenating in reverse variable
        for(int indexOfString=0;indexOfString<userInput.length();indexOfString++)
        {
            char charachter=userInput.charAt(indexOfString);
            reverse=charachter+reverse;
        }
        System.out.println("Reverse of String: "+reverse);
    }
}
