public class Demo03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = s1;
        s2.setName("rr");
        System.out.println(s1.getName());
        try{
            Student s3 = (Student) s1.clone();
            s3.setName("gg");
            System.out.println(s1.getName());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
class Student implements Cloneable{
    private int age;
    private String name;
    public Student(){}
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override//！！！！！！！！！！！！！！！！！
    protected Object clone() throws CloneNotSupportedException {//！！！！！！！
        return super.clone();//！！！！！！！！！！！
    }//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!必须在类中重写clone的受保护方法，不然clone受保护无法使用

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}