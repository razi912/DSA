package O7_two_pointers;

import java.util.Scanner;

public class CheckPalindromeInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int left=0,right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome) System.out.println("yes");
        else System.out.println("No");

    }
}
