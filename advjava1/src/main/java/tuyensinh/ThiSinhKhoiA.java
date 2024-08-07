package tuyensinh;

public class ThiSinhKhoiA extends ThiSinh{
    public double Toan;
    public double Ly;
    public double Hoa;

    public ThiSinhKhoiA(String SBD, String Hoten, tuyensinh.MucUuTien mucut) {
        super(SBD, Hoten, mucut);
    }

    @Override
    public double TongDiem() {
        return Toan + Ly + Hoa + this.MucUuTien.GetAddition();
    }
}
