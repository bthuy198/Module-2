import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StudentManager studentList = new StudentManager();
        showMenu();
        int choice;
        do {
            System.out.println("VUi lòng chọn chức năng ");
            choice = scn.nextInt();
            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.enterInfo();
                    studentList.add(newStudent);
                    break;
                case 2:
                    studentList.printList();
                    break;
                case 3:
                    studentList.isEmpty();
                    break;
                case 4:
                    System.out.println(studentList.getSize());
                    break;
                case 5:
                    studentList.removeAll(result);
                    break;
                case 6:
                    System.out.println("Nhập tên sinh viên cần tìm kiếm");
                    String name = scn.nextLine();
                    studentList.searchName(name);
//                    ArrayList<Student> result = studentList.searchById(name);
//                    if(result.size() == 0){
//                        System.out.println("Không tồn tại");
//                    } else showList(result);
//                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên cần xóa");
                    String id = scn.nextLine();
                    ArrayList<Student> result = studentList.searchById(id);
                    System.out.println("----Danh sách sau khi xóa----");
                    studentList.removeAll(result);
                    studentList.printList();
                    break;
                case 8:
                    System.out.println("Nhập mã sinh viên cần tìm kiếm");
                    String searchId = scn.nextLine();
                    studentList.searchById(searchId);
                    break;
                case 9:
                    System.out.println("----Danh sách sinh viên có điểm từ cao đến thấp----");
                    studentList.sortByMarkLowToHigh();
                    studentList.printList();
                    break;
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("Hãy lựa chọn thao tác");
        System.out.println("1. In ra danh sách sinh viên trên màn hình");
        System.out.println("2. In danh sách sinh viên ra màn hình");
        System.out.println("3. Kiểm tra danh sách có rỗng hay không.");
        System.out.println("4. Lấy số lượng sinh viên trong danh sách");
        System.out.println("5. Làm rỗng danh sách sinh viên");
        System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa vào tên");
        System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa vào mã sinh viên");
        System.out.println("8. Tìm kiếm tất cả sinh viên dựa vào mã sinh viên được nhập từ bàn phím");
        System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp");
        System.out.println("10. Thoát khỏi chương trình");
    }

    public static void showList(ArrayList<Student> list){
        for(Student student : list){
            System.out.println(student);
        }
    }
}