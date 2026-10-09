package p03_math;

import java.util.Scanner;

public class LargestDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest=Integer.MIN_VALUE;
        while(n>0){
            int digit = n%10;
            if(digit>largest)largest=digit;
            n/=10;
        }
        System.out.println(largest);
    }
}
