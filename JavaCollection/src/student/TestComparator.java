package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestComparator {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 12, "Huế");
        Student student2 = new Student("John", 12, "ĐN");
        Student student3 = new Student("Ford", 9, "Huế");
        Student student4 = new Student("Levis", 13, "Huế");
        Student student5 = new Student("Anna", 14, "Huế");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //sử dụng comparator
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("Sort by age: ");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        // sử dụng comparing()
        System.out.println("---------sort by name---------");
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        Collections.sort(studentList, byName);
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        // sort 2 điều kiện
        System.out.println("---------sort by age, name---------");
        Comparator<Student> byAge = Comparator.comparing(Student::getAge);
        Collections.sort(studentList, byAge.thenComparing(byName));
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        // sử dụng stream() và filter()
        System.out.println("-------student over 10 ages --------");
        List<Student> over10 = studentList.stream().filter(student -> student.getAge() >= 10).collect(Collectors.toList());
        for (Student studentOver10 : over10) {
            System.out.println(studentOver10.toString());
        }
    }
}
