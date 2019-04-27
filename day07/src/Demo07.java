import java.util.*;

public class Demo07 {
    public static void main(String[] args) {
        Map<Student1,Location> map = new HashMap<>();
        Student1 student1 = new Student1("tom",13);
        Student1 student2 = new Student1("bob",12);
        Student1 student3 = new Student1("ricky",11);
        Student1 student4 = new Student1("tom",13);
        Location location1 = new Location("location1");
        Location location2 = new Location("location2");
        Location location3 = new Location("location3");
        map.put(student1,location1);
        map.put(student2,location1);
        map.put(student3,location2);
        map.put(student4,location3);
        Set<Map.Entry<Student1, Location>> entries = map.entrySet();
        Iterator<Map.Entry<Student1, Location>> iterator = entries.iterator();//entries.iterator().var

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }//

        //entries.forEach(s -> System.out.println(s));
    }
}
class Location{
    private String location;
    public Location(){}
    public Location(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location='" + location + '\'' +
                '}';
    }
}
class Student1{
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}