// IoC 컨테이너 만들기 - 4) 파일 경로 대신 패키지 이름을 포함한 클래스 일름을 추출한다.
package step19.ex04;

import java.io.File;
import java.util.List;

// => FileFilter를 사용하여 .class 파일만 추출한다. 
public class Exam07 {

    public static void main(String[] args) throws Exception {
        ApplicationContext5 appContext = new ApplicationContext5("step19.ex01");
        List<String> classnames = appContext.getClassname();
        for (String name : classnames) {
            System.out.println(name);
        }
    }
    
    

}





