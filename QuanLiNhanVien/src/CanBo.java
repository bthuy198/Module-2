import java.util.Scanner;

public class CanBo {
    Scanner scn = new Scanner(System.in);
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin(){
        System.out.println("Nhập thông tin");
        System.out.println("Họ tên");
        this.hoTen = scn.nextLine();
        System.out.println("Ngày sinh");
        this.ngaySinh = scn.nextLine();
        System.out.println("Giới tính");
        this.gioiTinh = scn.nextLine();
        System.out.println("Địa chỉ");
        this.diaChi = scn.nextLine();
    }

    public void hienThiThongTin() {
        System.out.print("Họ tên: " + hoTen + ", ngày sinh: " + ngaySinh + ", giới tính: " + gioiTinh + ", địa chỉ: " + diaChi);
    }
}
