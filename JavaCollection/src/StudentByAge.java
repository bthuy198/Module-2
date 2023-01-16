import java.util.*;

public class StudentByAge {
    public static void main(String[] args) {
        //tạo ra một HashMap lưu tên, tuổi của mỗi sinh viên
        Map<String, Integer> studentMap = new TreeMap<>();
        studentMap.put("Tom", 18);
        studentMap.put("John", 20);
        studentMap.put("Anna", 22);
        studentMap.put("Levis", 19);
        studentMap.put("Smith", 21);
        System.out.println("Display student map");
        Set<String> students = studentMap.keySet();
        for(String student : students){
            System.out.println("Name: " + student + ", " + "age : " + studentMap.get(student));
        }
        //tạo ra một TreeMap hiển thị toàn bộ key theo thứ tự giảm/tăng (TreeMap sắp xếp theo key)
        Map<String, Integer> studentTreeMap = new TreeMap<>(studentMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(studentTreeMap);
        //chương trình tạo ra một LinkedHashMap để lưu danh sách tương tự như HashMap và hiển thị dữ liệu.
        Map<String, Integer> linkedStudentMap = new LinkedHashMap<>(studentMap);
        linkedStudentMap.put("Tom", 18);
        linkedStudentMap.put("John", 20);
        linkedStudentMap.put("Anna", 22);
        linkedStudentMap.put("Levis", 19);
        linkedStudentMap.put("Smith", 21);
        System.out.println("\nThe age for " + "Anna is " + linkedStudentMap.get("Anna"));
    }
}
