public class Test06 {
    public static void main(String[] args) {
        Student st1 = new Student(1, 15, "小明");
        Student st2 = new Student(1, 15, "小明");
        if (equals(st1, st2)) {
            System.out.println("相等");
        } else {
            System.out.println("不等");
        }
    }

    public static boolean equals(Object o, Student s) {
        if (o instanceof Student) {
            if (s.getId() != ((Student) o).getId()) {
                return false;
            } else if (s.getAge() != ((Student) o).getAge()) {
                return false;
            } else if (!s.getName().equals(((Student) o).getName())) {
                return false;
            } else {
                return true;
            }

        }
        return false;
    }
}

class Student {
    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
