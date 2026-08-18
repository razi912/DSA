package O6_strings;
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        boolean checkAnagram = true;
        if(str==null || str2==null)checkAnagram=false;
        if(str.length() != str2.length())checkAnagram=false;
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        if(charArray.equals(charArray2))checkAnagram=true;
        System.out.println(checkAnagram);



    }
}
