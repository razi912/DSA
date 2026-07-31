package Math;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int org=n;
        int rev=0;
        while(n!=0){
            int d = n%10;
            rev=rev*10+d;
            n/=10;

        }
        if(rev==org){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
