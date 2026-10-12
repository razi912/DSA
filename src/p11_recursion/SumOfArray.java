package p11_recursion;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int grp[]=new int [n];
        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }

        System.out.println(sum(grp,0));
    }
    static int sum(int arr[],int index){
        if(index==arr.length)return 0;
        return arr[index]+sum(arr,index+1);

    }
}
