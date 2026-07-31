package Conditional;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int u = sc.nextInt();
            if(u>=1 && u<=100){
                System.out.println(10*u);
            }
            else if(u>=100 && u<=200){
                System.out.println(10*100 + (u-100)*15);
            }
            else if(u>=200 && u<=300){
                System.out.println(10*100 + 15*100 + (u-200)*20);
            }

            else{
                System.out.println(10*100 + 15*100 + 20*100 + (u-300)*25);
            }

        }

    }

