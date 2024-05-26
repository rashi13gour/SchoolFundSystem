import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private static int totalProfit;
    private static int totalMoneySpent;

    public School (List<Student> students, List<Teacher> teachers){
        this.students=students;
        this.teachers = teachers;
        this.totalProfit =0;
        this.totalMoneySpent= 0;
    }

    public List<Student> getStudents(){
        return  students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Teacher> getTeachers(){
        return  teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public int getTotalProfit(){
        return totalProfit;
    }
    public static void updateTotalProfit(int moneyEarned){
        totalProfit+=moneyEarned;
    }
    public int getTotalMoneySpent(){
        return  totalMoneySpent;
    }
    public static void updateTotalMoneySpent(int moneySpent){
        totalProfit -= moneySpent;
    }
}
