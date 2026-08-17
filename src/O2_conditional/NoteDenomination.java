package O2_conditional;

import java.util.Scanner;

public class NoteDenomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int count = 0;
        if(n>=500){
            count=count + n/500;
            n=n%500;
        }
        if(n>=200){
            count=count+n/200;
            n=n%200;
        }
        if(n>=100){
            count=count+n/100;
            n=n%100;
        }
        if(n>=50){
            count=count+n/50;
            n=n%50;
        }
        if(n>=20){
            count=count+n/20;
            n=n%20;
        }
        if(n>=10){
            count=count+n/10;
            n=n%10;
        }
        if(n>=5){
            count=count+n/5;
            n=n%5;
        }
        if(n>=2){
            count=count+n/2;
            n=n%2;
        }
        if(n==1){
            count=count+n;

        }
        System.out.println(count);


    }
}
