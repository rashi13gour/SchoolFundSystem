import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Jenny", 6000);
        Teacher t2 = new Teacher(2, "Mala", 5000);
        Teacher t3 = new Teacher(3, "Ben", 4000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1 = new Student(1,"Ram",50);
        Student s2 = new Student(2,"Sham",90);
        Student s3 = new Student(3,"Sky",98);
        Student s4 = new Student(4,"Mona",83);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        School dav = new School(studentList, teacherList);
        s1.payFee(60000);
        s2.payFee(65000);
        s3.payFee(90000);
        System.out.println("School has earned Rs. " + dav.getTotalProfit());
        t1.recievedSalary(t1.getSalary());
        System.out.println(t1.getName()+ " earned salary RS. "+ t1.getSalary()+ " and School is left with Rs. "+ dav.getTotalProfit());
        System.out.println(s2);
    }
}