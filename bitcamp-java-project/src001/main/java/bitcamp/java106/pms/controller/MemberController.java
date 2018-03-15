package bitcamp.java106.pms.controller;

import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

public class MemberController {
    public static Scanner keyScan;

    static Member[] members = new Member[1000];
    static int memberIndex = 0;

    static int getMemberIndex(String id) {
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            if (id.equals(members[i].id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public static void onMemberAdd() {
        System.out.println("[회원 정보 입력]");
        Member member = new Member();
        
        System.out.print("아이디? ");
        member.id = keyScan.nextLine();

        System.out.print("이메일? ");
        member.email = keyScan.nextLine();

        System.out.print("암호? ");
        member.password = keyScan.nextLine();

        // 회원 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        members[memberIndex++] = member;
    }

    public static void onMemberList() {
        System.out.println("[회원 목록]");
        for (int i = 0; i < memberIndex; i++) {
            if (members[i] == null) continue;
            System.out.printf("%s, %s, %s\n", 
                members[i].id, members[i].email, members[i].password);
        }
    }

    public static void onMemberView(String id) {
        System.out.println("[회원 정보 조회]");
        if (id == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            System.out.println();
            return;
        }
        
        int i = getMemberIndex(id);

        if (i == -1) {
            System.out.println("해당 아이디의 회원이 없습니다.");
        } else {
            Member member = members[i];
            System.out.printf("아이디: %s\n", member.id);
            System.out.printf("이메일: %s\n", member.email);
            System.out.printf("암호: %s\n", member.password);
        }
    }

    public static void onMemberUpdate(String id) {
        System.out.println("[회원 정보 변경]");
        if (id == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            System.out.println();
            return;
        }
        
        int i = getMemberIndex(id);

        if (i == -1) {
            System.out.println("해당 아이디의 회원이 없습니다.");
        } else {
            Member member = members[i];
            Member updateMember = new Member();
            System.out.printf("아이디(%s)?", member.id);
            updateMember.id = keyScan.nextLine();
            System.out.printf("이메일(%s)?", member.email);
            updateMember.email = keyScan.nextLine();
            System.out.printf("새암호?");
            updateMember.password = keyScan.nextLine();

            members[i] = updateMember;

            System.out.println("회원 정보 변경이 완료되었습니다.");

        }
    }

    public static void onMemberDelete(String id) {
        System.out.println("[회원 정보 삭제]");
        if (id == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            System.out.println();
            return;
        }
        
        int i = getMemberIndex(id);
                
        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Member member = members[i];
            System.out.printf("%s를 정말로 삭제하시겠습니까?(y/N) ", member.id);
            String yes = keyScan.nextLine().toLowerCase();
            if(yes.equals("y")) {
                System.out.println("팀 정보가 삭제되었습니다.");
                members[i] = null;
            } else {
                System.out.println("삭제가 취소되었습니다.");
            }
            
        }
    }

}