package com.sidhu;

public class Week09_Exercise {
    public static void main(String[] args) {
        // Give a string to count each word from it.
        String Str = "hello hello how are you HELLO are there happy test you";

        Str = Str.toLowerCase();                         // Convert the string into lower case
        String[] words = Str.split(" ");           // Split the word from String
        int countWord = 1;                               // Variable used to count repeated word

    }
}
