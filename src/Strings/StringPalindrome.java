package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = true;

        //By Array
        char arr[]= str.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            if (arr[i] != arr[arr.length-1-i]){
                isPalindrome = false;
                break ;
            }
        }
        if(isPalindrome) System.out.println("Yes,'"+str+"' is a palindrome (Array)");
        else System.out.println("No,'"+str+"' is not a palindrome (Array)");

        //By charAt function
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPalindrome = false;
            }
        }
        if(isPalindrome) System.out.println("yes,(by charAt method)");
        else System.out.println("No, (by charAt method)");
    }




}
