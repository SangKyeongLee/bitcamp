package bitcamp.java106.pms;
import bitcamp.java106.pms.domain.Team;

public class Club{
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);

        // ver 0.8 - team/view 명령을 구현한다.
        // 1단계: 입력 값에서 명령어와 검색어를 구분한다.
        // 2단계: 기능이나 코드가 바뀌면 그에 따라 적절히 변수명도 바뀔 필요가 있다.
        // 3단계: 입력 값에서 검색어를 별도의 변수에 저장한다.
        // 4단계: 팀명이 없으면 안내문구를 출력한다.
        // 5단계: 팀명으로 배열을 뒤져 팀 정보를 찾는다.
        // 6단계: 팀명으로 검색할 때 대소문자를 구분하지 않는다.
        // 7단계: 팀명이 일치하는 팀이 없으면 안내 문구를 출력한다.
        // ver 0.7 - team/list 명령을 구현한다.
        // ver 0.6 - team/add 명령을 구현한다.
        // ver 0.5 - help 명령을 구현한다.
        // ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
        // ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
        // ver 0.2 - 사용자로부터 입력을 받아 출력한다.
        // ver 0.1 - 명령 입력 프롬프트를 출력한다. 

        Team[] teams = new Team[1000];
        int teamIndex = 0;     

        while(true) {
            System.out.print("명령> ");
            String arr[] = keyScan.nextLine().split(" ");
            String command = arr[0];
            String option = null;
            if(arr.length == 2) {
                option = arr[1];
            }

            if(command.toLowerCase().equals("quit")) {
                System.out.println("안녕히 가세요! 다음에 또 만나요!");
                break;

            } else if(command.toLowerCase().equals("help")) {
                System.out.println("[ 도움말 ]");
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                
            } else if(command.toLowerCase().equals("team/add")) {

                Team team = new Team(); 

                System.out.println("[ 팀 등록하기 ]");

                System.out.print("팀명? ");
                team.teamName = keyScan.nextLine();

                System.out.print("설명? ");
                team.description = keyScan.nextLine();
                
                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine();

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamIndex++] = team;
                

            } else if(command.toLowerCase().equals("team/list")) {
                System.out.println("[ 팀 목록 ]");
                for(int k = 0; k < teamIndex; k++) {
                    System.out.printf("%s %d %s ~ %s\n",
                     teams[k].teamName, teams[k].maxQty,
                      teams[k].startDate, teams[k].endDate);
                }

            } else if(command.toLowerCase().equals("team/view")) {
                System.out.println("[ 팀 정보 조회 ]");

                if(option == null) {
                    System.out.println("팀명을 입력해주세요.");

                    continue;
                }

                Team team = null;
                for(int i = 0; i < teamIndex; i++) {
                    if(option.toLowerCase().equals(teams[i].teamName)) {
                        team = teams[i];
                        break;
                    }
                }

                if(team == null) {
                    System.out.println("해당하는 이름의 팀을 찾을 수 없습니다.");
                } else {
                    System.out.printf("팀명: %s\n", team.teamName);
                    System.out.printf("설명: %s\n", team.description);
                    System.out.printf("최대인원: %d\n", team.maxQty);
                    System.out.printf("기간: %s ~ %s\n", team.startDate,
                                     team.endDate);
                }

            }
            
            System.out.println(command);
            System.out.println();
        }
        
    }
}