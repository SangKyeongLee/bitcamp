// AOP(Aspect-Oriented Programming) - 애노테이션으로 AOP 설정하기
package bitcamp.java106.step13.ex06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext iocContainer =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        String[] names = iocContainer.getBeanDefinitionNames();
        System.out.println("-------------------------------------------------");
        for (String name : names) {
            System.out.println(iocContainer.getBean(name).getClass().getName());
        }
        System.out.println("-------------------------------------------------");
        
        try {
        Caller caller = (Caller) iocContainer.getBean(Caller.class);
        caller.test();
        } catch (Exception e) {
            System.err.println("오류 발생!");
        }
    }

}
