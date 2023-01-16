public class CongNhan extends CanBo{
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        this.bac = scn.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println(", bậc: " + bac);

    }
}
