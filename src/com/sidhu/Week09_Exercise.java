package com.sidhu;

public class Week09_Exercise {
    public static void main(String[] args) {
        // Give a string to count each word from it.
        String Str = "hello hello how are you HELLO are there happy test you";

        Str = Str.toLowerCase();                         // Convert the string into lower case
        String[] words = Str.split(" ");           // Split the word from String
        int countWord = 1;                               // Variable used to count repeated word

        System.out.println("Input Str = \"" + Str + "\"");
        System.out.println("Output: ");
        for(int i = 0; i < words.length; i++)            // Comparison in Outer Loop
        {
            for(int j = i + 1; j < words.length; j++)    // Comparison in Inner Loop
            {
                if(words[i].equals(words[j]))            // To check whether both strings are equal or not
                {
                    countWord = countWord + 1;           // if equal increment the count
                    words[j] = "0";                      // And replace repeating words with zero
                }
            }

            if(!words[i].equals("0"))
                System.out.println(words[i]+" -> " + countWord);    // Output of each word with count
            countWord = 1;
        }
    }
}
