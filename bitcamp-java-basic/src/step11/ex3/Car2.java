// 기존의 Car 클래스를 복사해서  새 클래스를 만든 후에 코드를 추가했다.
package step11.ex3;

public class Car2 {
    String model;
    String maker;
    int capacity;
    boolean sunroof;
    boolean auto;
    
    public Car2() {}
    
    // 이전 프로그램(ex1.Exam01)에서 다음 생성자를 사용하기 때문에
    // 이 생성자에 파라미터를 덧붙일 수는 없다.
    public Car2(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
    }
    
    public Car2(String model, String maker, int capacity,
            boolean sunroof, boolean auto) {
        // 이 클래스의 다른 생성자를 먼저 호출할 수 있다.
        // => 이때 this()를 사용한다.
        this(model, maker, capacity);
        
        this.sunroof = sunroof;
        this.auto = auto;
    }
}
