package OO_ExtraPractice;

import java.util.Scanner;

public class ArrayPractice {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no. of elements: ");
            int n = sc.nextInt();

            int[] grp = new int[n];
            for(int i = 0;i<n;i++){
                grp[i]=sc.nextInt();
            }
//            int sum = 0;
//            for (int i=0;i<n;i++){
//                sum+=grp[i];
//            }

//            int largest=grp[0];
//            for(int i=0;i<n;i++){
//                if(grp[i]>largest){
//                    largest=grp[i];
//                }
//            }
//            int seclar=Integer.MIN_VALUE;
//            for(int i=0;i<n;i++){
//                if(grp[i]>seclar && largest!=grp[i]){
//                    seclar=grp[i];
//                }
//            }

//            int left =0;
//            int right = n-1;
//            while(left<right){
//                int temp = grp[left];
//                grp[left]=grp[right];
//                grp[right]=temp;
//                left++;
//                right--;
//            }

//            int max= grp[0],min=grp[0];
//            for (int i =0;i<n;i++){
//                if(grp[i]>max){
//                    max=grp[i];
//                }
//            }
//            for (int i =0;i<n;i++){
//                if(grp[i]<min){
//                    min=grp[i];
//                }
//            }

//            int target = sc.nextInt();
//            int index = -1;
//            for (int i = 0;i<n;i++){
//                if(grp[i]==target){
//                    index=i;
//                }
//            }

//            int counteve=0,countodd=0;
//
//            for (int i =0;i<n;i++){
//                if(grp[i]%2==0){
//                    counteve++;
//                }
//                else{
//                    countodd++;
//                }
//            }

//            int k=sc.nextInt();
//            int temp []= new int[n];
//            int index = 0;
//
//            k=k%n;
//            for(int i=k;i<n;i++){
//                temp[index]=grp[i];
//                index++;
//            }
//            for(int i=0;i<k;i++){
//                temp[index]=grp[i];
//                index++;
//            }

//            int j=0;
//            for (int i=1;i<n;i++){
//                if(grp[i]!=grp[j]){
//                    j++;
//                    grp[j]=grp[i];
//                }
//            }
//            for(int i =0;i<=j;i++){
//                System.out.println(grp[i]);
//            }


        }
    }


