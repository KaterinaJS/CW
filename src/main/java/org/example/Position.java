package org.example;

/*
When provided with a letter, return its position in the alphabet.
Input :: "a"
Ouput :: "Position of alphabet: 1"
*/

//Solution #1
public class Position {
    public static String position(char alphabet){
        String abc = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (abc.indexOf(alphabet) + 1);
    }
}

//Solution #2
//public class Position {
//    public static String position(char alphabet){
//        return "Position of alphabet: " + (alphabet-'a'+1);
//    }
//}

//Solution #3
//public class Position {
//    public static String position(char alphabet){
//        return "Position of alphabet: " + ((int) alphabet - 96);
//    }
//}
