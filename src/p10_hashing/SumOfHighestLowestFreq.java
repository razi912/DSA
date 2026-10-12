package p10_hashing;

import java.util.*;

public class SumOfHighestLowestFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int freq[]=new int[1000000];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxEle=-1;
        int minEle=-1;
        for(int i=0;i<n;i++){
            if(freq[arr[i]]>max){
                max=freq[arr[i]];
                maxEle=arr[i];
            }
            if(freq[arr[i]]<min){
                min=freq[arr[i]];
                minEle=arr[i];
            }
        }

        System.out.println(minEle+maxEle);



    }
}
