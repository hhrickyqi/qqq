import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo06 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Collections.addAll(list,new Student("cx",10),new Student("zx",20));
        Teacher t = new Teacher();


    }
}
class Teacher{
    private String name;
    private int no;
    private int age;
    private List<Student> students;

    public Teacher(List<Student> list) {
        this.students = list;
    }

    public Teacher(){}
    public Teacher(String name, int no, int age) {
        this.name = name;
        this.no = no;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getList() {
        return students;
    }

    public void setList(List<Student> list) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", age=" + age + "Student" + students +
                '}';
    }
}
class Student{
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}