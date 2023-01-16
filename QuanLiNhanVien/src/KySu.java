public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        this.nganhDaoTao = scn.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println(", ngành đào tạo: " + nganhDaoTao);
    }
}
