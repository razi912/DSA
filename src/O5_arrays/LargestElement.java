package O5_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int grp[] = new int[n];

        for(int i = 0;i<n;i++){
            grp[i] = sc.nextInt();
        }

        //Optimal
        int largest = grp[0];
        for(int i = 0 ; i<n;i++){
            if(grp[i]>largest){
                largest = grp[i];
            }
        }
        System.out.println("Largest Element in On : "+largest);

        //Brute force
        Arrays.sort(grp);
        int nlargest = grp[n-1];
        System.out.println("Largest Element in nlogn : "+nlargest);

    }
}
