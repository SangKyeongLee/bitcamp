// 객체 자동 생성 - @Component 애노테이션
package bitcamp.java106.step09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam03 {
    
    public static void main(String[] args) {
        // <context:annotation-config/> 태그 생략하기
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step09/application-context-03.xml");
        
        BeanUtils.printBeanNames(iocContainer);
    }
}
