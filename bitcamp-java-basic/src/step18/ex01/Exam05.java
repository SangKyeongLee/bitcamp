// Reflection API : 클래스 로딩과 인스턴스 생성
package step18.ex01;

import java.io.File;

import step08.Exam06_5.A;

public class Exam05 {
    
    static class A {
        void m() {
            System.out.println("Hello!");
        }
        
        static {
            System.out.println("A 클래스 로딩!");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("step18.ex01.Exam05$A");
        
        // 타입(클래스) 정보만 있다면 인스턴스를 생성할 수 있다.
        A obj = (A)clazz.newInstance();
        obj.m();
    }
}












