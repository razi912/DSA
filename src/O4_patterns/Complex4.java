
package O4_patterns;

import java.util.Scanner;

public class Complex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(char a='A';a<='A'+(n-1-i);a++){

                System.out.print(a);

            }
            System.out.println();
        }
    }
}
