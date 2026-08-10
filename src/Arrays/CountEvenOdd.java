package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp = new int[n];
        for (int i = 0; i < n; i++) {
            grp[i] = sc.nextInt();
        }

        int countEven = 0, countOdd = 0;
        for (int i = 0; i < n; i++) {
            if(grp[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("No. of even elements: "+countEven);
        System.out.println("No. of odd elements: "+countOdd);

    }
}
