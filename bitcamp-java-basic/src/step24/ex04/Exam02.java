package step24.ex04;

public class Exam02 {
    
    public static void main(String[] args) throws Exception {
        System.out.println("스레드 실행 전");
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        };
        t.start();
        
        t.join();
        System.out.println("스레드 실행 후");
        
        t.start(); // 종료된 스레드는 다시 running 할 수 없다.
    }
    
}
