package tuyensinh;

public class ThiSinhKhoiB extends ThiSinh{
    public double Toan;
    public double Hoa;
    public double Sinh;

    public ThiSinhKhoiB(String SBD, String Hoten, tuyensinh.MucUuTien mucut) {
        super(SBD, Hoten, mucut);
    }

    @Override
    public double TongDiem() {
        return Toan+ Hoa +Sinh + this.MucUuTien.GetAddition();
    }
}
