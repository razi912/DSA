package O6_strings;

import java.util.Scanner;

public class LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        //with function
        System.out.println("Lower case to upper case with function "+str.toUpperCase());

        //without function
        String up="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            ch=(char)(ch-32);
            up+=ch;
        }
        System.out.println("Lower case to upper case without function "+up);

    }
}
