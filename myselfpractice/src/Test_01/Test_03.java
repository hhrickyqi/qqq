package Test_01;

import java.util.ArrayList;
import java.util.List;

public class Test_03 {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("张三", 15, 95, "三年三班"));
        s.add(new Student("李四", 14, 90, "三年三班"));
        s.add(new Student("王五", 16, 88, "三年五班"));
        s.add(new Student("熊二", 16, 83, "三年五班"));
        s.add(new Student("熊大", 16, 94, "三年五班"));
        double total5 = 0.0d;
        double total3 = 0.0d;
        int p5 = 0;
        int p3 = 0;
        int totalAge = 0;
        for (int i = 0; i < s.size(); i++) {
            totalAge += s.get(i).getAge();
            if (s.get(i).getClassName().equals("三年三班")) {
                p3++;
                total3 += s.get(i).getScore();
            }
            if (s.get(i).getClassName().equals("三年五班")) {
                p5++;
                total5 += s.get(i).getScore();
            }
        }
        System.out.println("三班平均分:" + total3 / p3 + "\n五班平均分:" + total5 / p5);
        System.out.println("平均年龄:" + (totalAge == 0 ? 0 : totalAge / s.size()));
    }
}

class Student {
    private String name;
    private int age;
    private int score;
    private String className;

    public Student(String name, int age, int score, String className) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", className='" + className + '\'' +
                '}';
    }
}