package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class VerifySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp = new int[n];
        for(int i = 0 ; i<n;i++){
            grp[i]=sc.nextInt();
        }

        boolean verify = true;
        for(int i = 0;i<n-1;i++){
            if(grp[i]>grp[i+1]){
                verify=false;
                break;
            }
            else{
                verify=true;
            }
        }
        if(verify){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

}
