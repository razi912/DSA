package p11_recursion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(countDig(n));
    }
    static int countDig(int num){
        if(num<10)return 1;
        return countDig(num/10)+1;
    }
}
