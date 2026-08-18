package OO_College;

import java.util.Scanner;

public class _1DArrayClg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        for(int i = 0;i<n;i++){
            marks[i] = sc.nextInt();

        }
        int max = marks[0];
        for(int i =0;i<n;i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        int min = marks[0];
        for(int i =0;i<n;i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

        long sum = 0;
        for(int i = 0;i<n;i++){
            sum+=marks[i];
        }
        System.out.println("Sum: "+sum);

        double avg = 1.0*sum/n;
        System.out.println("average: "+avg);

        System.out.print("Value to search: ");
        int val = sc.nextInt();
        boolean found = false;

        for(int i =0;i<n;i++){
            if(marks[i]==val){
                found = true;
                break;
            }
        }
        if(found) System.out.println("Number Found");
        else System.out.println("Not Found");


    }
}
