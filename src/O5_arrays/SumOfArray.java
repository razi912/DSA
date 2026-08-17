package O5_arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp = new int[n];
        for(int i = 0;i<n;i++){
            grp[i]=sc.nextInt();
        }

        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=grp[i];
        }

        System.out.println("Sum is: "+sum);
    }
}
