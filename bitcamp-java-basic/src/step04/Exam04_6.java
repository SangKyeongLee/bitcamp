// 비트 이동 연산자 : 응용 III
package step04;

public class Exam04_6{
    public static void main(String[] args){
        // 다음 변수의 값을 조사하여 개발자가 
        // 어떤 프로그래밍 언어를 사용할 수 있는 지 출력하라!
        // => 각 비트의 해당하는 프로그래밍 언어는 다음 순서를 따른다.
        // c, cpp, java, js, python, php, html, css
        int lang = 0b1110_0011;
        // 0x
        // lang 변수에 들어 있는 각 비트값을 조사하여
        // 1이면 그 변수에 해당하는 프로그래밍 이름을 출력한다.
        // => if 조건문, &, == 연산자를 활용하라!
        // 실행 결과
        // c cpp java html css
        
        // 여기에 코드를 작성!
        // System.out.println(lang & 0b1000_0000);
        if((lang & 0x80) == 0x80) { System.out.print("c ");}
        if((lang & 0x40) == 0x40) { System.out.print("cpp ");}
        if((lang & 0x20) == 0x20) { System.out.print("java ");}
        if((lang & 0x10) == 0x10) { System.out.print("js ");}
        if((lang & 0x08) == 0x08) { System.out.print("python ");}
        if((lang & 0x04) == 0x04) { System.out.print("php ");}
        if((lang & 0x02) == 0x02) { System.out.print("html ");}
        if((lang & 0x01) == 0x01) { System.out.print("css ");}

    }
}
