package p10_recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        fun(n,1);
    }

    static void fun(int n,int i){
        if(i>n)return;

        fun(n,i+1);
        System.out.print(i+" ");
    }


}
