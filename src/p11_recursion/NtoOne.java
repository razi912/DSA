package p11_recursion;

import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        func(n,1);
    }
    static void func(int num,int i){
        if(num<1)return;

        System.out.println(num);
        func(num-1,i);
    }
}
