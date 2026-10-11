package p10_hashing;

import java.util.*;

public class SecHighestFreqElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int freq[]=new int[100000];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        int max=0;
        int secMax=0;
        int maxElement=-1;
        for(int i=0;i<n;i++){
            if(freq[arr[i]]>max)max=freq[arr[i]];
            if(freq[arr[i]]>secMax && freq[arr[i]]!=max){
                secMax=freq[arr[i]];
                maxElement=arr[i];
            }
        }

        System.out.println(maxElement);

    }
}
