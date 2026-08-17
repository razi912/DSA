package O5_arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] grp = new int[n];
        for(int i=0; i<n; i++){
            grp[i] = sc.nextInt();
        }

        //Optimal
        int nLargest = grp[0];
        int nSecLargest = Integer.MIN_VALUE;
        for(int i = 0 ;i<n;i++){
            if(grp[i]>nLargest){
                nLargest=grp[i];
            }
        }
        for(int i = 0;i<n;i++){
            if(grp[i]>nSecLargest && grp[i]!=nLargest){
                nSecLargest=grp[i];
            }
        }
        System.out.println("Second largest in On: "+ nSecLargest);

        //Brute Force
        Arrays.sort(grp);
        int largest = grp[n-1] ;
        int secLargest = Integer.MIN_VALUE;
        for(int i=n-2; i>=0;i--){
            if(grp[i]!=largest){
                secLargest=grp[i];
                break;
            }
        }
        System.out.println("Second largest in nlogn: "+ secLargest);


    }
}
