package O3_math;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm;
        if(a>b) lcm=a;
        else lcm=b;
        while(lcm%a!=0||lcm%b!=0){
            lcm++;
        }
        System.out.println(lcm);
    }
}
