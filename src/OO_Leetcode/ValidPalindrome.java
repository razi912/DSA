package OO_Leetcode;

//125
import java.util.Scanner;

public class  ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String s2 = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='0' && ch<='9')s2+=ch;
        }
        System.out.println(checkPalindrome(s2));
    }
    static boolean checkPalindrome(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return s.equals(rev);
    }
}
