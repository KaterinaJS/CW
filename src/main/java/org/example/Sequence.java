package org.example;

/*
Build a function that returns an array of integers from n to 1 where n>0.
Example : n=5 --> [5,4,3,2,1]
 */

// Solution #1

public class Sequence {
    public static int[] reverse(int n){
        int[] arr = new int[n];
        for(int i = n - 1; i >= 0; i--){
            arr[i] = n - i;
        }
        return arr;
    }
}

// Solution #2

//public class Sequence {
//    public static int[] reverse(int n){
//        int[] arr = new int[n];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = n - i;
//        }
//        return arr;
//    }
//}
