package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveTargetFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int grp[]=new int[n];
        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int i=0,j=0;
        while(j<n) {
            if (grp[j] == val) {
                j++;
                continue;
            }
            else{
                grp[i]=grp[j];
                i++;
                j++;
            }
        }
        System.out.println(i);
        System.out.println(Arrays.toString(Arrays.copyOfRange(grp,0,i)));
    }
}

