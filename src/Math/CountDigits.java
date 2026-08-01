package Math;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig = 0,count =0;

        while(num!=0){
            dig=num%10;
            count++;
            num/=10;

        }
        System.out.println(count);
    }
}
