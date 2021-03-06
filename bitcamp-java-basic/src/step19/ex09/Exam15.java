// IoC 컨테이너 만들기 - 애노테이션을 사용하여 객체의 이름 지정하기 
package step19.ex09;

import java.io.File;
import java.util.List;

import step19.ex06.ApplicationContext7;

public class Exam15 {
    public Exam15() {
        System.out.println("===> Exam15()");
    }
    
    public static void main(String[] args) throws Exception {
        ApplicationContext10 iocContainer = new ApplicationContext10("step19.ex09");
        Car car = (Car) iocContainer.getBean("car");
        car.move();
    }
}

// DI는 IoC의 한 예이다.
//
// IoC(Inversion of Control)?
// => 제어의 역행.
// => 일반적인 흐름에서 벗어난 동작을 말한다.
// => 예:
//    1) Dependancy Injection(DI)
//       => 자신이 사용할 의존 객체를 자신이 만들지 않고 외부에서 주입 받는 것.
//    2) Event
//       => 실행 순서에 상관없이 특정 사건이 발생하면 지정된 코드가 실행되는 것.





