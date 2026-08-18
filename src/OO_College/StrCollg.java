package OO_College;
import java.util.Arrays;

//'A' = 65
//'a' = 97
//'0' = 48
//' ' = 32


public class StrCollg {
    public static void main(String[] args) {
        String name = "abcd";
        String s1 = new String("abcd");
        System.out.println(s1);

        char chrs[]={'A','b','c','e','f'};
        String s2 = new String(chrs);
        System.out.println(s2);

        char arr[]=s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);
        System.out.println(s2.length());

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            System.out.println(ch);
        }

        char ch ='a';
        int a = ch-32;
        System.out.println((char)a);

    }

}
