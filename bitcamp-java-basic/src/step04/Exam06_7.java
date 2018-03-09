// 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 I
package step04;

public class Exam06_7{
    public static void main(String[] args){
        int i = 2;
        i = ++i;
        // 1) i = i + 1 => i = 3이다.
        // 2) i = 1 => i는 이미 3인데 또 3을 저장한다. 부질없는 짓! 
  
        System.out.println(i);
    }
}
