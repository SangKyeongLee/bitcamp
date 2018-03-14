package step05.assignment;

import java.util.Scanner;

public class Test01_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("가로 길이? ");
        int leng = keyScan.nextInt();
        int i = 0;
        while(i < leng){
            int count = 0;
            while(count <= i){
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }
        
        while(i > 0){
            int count = 1;
            while(count < i){
                System.out.print("*");
                count++;
            }
            i--;        
            System.out.println();
        }
    }
}