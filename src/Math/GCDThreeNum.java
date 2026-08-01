package Math;

import java.util.Scanner;

public class GCDThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        while(c!=0){
            int rem = a%c;
            a=c;
            c=rem;
        }
        System.out.println(a);
    }
}
