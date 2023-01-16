import java.util.Scanner;

public class QuanLiCanBo {
    Scanner scn = new Scanner(System.in);
    private CanBo[] listCanBo;

    public QuanLiCanBo() {
    }

    public void CanBo() {
        listCanBo = new CanBo[5];
        listCanBo[0] = new CongNhan("ABC", "1-1-1990", "nữ", "Huế", "3/7");
        listCanBo[1] = new CongNhan("BCD", "1-1-2000", "nam", "Huế", "7/7");
        listCanBo[2] = new NhanVien("T", "2-1-1995", "nữ", "HCM", "Phục vụ");
        listCanBo[3] = new KySu("B", "3-5-1999", "nữ", "ĐN", "IT");
        listCanBo[4] = new KySu("B", "3-5-2000", "nam", "ĐN", "IT");

        System.out.println("Lựa chọn thêm mới nhân viên");
        System.out.println("1. Cán bộ");
        System.out.println("2. Công nhân");
        System.out.println("3. Nhân viên");
        System.out.println("4. Kỹ sư");
        int choice = scn.nextInt();
        CanBo nhanVienMoi = null;
        switch (choice) {
            case 1: {
                nhanVienMoi = new CanBo();
                break;
            }
            case 2: {
                nhanVienMoi = new CongNhan();
                break;
            }
            case 3: {
                nhanVienMoi = new NhanVien();
                break;
            }
            case 4: {
                nhanVienMoi = new KySu();
                break;
            }
            default:
                break;
        }
        nhanVienMoi.nhapThongTin();
        CanBo[] newCanBo = new CanBo[listCanBo.length + 1];
        for (int i = 0; i < newCanBo.length; i++) {
            if (i == newCanBo.length - 1) {
                newCanBo[i] = nhanVienMoi;
            } else {
                newCanBo[i] = listCanBo[i];
            }
        }
        listCanBo = newCanBo;

    }

    public void hienThiCanBo() {
        for (int i = 0; i < listCanBo.length; i++) {
            listCanBo[i].hienThiThongTin();
        }
    }

    public int[] timKiemTheoTen(String ten) {
        int count = 0;
        int[] ketQuaTimKiem = new int[listCanBo.length];
        ten = ten.toLowerCase().trim();
        for (int i = 0; i < listCanBo.length; i++) {
            String name = listCanBo[i].getHoTen().toLowerCase();
            if (name.equals(ten)) {
                ketQuaTimKiem[count] = i;
                count++;
            }
        }
        return ketQuaTimKiem;
    }

    public int demKqTimKiemTheoTen(String ten) {
        int count = 0;
        ten = ten.toLowerCase().trim();
        for (int i = 0; i < listCanBo.length; i++) {
            String name = listCanBo[i].getHoTen().toLowerCase();
            if (name.equals(ten)) {
                count++;
            }
        }
        return count;
    }

    public void hienThiKetQuaTimKiem(int[] ketQuaTimKiem, int count) {
        System.out.println();
        System.out.println("----Kết quả tìm kiếm----");
        for (int i = 0; i < count; i++) {
            int position = ketQuaTimKiem[i];
            for (int j = 0; j < listCanBo.length; j++) {
                if (position == j) {
                    listCanBo[j].hienThiThongTin();
                }
            }
        }
    }

    public static void main(String[] args) {
        QuanLiCanBo qlcb = new QuanLiCanBo();
        qlcb.CanBo();
        qlcb.hienThiCanBo();

        int[] ketqua = qlcb.timKiemTheoTen("T");
        int count = qlcb.demKqTimKiemTheoTen("T");
        qlcb.hienThiKetQuaTimKiem(ketqua, count);
    }
}
