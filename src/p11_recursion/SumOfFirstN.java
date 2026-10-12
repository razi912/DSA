package p11_recursion;

import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum(n));
    }
    static int sum(int num){
        if(num<1) return 0;

        return num+sum(num-1);

    }
}
