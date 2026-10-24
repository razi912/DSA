package p11_recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();

        System.out.println(reverse(str));

    }
    static String reverse(String s){
        if(s.length()<=1)return s;
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
}