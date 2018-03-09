package bitcamp.java106.pms;

// 컴파일러에게 클래스의 위치 정보를 알려준다.
// => 컴파일한 후 import 명령은 제거된다.
//    즉 .class 파일에 포함되지 않는다.
// => 그러니 import 문장이 많으면 .class 파일이 커지지 않을까 걱정말라!
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

// 4단계: 조건문 적용
public class App_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        // 팀 정보를 받을 메모리 준비
        Member[] members = new Member[5];
        Team[] teams = new Team[5];
        String m;
        String s;
        int count = 0;
        int countM = 0;
        


        for(int i = 0;;i++){
            
            System.out.print("\n명령> ");
            m = keyScan.nextLine();
            String[] view = m.split(" ");
            if(m.equals("help")){
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 등록 명령 : member/list");
                System.out.println("회원 상세조회 명령 : team/view 아이디");
                System.out.println("종료 : quit");

                continue;
            }

            if(m.equals("team/add")) {
                
                // for(int j = 1;j = j; j++) {
                    
                    teams[count] = new Team();

                    System.out.print("팀명? ");
                    teams[count].teamName = keyScan.nextLine();

                    System.out.print("설명? ");
                    teams[count].description = keyScan.nextLine();

                    System.out.print("최대인원? ");
                    teams[count].maxQty = keyScan.nextInt();
                    keyScan.nextLine(); 

                    System.out.print("시작일? ");
                    teams[count].startDate = keyScan.nextLine();

                    System.out.print("종료일? ");
                    teams[count].endDate = keyScan.nextLine();
                // }

                    count++;
                    
                    

                continue;
            }

            if(m.equals("team/list")) {
                System.out.println("-----------------------------");
                for (int k = 0; k < count; k++) {
                    System.out.printf("%s, %d명, %s ~ %s\n", 
                        teams[k].teamName, teams[k].maxQty, 
                        teams[k].startDate, teams[k].endDate);
                }
                
                continue;
            }
            if(view[0].equals("team/view")) {
                for(int f = 0; f < count; f++){
                    if( view[1].equals(teams[f].teamName) ){
                        System.out.printf("팀명: %s\n",teams[f].teamName);
                        System.out.printf("설명: %s\n",teams[f].description);
                        System.out.printf("인원: %d\n",teams[f].maxQty);
                        System.out.printf("기간: %s ~ %s\n", teams[f].startDate, teams[f].endDate);
                        
                        break;
                    }
                    
                }
                
                continue;

            } else if (view[0].equals("team/view") == false){
                System.out.println("해당하는 명령어가 없습니다.");
            } else {
                System.out.println("해당 이름의 팀이 없습니다.");
            }

                
            if(m.equals("member/add")) {

                    members[countM] = new Member();

                    System.out.print("아이디? ");
                    members[countM].id = keyScan.nextLine();

                    System.out.print("이메일? ");
                    members[countM].email = keyScan.nextLine();

                    System.out.print("암호? ");
                    members[countM].pin = keyScan.nextLine();

                    countM++;

                    continue;
            }

            if(m.equals("member/list")) {
                System.out.println("-----------------------------");
                for (int l = 0; l < countM; l++) {
                    System.out.printf("%s, %s, %s\n", 
                    members[l].id, members[l].email, members[l].pin);
                }

                continue;
                
            }

            if(m.equals("quit")){
                System.out.println("안녕히가세요!");
                break;
            }

        }

        // for (int i = 0; i < teams.length; i++) {
        //     count++;
        //     teams[i] = new Team();

        //     System.out.print("팀명? ");
        //     teams[i].teamName = keyScan.nextLine();

        //     System.out.print("설명? ");
        //     teams[i].description = keyScan.nextLine();

        //     System.out.print("최대인원? ");
        //     teams[i].maxQty = keyScan.nextInt();
        //     keyScan.nextLine(); 

        //     System.out.print("시작일? ");
        //     teams[i].startDate = keyScan.nextLine();

        //     System.out.print("종료일? ");
        //     teams[i].endDate = keyScan.nextLine();

        //     System.out.print("명령>");
        //     String str = keyScan.nextLine();
        //     if (str.toLowerCase().equals("team/list")) {
        //         break;
        //     } 
        // }

        // System.out.println("-----------------------------");
        // for (int i = 0; i < count; i++) {
        //     System.out.printf("%s, %d명, %s ~ %s\n", 
        //         teams[i].teamName, teams[i].maxQty, 
        //         teams[i].startDate, teams[i].endDate);
        // }
    }
}