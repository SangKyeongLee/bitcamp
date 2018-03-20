package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Write;
import java.util.Scanner;

public class Board {
    static Scanner keyScan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("[게시판 프로그램]");
        System.out.println("[도움말:help]");
        Write writes[] = new Write[100];
        int BoardIndex = 0;
        
        while(true) {
            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().split(" ");
            String command = arr[0];
            String option = null;
            if(arr.length == 2) {
                option = arr[1];
            }
            
            
            if(command.equals("quit")) {
                System.out.println("종료합니다.");
                break;
            } else if(command.equals("help")) {
                System.out.println("[도움말]");
                System.out.println("도움말 : help");
                System.out.println("종료하기 : quit");
                System.out.println("게시판 등록 : board/add");
                System.out.println("게시판 목록 : board/list");
                System.out.println("게시판 검색 : board/view");
                System.out.println("게시판 변경 : board/update");
                System.out.println("게시판 삭제 : board/delete");
            } else if(command.equals("board/add")) {
                Write write  = new Write();
                
                System.out.print("제목? ");
                write.title = keyScan.nextLine();
                System.out.print("내용? ");
                write.contents = keyScan.nextLine();
                System.out.print("등록일? ");
                write.date = keyScan.nextLine();
                
                writes[BoardIndex++] = write;
            } else if(command.equals("board/list")) {
                System.out.println("[게시판 목록]");
                for(int i = 0; i < BoardIndex; i++) {
                    System.out.printf("%d, %s, %s\n", i, writes[i].title, writes[i].date );
                }
            } else if(command.equals("board/view")) {
                Write wirte;
                for(int i = 0; i < BoardIndex; i++) {
                    if(option.equals(i)) {
                        
                    }
                }
                System.out.printf("제목: %s", write.title);
                System.out.printf("내용: %s", write.contents);
                System.out.printf("등록일: %s", write.date);
                
            }
        }
    }

}
