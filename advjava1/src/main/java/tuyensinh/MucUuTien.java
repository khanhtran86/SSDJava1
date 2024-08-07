package tuyensinh;

public enum MucUuTien {
    MUC_1(0.5),
    MUC_2(1),
    MUC_3(1.5);

    private double type;
    MucUuTien(double type)
    {
        this.type = type;
    }

    public double GetAddition()
    {
        return this.type;
    }

}
