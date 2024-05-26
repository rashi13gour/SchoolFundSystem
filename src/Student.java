// contains all detaild of a student
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int feeTotal;

    //to add a new student this will be called
    public Student (int id, String name, int grade){
        this.id= id;
        this.name = name;
        this.grade =grade;
        this.feePaid = 0;
        this.feeTotal = 11000;
    }

    public int getId (){
        return id;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public void payFee(int fee){
        int totalFee =0;
        totalFee += fee;
        School.updateTotalProfit(totalFee);
    }

}
