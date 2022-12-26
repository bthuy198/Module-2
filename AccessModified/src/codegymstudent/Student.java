package codegymstudent;

public class Student {
    private int rollno;
    private String name;
    public static int roll;
    private static String college = "BBDIT";

    Student(String name) {
        this.rollno = ++roll;
        this.name = name;
    }
    static void change(){
        college = "codegym";
    }

    void display(){
        System.out.println(rollno + ". " + name + ", college: " + college);
    }
}
class TestStaticMethod{
    public static void main(String[] args) {
        Student.change();
        Student std1 = new Student("John");
        Student std2 = new Student("Ford");
        Student std3 = new Student("Tom");
        std1.display();
        std2.display();
        std3.display();
    }
}
