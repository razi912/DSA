package O6_strings;

import java.util.Scanner;

public class CountFrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();
        boolean visited[]=new boolean[str.length()];

        for(int i=0;i<str.length();i++){
            if(visited[i])
                continue;
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(str.charAt(i)+" = "+count);
        }
    }
}
