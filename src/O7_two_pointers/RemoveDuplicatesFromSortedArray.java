package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grp[]=new int[n];
        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int i=0;
        int j=1;
        while(j<n){
            if(grp[i]==grp[j]){
                j++;
            }
            else{
                i++;
                grp[i]=grp[j];
                j++;
            }
        }
        System.out.println(i+1);
        System.out.println(Arrays.toString(Arrays.copyOfRange(grp,0,i+1)));
    }
}
