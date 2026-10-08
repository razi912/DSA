package O6_strings;

import java.util.*;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "jAvA PrOGramminG lanGUage";
        str = str.toLowerCase();

        String[] arr= str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String s : arr){
            char ch = Character.toUpperCase(s.charAt(0));
            String s1 = s.substring(1);
            sb.append(ch);
            sb.append(s1);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());




    }
}
