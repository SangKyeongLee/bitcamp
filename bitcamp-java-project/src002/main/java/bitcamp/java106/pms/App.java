package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Board;
import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("[게시판 프로그램]");
        System.out.println("[도움말:help]");
        Board boards[] = new Board[100];
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
                Board board  = new Board();
                
                System.out.print("제목? ");
                board.title = keyScan.nextLine();
                System.out.print("내용? ");
                board.content = keyScan.nextLine();
                System.out.print("등록일? ");
                board.date = keyScan.nextLine();
                
                boards[BoardIndex++] = board;
            } else if(command.equals("board/list")) {
                System.out.println("[게시판 목록]");
                for(int i = 0; i < BoardIndex; i++) {
                    System.out.printf("%d, %s, %s\n", i, boards[i].title, boards[i].date );
                }
            } else if(command.equals("board/view")) {
                if (option == null) {
                    System.out.println("게시판 번호를 입력해주세요.");
                    continue;
                }
                
                Board board = null;
                for(int i = 0; i < BoardIndex; i++) {
                    if(Integer.parseInt(option) == i) {
                        board = boards[i];
                        break;
                    }
                }
                
                if (board == null) {
                    System.out.println("해당 번호의 게시물이 없습니다.");
                } else {
                System.out.printf("제목: %s\n", board.title);
                System.out.printf("내용: %s\n", board.content);
                System.out.printf("등록일: %s\n", board.date);
                }
            } else if (command.equals("board/update")) {
                if (option == null) {
                    System.out.println("게시판 번호를 입력해주세요.");
                    continue;
                }
                
                Board board = null;
                int i;
                for(i = 0; i < BoardIndex; i++) {
                    if(Integer.parseInt(option) == i) {
                        board = boards[i];
                        break;
                    }
                }
                
                if (board == null) {
                    System.out.println("해당 번호의 게시물이 없습니다.");
                } else {
                    board  = boards[i];
                    Board newboard = new Board();
                    System.out.printf("제목(%s)? ", board.title);
                    newboard.title = keyScan.nextLine();
                    System.out.printf("내용(%s)? ", board.content);
                    newboard.content = keyScan.nextLine();
                    System.out.printf("등록일(%s)? ", board.date);
                    newboard.date = keyScan.nextLine();
                    
                    boards[i] = newboard;
                    System.out.println("변경이 완료 되었습니다.");
                }
            } else if (command.equals("board/delete")) {
                
            }
        }
    }

}
