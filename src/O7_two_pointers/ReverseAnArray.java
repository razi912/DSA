package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int grp[]=new int[n];
        for(int i=0;i<n;i++) {
            grp[i] = sc.nextInt();
        }
            int left=0,right=n-1;
            while(left<right){
                int temp = grp[left];
                grp[left]=grp[right];
                grp[right]=temp;
                left++;
                right--;

        }
        System.out.println(Arrays.toString(grp));
    }
}
