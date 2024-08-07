package tuyensinh;

public abstract class ThiSinh {
    public String SoBaoDanh;
    public String HoTen;
    public String DiaChi;
    public MucUuTien MucUuTien;

    public ThiSinh(String SBD, String Hoten, MucUuTien mucut)
    {
        this.SoBaoDanh = SBD;
        this.HoTen = Hoten;
        this.MucUuTien = mucut;
    }
    public double TongDiem()
    {
        return 0;
    }

    public String GetKhoiThi()
    {
        if(this instanceof ThiSinhKhoiA) return "A";
        else if(this instanceof ThiSinhKhoiB) return "B";
        else if(this instanceof ThiSinhKhoiC) return "C";
        else return "";
    }
}
