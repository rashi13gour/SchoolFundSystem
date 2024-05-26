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
        this.feeTotal = 110000;
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
    public void setFeePaid(int feePaid){
        this.feePaid = feePaid;
    }
    public void payFee(int fee){
        int totalFee =0;
        totalFee += fee;
        feePaid = totalFee;
        School.updateTotalProfit(totalFee);
    }
    public int getRemainingFees(){
        return feeTotal - feePaid;
    }
    @Override
    public String toString() {
        return "Student's name is "+this.name + " ,Total fees paid by student is RS. " + this.feePaid ;
    }

}
