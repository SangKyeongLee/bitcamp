package step09.asignment;

import java.util.Calendar;
import java.util.Scanner;

public class Test01 {
    static Scanner keyScan = new Scanner(System.in);
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        
        System.out.print("년,월,일?(예: 2018 3 21)");
        String[] arr = keyScan.nextLine().split(" ");
        String year = arr[0];
        String month = arr[1];
        String date = arr[2];
        
        cal.set(Calendar.YEAR, Integer.parseInt(year));
        cal.set(Calendar.MONTH, Integer.parseInt(month)-1);
        cal.set(Calendar.DATE, Integer.parseInt(date));
        
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        
        String weeks[] = {"", "일", "월", "화", "수", "목", "금", "토"};
        
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        
        
        
        
    }
}
