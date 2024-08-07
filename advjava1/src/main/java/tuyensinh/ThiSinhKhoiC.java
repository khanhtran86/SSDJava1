package tuyensinh;

public class ThiSinhKhoiC extends ThiSinh{
    public double Van;
    public double Su;
    public double Dia;

    public ThiSinhKhoiC(String SBD, String Hoten, tuyensinh.MucUuTien mucut) {
        super(SBD, Hoten, mucut);
    }

    @Override
    public double TongDiem() {
        return this.Van + this.Su + this.Dia + this.MucUuTien.GetAddition();
    }
}
