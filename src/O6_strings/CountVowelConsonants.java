package O6_strings;

import java.util.Scanner;

public class CountVowelConsonants {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
        }
        System.out.println("vowels: "+vowels+", consonants: "+consonants);
    }
}
