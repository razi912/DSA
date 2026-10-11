package p10_hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);


        int hash[]=new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]+=1;
        }

        System.out.println(hash[c]);

    }

}
