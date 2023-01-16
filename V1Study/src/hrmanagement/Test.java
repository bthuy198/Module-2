package hrmanagement;

public class Test {
    public static void main(String[] args) {
        Person ps1 = new Person();
        System.out.println("Nhập thông tin bản thân (tên, giới tính, ngày sinh, địa chỉ)");
        ps1.inputInfo();
        System.out.println(ps1.showInfo());
    }
}
