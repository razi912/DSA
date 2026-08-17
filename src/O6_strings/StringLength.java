package O6_strings;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //with function
        System.out.println("length with function is "+str.length());

        //without function
        int length =0;
        char ch[]= str.toCharArray();
        for(int i=0;i<ch.length;i++){
            length++;
        }
        System.out.println("length without function is "+length);

    }
}
