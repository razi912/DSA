package OO_ExtraPractice;

import java.util.Scanner;
import java.util.Arrays;

public class TwoPointerPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int grp[]=new int[n];
        for(int i=0;i<n;i++){
            grp[i]=sc.nextInt();
        }
//        String str=sc.nextLine();


//        int i=0,j=1;
//        while(j<n){
//            if(grp[i]==grp[j]){
//                j++;
//            }
//            else{
//                i++;
//                grp[i]=grp[j];
//                j++;
//            }
//        }
//        System.out.println(i+1);
//        System.out.println(Arrays.toString(Arrays.copyOfRange(grp,0,i+1)));

//        boolean isPalindrome=false;
//        int left=0;
//        int right=str.length()-1;
//        while(left<right){
//            if(str.charAt(left)==str.charAt(right)){
//                isPalindrome=true;
//                break;
//            }}
//            if(isPalindrome) System.out.println("yes");
//            else System.out.println("No");

//        int i=0,j=0;
//        while(j<n) {
//            if (grp[j] != 0) {
//                grp[i] = grp[j];
//                i++;
//            }
//            j++;
//        }
//        for(int k=i;k<n;k++){
//            grp[k]=0;
//        }
//        System.out.println(Arrays.toString(grp));




    }
}
