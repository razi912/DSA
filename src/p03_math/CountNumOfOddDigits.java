package p03_math;

import java.util.Scanner;

public class CountNumOfOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count =0;
        while(n>0){
            int digit = n%10;
            if(digit%2!=0)count++;
            n=n/10;
        }

        System.out.println(count);
    }
}
