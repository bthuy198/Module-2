package hrmanagement;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        System.out.println("Menu");
        System.out.println("1. Nhập vào N sinh viên");
        System.out.println("2. Hiển thị thông tin tất cả sinh viên");
        System.out.println("3. Hiển thị sinh viên có điểm trung bình cao nhất, thấp nhất");
        System.out.println("4. Tìm kiếm sinh viên");
        System.out.println("5. Hiển thị sinh viên theo thứ tự abc");
        System.out.println("6. Hiển thị sinh vien được học bổng, sắp xếp theo thứ t điểm cao xuống thấp");
        System.out.println("7. Thoát");
    }

    public static Student[] inputStudent(int numberStudent) {
        Student[] students = new Student[numberStudent];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].inputInfo();
        }
        return students;
    }

    public static void showStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public void findMinMaxOfMark(Student[] students) {
        Student minStudent = new Student();
        Student maxStudent = new Student();
        double min = students[0].getMark();
        double max = students[0].getMark();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() < min) {
                minStudent = students[i];
            }
            if (students[i].getMark() > max) {
                maxStudent = students[i];
            }
        }
        System.out.println("Sinh viên có điểm trung bình cao nhất: ");
        System.out.println(maxStudent);
        System.out.println("Sinh viên có điểm trung bình thấp nhất: ");
        System.out.println(minStudent);
    }

    public void findStudentByName(Student[] students, String name) {
//        Student[] result = new Student[];
        name = name.toLowerCase().trim();
        int result = 0;
        int[] found = new int[result];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().toLowerCase().compareTo(name) == 0) {
                result++;
                found[found.length - 1] = i;
            }
        }
        if (found.length == 0) {
            System.out.println("Không tồn tại sinh viên này");
        } else {
            System.out.println("Danh sách sinh viên có tên là " + name);
            for (int i = 0; i < found.length; i++) {
                System.out.println(found[i]);
            }
        }

    }

    public void sortStudent(Student[] students) {
        String[] studentNames = new String[students.length];
        Arrays.sort(studentNames);
        for (int i = 0; i < studentNames.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (studentNames[i].compareTo(students[j].getName()) == 0) {
                    System.out.println(students[j]);
                }
            }
        }
    }

    public void getScholarship(Student[] students){

    }
}
