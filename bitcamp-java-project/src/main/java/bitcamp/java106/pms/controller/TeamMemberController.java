package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.dao.TeamDao;

public class TeamMemberController {
    Scanner keyScan;
    
    TeamDao teamDao = new TeamDao();
    
    public TeamMemberController(Scanner scanner) {
        this.keyScan = scanner;
    }

    public void service(String menu, String option) {
        if (menu.equals("teamber/add")) {
            this.onTeamMemberAdd(option);
        } /*else if (menu.equals("member/list")) {
            this.onMemberList();
        } else if (menu.equals("member/view")) {
            this.onMemberView(option);                
        } else if (menu.equals("member/update")) {
            this.onMemberUpdate(option);                
        } else if (menu.equals("member/delete")) {
            this.onMemberDelete(option);                
        } */else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }
    
    int getTeamIndex(String name) {
        Team[] list = teamDao.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            if (name.equals(list[i].name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
    
    public void onTeamMemberAdd(String name) {
        System.out.println("[팀 멤버 추가하기]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        Team team = teamDao.get(this.getTeamIndex(name));
        
        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            System.out.printf("팀명:", team.name);
            System.out.print("추가할 멤버의 아이디는? ");
            
        }

    }
}
