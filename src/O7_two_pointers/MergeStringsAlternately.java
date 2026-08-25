package O7_two_pointers;

import java.util.Scanner;
import java.util.Arrays;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        StringBuilder ans= new StringBuilder("");
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        while(i<word1.length())ans.append(word1.charAt(i++));
        while(j<word2.length()) ans.append(word2.charAt(j++));
        System.out.println(ans);
    }
}
