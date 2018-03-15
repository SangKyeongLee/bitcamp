package bitcamp.java106.pms.util;

import java.util.Scanner;

public class Console {
    public static Scanner keyScan;
    
    public static String[] onPrompt() {
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }
}