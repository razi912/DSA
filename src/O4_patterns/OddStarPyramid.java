package O4_patterns;

import java.util.Scanner;

public class OddStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2;i<=n;i+=2){
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
