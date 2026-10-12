package p11_recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        func(1,n);
    }
    static void func(int i, int num){
        if(i>num) return ;

        System.out.println(i);
        func(i+1,num);


    }
}
