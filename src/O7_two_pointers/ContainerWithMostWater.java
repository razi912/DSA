package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grp[]=new int[n];
        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int i=0,j=n-1,max=0;
        while(i<j){
            int width=j-i;
            int height=0;
            if(grp[i]<grp[j])height=grp[i];
            else height=grp[j];
            int currWater=width*height;
            if(grp[i]<grp[j])i++;
            else j--;
            if(currWater>max)max=currWater;
        }
        System.out.println(max);
    }
}
