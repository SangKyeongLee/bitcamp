package step22.ex06;

public class Member {
    public String name;
    public int age;
    public boolean gender; // true(여자), false(남자)
    
    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}
