package p10_hashing;

import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int check=sc.nextInt();


        int hash[]= new int[15];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }


        System.out.println(hash[check]);
    }
}
