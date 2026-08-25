package O7_two_pointers;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int grp[]=new int[n];
        for(int i =0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        int i=0,j=k-1;
        while(i<j){
            int temp = grp[i];
            grp[i]=grp[j];
            grp[j] = temp;
            i++;
            j--;
        }
        i=k;
        j=n-1;
        while(i<j){
            int temp=grp[i];
            grp[i]=grp[j];
            grp[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=n-1;
        while(i<j){
            int temp=grp[i];
            grp[i]=grp[j];
            grp[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(grp));
    }
}
