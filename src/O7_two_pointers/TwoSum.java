package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int grp[]=new int[n];
        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int i=0,j=n-1;
        while(i<j){
            if(grp[i]+grp[j]==target){
                System.out.println(grp[i]+" and "+grp[j]);
                break;
            }
            else if(grp[i]+grp[j]>target){
                j--;
            }
            else if(grp[i]+grp[j]<target){
                i++;
            }
        }
    }
}
