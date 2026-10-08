package O10_recursion;

//A funtion calling itself is a recursive function

import java.util.*;

public class BasicRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    static void fun(int n,int i){
        if(i>n)return;
        System.out.print(i+" ");
        fun(n,i+1);
    }
}
