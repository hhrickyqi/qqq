import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 15, 95, "三年三班"));
        list.add(new Student("李四", 14, 90, "三年三班"));
        list.add(new Student("王五", 16, 88, "三年五班"));
        list.add(new Student("熊二", 16, 83, "三年五班"));
        list.add(new Student("熊大", 16, 94, "三年五班"));
        double total5 = 0.0d;
        double total3 = 0.0d;
        int p5 = 0;
        int p3 = 0;
        int totalAge = 0;
        for (int i = 0;i < list.size();i++){
            totalAge += list.get(i).getAge();
            if (list.get(i).getClassName().equals("三年五班")){
                total5 += list.get(i).getScore();
                p5++;
            }
            if (list.get(i).getClassName().equals("三年三班")){
                total3 += list.get(i).getScore();
                p3++;
            }
        }
        System.out.println("五班：" + total5 / p5 + "\n" + "三班：" + total3 / p3);
        System.out.println("\n平均年龄:" + (totalAge ==0 ? 0 : totalAge/ list.size()));


    }
}
class Student{
    private String name;
    private int age;
    private double score;
    private String className;

    public Student(String name, int age, double score, String className) {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
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