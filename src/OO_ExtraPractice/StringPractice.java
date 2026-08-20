package OO_ExtraPractice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

//        String rev="";
//        for(int i=str.length()-1;i>=0;i--){
//            rev+=str.charAt(i);
//        }
//        System.out.println("reverse is "+rev);
//        boolean checkPalindrome=false;
//        if(str.equals(rev)){
//            checkPalindrome=true;
//        }
//        System.out.println("Palindrome: "+checkPalindrome);
//
//        int vowels=0,consonants=0;
//        String lowStr=str.toLowerCase();
//        for(int i=0;i<str.length();i++){
//            char ch=lowStr.charAt(i);
//
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')vowels++;
//            else if(ch>='a' && ch<='z')consonants++;
//        }
//        System.out.println("vowels: "+vowels+", consonants: "+consonants);


//        str=str.toLowerCase();
//        boolean visited[]= new boolean[str.length()];
//        for(int i=0;i<str.length();i++){
//            if(visited[i])continue;
//            int count=0;
//            for(int j=0;j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    count++;
//                    visited[j]=true;
//                }
//            }
//            System.out.println(str.charAt(i)+": "+count);
//    }

//        char ch []=str.toCharArray();
//        for(int i= ch.length-1;i>=0;i--){
//            System.out.print(ch[i]);
//        }

//        int vowels =0,consonants=0;
//        for(int i =0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                vowels++;
//            }
//            else if(ch>='a' && ch<='z'){
//                consonants++;
//            }
//        }
//        System.out.println("vowels: "+vowels+" consonants: "+consonants);


//        boolean visited[]=new boolean[str.length()];
//        for(int i=0;i<str.length();i++){
//            if(visited[i]==true)continue;
//            int count=0;
//            for(int j=0;j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    count++;
//                    visited[j]=true;
//                }
//            }
//            System.out.println(str.charAt(i)+" : "+count);
//        }

//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        String updated = str.substring(start,end);
//        System.out.println(updated);

//        String target = "world";
//        String word = "Razi";
//        System.out.println(str.replace(target,word));

        for(int i=0;i<str.length();i++){
            int count =0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.charAt(i));
                break;
            }
        }

        //reverse a string
        //count vowels and consonants in a string
        //frequency of every character in a string
        //substring of a given sentence
        //word replace
        //find the first unique character in a string


        }
}
