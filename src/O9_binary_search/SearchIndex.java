package O9_binary_search;

import java.util.Scanner;
import java.util.Arrays;

public class SearchIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        int index = Arrays.binarySearch(arr,target);
        int ans = (index<0) ? (Math.abs(index)-1) : index;
        System.out.println(ans);


    }
}
