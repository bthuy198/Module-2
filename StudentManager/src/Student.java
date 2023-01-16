import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    Scanner scanner = new Scanner(System.in);
    private String studentId;
    private String name;
    private int year;
    private float averageMark;

    public Student() {
    }

    public Student(String studentId, String name, int year, float averageMark) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
        this.averageMark = averageMark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student: id = " + studentId + ", họ tên: " + name + ", nawm sinh: " + year + ", ĐTB: " + averageMark;
    }

    public void enterInfo(){
        System.out.println("Nhập mã sinh viên");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập họ tên");
        this.name = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        this.year = scanner.nextInt();
        System.out.println("Nhập điểm trung bình");
        this.averageMark = scanner.nextFloat();
    }

    public int compareTo(String otherStudentId) {
        return this.studentId.compareTo(otherStudentId);
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.getStudentId());
    }
}
