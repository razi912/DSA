package OO_ExtraPractice;

import java.util.Scanner;
import java.util.Arrays;

public class MidsemPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int rev =0;
//        while(n!=0){
//            int d =n%10;
//            rev = rev*10+d;
//            n/=10;
//        }
//        System.out.println(rev);

//        int n = sc.nextInt();
//        for(int i =1; i<=10;i++){
//            System.out.println(n*i);
//        }

//        int n = sc.nextInt();
//        boolean isPrime = true;
//        if(n<=1){
//            isPrime=false;
//        }
//        for(int i=2;i*i<=n;i++){
//            if(n%i==0){
//                isPrime=false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("No");
//        }

//        int n = sc.nextInt();
//        int arr[]=new int[n];
//        for(int i =0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]>max)max=arr[i];
//            if(arr[i]<min)min=arr[i];
//        }
//        System.out.println("max is "+max+", min is "+min);

//        int n = sc.nextInt();
//        int arr[]=new int [n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int largest= Integer.MIN_VALUE;
//        int secondlargest= Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]>largest)largest=arr[i];
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]>secondlargest && arr[i]!=largest){
//                secondlargest=arr[i];
//            }
//        }
//        System.out.println("largest is "+largest+", second largest is "+secondlargest);

//        int n = sc.nextInt();
//        int target = sc.nextInt();
//        int arr[]=new int[n];
//        int index = -1;
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        boolean found=false;
//        for(int i=0;i<n;i++){
//            if(arr[i]==target){
//                found = true;
//                index=i;
//            }
//        }
//        System.out.println(target+" found at index "+index);

        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if( arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        while(index<n){
            arr[index]=0;
            index++;
        }

        for(int x : arr){
            System.out.print(x+" ");
        }


    }
}
