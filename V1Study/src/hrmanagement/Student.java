package hrmanagement;

import java.util.Scanner;

public class Student extends Person{
    Scanner scn = new Scanner(System.in);
    private String studentId;
    private double mark;
    private String email;

    public Student() {
    }

    public Student(String studentId, double mark, String email) {
        this.studentId = studentId;
        this.mark = mark;
        this.email = email;
    }

    public Student(String name, boolean gender, String birth, String address, String studentId, double mark, String email) {
        super(name, gender, birth, address);
        this.studentId = studentId;
        this.mark = mark;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        this.studentId = scn.nextLine();
        this.mark = scn.nextDouble();
        this.email = scn.nextLine();
    }


    @Override
    public String showInfo() {
        String genders = super.isGender() == false ? "nữ" : "nam";
        return String.format("Student %s: %s, %s, %0.0f, %s", super.getName(), genders, mark, email);
    }

    public boolean hasScholarship(){
        if(mark > 8.0){
            return true;
        } else return false;
    }
}
