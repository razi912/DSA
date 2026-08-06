package Math;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int digit;
        int sum = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;

        while (temp != 0) {
            digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (num == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}