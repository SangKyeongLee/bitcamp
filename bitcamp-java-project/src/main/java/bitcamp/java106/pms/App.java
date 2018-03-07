package bitcamp.java106.pms;

import bitcamp.java106.pms.test.Team;

public class App {
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);

        Team teams[] = new Team[5];

        for(int i = 0; i < teams.length; i++){
            teams[i] = new Team();

            System.out.print("팀명? ");
            teams[i].teamName = keyScan.nextLine();
            System.out.print("설명? ");
            teams[i].description = keyScan.nextLine();
            System.out.print("최대인원? ");
            teams[i].maxQty = keyScan.nextInt();
            keyScan.nextLine();
            System.out.print("시작일? ");
            teams[i].startDate = keyScan.nextLine();
            System.out.print("종료일? ");
            teams[i].endDate = keyScan.nextLine();
            if(i < teams.length-1){
                System.out.print("계속 입력하시겠습니까?(Y/n)");
                String yes = keyScan.nextLine();
                if(yes.equals("y")){
                    continue;
                }else if(yes.equals("n")){
                    System.out.println("-------------------");
                    for(int j = 0; j < teams.length; j++){
                        System.out.printf("%s, %d, %s ~ %s\n", teams[j].teamName, 
                        teams[j].maxQty, teams[j].startDate, teams[j].endDate);
                    }
                }else{
                    System.out.println("입력 값이 옳지 않습니다. 입력을 종료합니다.");
                    System.out.println("-------------------");
                    for(int k = 0; k <= i; k++){
                        System.out.printf("%s, %d, %s, ~ %s\n", teams[k].teamName, 
                        teams[k].maxQty, teams[k].startDate, teams[k].endDate);
                    }
                    break;
                }
            }else{
                System.out.println("-------------------");
                for(int j = 0; j < teams.length; j++){
                    System.out.printf("%s, %d, %s, ~ %s\n", teams[j].teamName, 
                    teams[j].maxQty, teams[j].startDate, teams[j].endDate);
                }
            }
            
        } 
    }
}