package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int grp[]=new int[n];

        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int slow=0,fast=0;
        while(fast<n){
            if(grp[fast]!=0){
                grp[slow]=grp[fast];
                slow++;
            }
            fast++;
        }
        for(int i=slow;i<n;i++){
            grp[i]=0;
        }
        System.out.println(Arrays.toString(grp));

    }
}
