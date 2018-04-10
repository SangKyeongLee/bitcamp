package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;

@Component("calc")
public class CalcController implements Controller{
    Scanner keyScan;
    
    public CalcController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("calc")) {
            System.out.print("식을 입력하세요? ");
            String[] arr = keyScan.nextLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int result = 0;
            
            switch(arr[1]) {
            case "+" : result = a + b; break;
            case "-" : result = a - b; break;
            case "*" : result = a * b; break;
            case "/" : result = a / b; break;
            default  :
                System.out.printf("%s 연산은 지원하지 않습니다.", arr[1]);
                return;
            }
            
            System.out.printf("%d %s %d = %d\n", arr[0], arr[1], arr[2], result);
            
            
        }
    }
    
}
