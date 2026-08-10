package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp=new int[n];
        for(int i =0;i<n;i++){
            grp[i]=sc.nextInt();
        }
        int[] rev= new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            rev[j]=grp[i];
            j++;
        }
        System.out.println("Reversed array: ");
        for(int i = 0;i<n;i++){
            System.out.print(rev[i]+" ");
        }
    }
}
