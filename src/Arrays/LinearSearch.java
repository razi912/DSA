package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp=new int[n];
        for(int i = 0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        System.out.print("Enter value to search: ");
        int val = sc.nextInt();
        int index = -1;
        boolean found=false;
        for(int i = 0;i<n;i++){
            if(grp[i]==val) {
                index=i;
                found = true;
                break;
            }

        }
        if(found) System.out.println("Value is at index "+index);
        else System.out.println("Value not found");
    }
}
