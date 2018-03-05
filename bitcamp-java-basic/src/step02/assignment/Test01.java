package step02.assignment;

public class Test01{
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        
        String name;
        int i1;
        int i2;
        int i3;
        

        System.out.print("이름? ");
        name = keyScan.nextLine();
        
        System.out.print("국어? ");
        i1 = keyScan.nextInt();
        
        System.out.print("영어? ");
        i2 = keyScan.nextInt();
        
        System.out.print("수학? ");
        i3 = keyScan.nextInt();
        
        int sum = i1+i2+i3;
        double avg = sum/3.0;
        System.out.println("------------------");
        System.out.print(" "+name+" "+ i1 + " " + i2 + " " + i3 + " " + sum + " " + avg);
    }
}