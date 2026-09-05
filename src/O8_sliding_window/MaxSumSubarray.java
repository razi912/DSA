package O8_sliding_window;

//Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

import java.util.Scanner;

public class MaxSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        //brute force
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - (k - 1); i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if(sum>max)max=sum;
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
           max=Math.max(max,winSum);
        }
        System.out.println(max);

    }
}
