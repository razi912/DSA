package O8_sliding_window;

import java.util.Scanner;

public class MaxAvgSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k=sc.nextInt();

        //brute force
        int max=Integer.MIN_VALUE;
        int avg=0;
        for(int i=0;i<n-(k-1);i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            avg=sum/k;
            if(avg>max)max=avg;
        }
        System.out.println(max);

        //optimal
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int winSum=sum;
        for(int i=k;i<n;i++){
            winSum+=arr[i]-arr[i-k];
        }
        int avgOptimal=winSum/k;
        max=Math.max(max,avg);
        System.out.println(max);
    }
}
