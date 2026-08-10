package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp = new int[n];
        for (int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }

        int max=grp[0],min=grp[0];
        for(int i=0;i<n;i++){
            if(max<grp[i]){
                max=grp[i];
            }
            if(min>grp[i]){
                min=grp[i];
            }
        }
        System.out.println("Max is = "+max);
        System.out.println("Min is = "+min);


    }
}
