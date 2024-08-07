package tuyensinh;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        TuyenSinh tuyenSinh = new TuyenSinh();

        ThiSinhKhoiA tsA1 = new ThiSinhKhoiA("A1", "Tung Nguyen", MucUuTien.MUC_1);
        tsA1.Toan = 7;
        tsA1.Ly = 6;
        tsA1.Hoa = 7;
        tuyenSinh.Add(tsA1);

        ThiSinhKhoiA tsA2 = new ThiSinhKhoiA("A2", "Tung Nguyen", MucUuTien.MUC_2);
        tsA2.Toan = 8;
        tsA2.Ly = 8;
        tsA2.Hoa = 8;

        tuyenSinh.Add(tsA2);

        List<ThiSinh> lstTS = tuyenSinh.FilterKhoiThi("A");
        lstTS.forEach((s)->{
            System.out.println(s.HoTen);
            System.out.println(s.TongDiem());
        });
    }
}
