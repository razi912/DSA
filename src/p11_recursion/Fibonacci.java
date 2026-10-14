package p11_recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));


    }
    static int fib(int num){
        if(num==0)return 0;
        if(num ==1)return 1;

        return fib(num-1)+fib(num-2);
    }
}
