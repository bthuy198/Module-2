import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public StudentManager(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public void printList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public boolean isEmpty() {
        return studentList.isEmpty();
    }

    public int getSize() {
        return studentList.size();
    }

    public boolean removeAll(ArrayList<Student> result) {
        return studentList.removeAll(studentList);
    }

    public boolean contains(String id) {
        boolean result = false;
        for (Student student : studentList) {
            if (student.compareTo(id) == 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    public ArrayList<Student> searchById(String id) {
        ArrayList<Student> searchById;
        searchById = (ArrayList<Student>) this.studentList.stream().filter(student -> student.getName().contains(id)).collect(Collectors.toList());
        return searchById;
    }

    public void searchById(String id) {
        for (Student student : studentList) {
            if (student.getStudentId().indexOf(id) >= 0) {
                System.out.println(student);
            }
        }
    }

    public void sortByMarkLowToHigh() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAverageMark() < o2.getAverageMark()) {
                    return 1;
                } else if (o1.getAverageMark() < o2.getAverageMark()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

}
