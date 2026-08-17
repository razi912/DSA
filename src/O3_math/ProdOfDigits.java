package O3_math;

import java.util.Scanner;

public class ProdOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit=0,prod=1;
        while(num!=0){
            digit = num%10;
            prod=prod*digit;
            num/=10;
        }
        System.out.println(prod);
    }
}
