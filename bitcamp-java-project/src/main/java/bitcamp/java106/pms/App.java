package bitcamp.java106.pms;

public class App {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String teamName;
        String explain;
        int member;
        String str;
        String end;

        System.out.print("팀명? ");
        teamName = keyScan.nextLine();
        System.out.print("설명? ");
        explain = keyScan.nextLine();
        System.out.print("최대인원? ");
        member = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("시작일? ");
        str = keyScan.nextLine();
        System.out.print("종료일? ");
        end = keyScan.nextLine();

        System.out.println("-------------------");
        System.out.println("팀명: " + teamName);
        System.out.println("설명: \n" + explain);
        System.out.println("최대인원: " + member + "명");
        System.out.println("일자: " + str + " ~ " + end);

    }
}