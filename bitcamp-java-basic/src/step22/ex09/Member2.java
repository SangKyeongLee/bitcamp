package step22.ex09;

public class Member2 implements java.io.Serializable {
    public String name;
    public int age;
    public boolean gender; // true(여자), false(남자)
    
    // Exam02_4.java를 실행하기 전에 다음 변수를 추가하고, toString()을 개정하라!
    public String tel;
    
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "tel=" + tel + "]";
    }
}
