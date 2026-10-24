package p11_recursion;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(pow(n,a));

    }
    static int pow(int num,int power){
        if(power==0)return 1;
        return pow(num,power-1)*num;
    }

}
