package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.TaskDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.domain.Team;

public class TaskController {
    Scanner keyScan;
    TeamDao teamDao;
    TaskDao taskDao;
    
    public TaskController(Scanner scanner, TeamDao teamDao, TaskDao taskDao) {
        this.keyScan = scanner;
        this.teamDao = teamDao;
        this.taskDao = taskDao;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("task/add")) {
            this.onTaskAdd(option);
        } else if (menu.equals("task/list")) {
            //this.onTeamMemberList(option);
        } else if (menu.equals("task/view")) {
            //this.onTeamMemberDelete(option);
        } else if (menu.equals("task/update")) {
            //this.onTeamMemberDelete(option);
        } else if (menu.equals("task/delete")) {
            //this.onTeamMemberDelete(option);
        } else if (menu.equals("task/state")) {
            //this.onTeamMemberDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    void onTaskAdd(String teamName) {
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        Team team = teamDao.get(teamName);
        if (team == null) {
            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
            return;
        }
        
        Task task = new Task(team);
        System.out.println("[팀 작업 추가]");
        System.out.print("작업명? ");
        task.setTitle(keyScan.nextLine());
        
        System.out.print("시작일? ");
        task.setStartDate(Date.valueOf(keyScan.nextLine()));
        
        System.out.print("종료일? ");
        task.setEndDate(Date.valueOf(keyScan.nextLine()));
        
        System.out.print("작업자? ");
        String memberId = keyScan.nextLine();
        Member member = team.getMember(memberId);
        task.setWorker(member);
        
    }

//    void onTeamMemberList(String teamName) {
//        if (teamName == null) {
//            System.out.println("팀명을 입력하시기 바랍니다.");
//            return; 
//        }
//        
//        Team team = teamDao.get(teamName);
//        if (team == null) {
//            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
//            return;
//        }
//
//        System.out.println("[팀 멤버 목록]");
//        System.out.print("회원들: ");
//        for (int i = 0; i < team.members.length; i++) {
//            if (team.members[i] == null) continue;
//            System.out.printf("%s, ", team.members[i].id);
//        }
//        System.out.println();
//    }
//
//    void onTeamMemberDelete(String teamName) {
//        if (teamName == null) {
//            System.out.println("팀명을 입력하시기 바랍니다.");
//            return; 
//        }
//        
//        Team team = teamDao.get(teamName);
//        if (team == null) {
//            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
//            return;
//        }
//        
//        System.out.print("삭제할 팀원은? ");
//        String memberId = keyScan.nextLine();
//        
//        if (!team.isExist(memberId)) {
//            System.out.println("이 팀의 회원이 아닙니다.");
//            return;
//        }
//
//        team.deleteMember(memberId);
//        
//        System.out.println("[팀 멤버 삭제]");
//        System.out.println("삭제하였습니다.");
//    }
}
