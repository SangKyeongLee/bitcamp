package bitcamp.java106.pms;

// 컴파일러에게 클래스의 위치 정보를 알려준다.
// => 컴파일한 후 import 명령은 제거된다.
//    즉 .class 파일에 포함되지 않는다.
// => 그러니 import 문장이 많으면 .class 파일이 커지지 않을까 걱정말라!
import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// 4단계: 조건문 적용
public class App_2_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        String m;
        String add;
        String list;
        
        for(int i = 0; ; i++){
            System.out.print("명령> ");
            m = keyScan.nextLine();
            String[] view = m.split(" ");
            System.out.println(view[1]);

            if(m.equals("quit")){
                break;
            }
        }
        
    }
}