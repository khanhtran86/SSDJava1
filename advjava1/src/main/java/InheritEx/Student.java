package InheritEx;

//Sư dụng abstract để tạo ra class chỉ dành cho kế thừa.
//Sử dụng final để chặn kế thừa.
public class Student {
    public String HoVaTen;
    public String NoiSinh;
    public Major ChuyenNganh;

    public void Print()
    {
        System.out.println("Ho ten: " + HoVaTen);
        System.out.println("Noi sinh: "+ NoiSinh);
        System.out.println("Chuyen Nganh: "+ this.ChuyenNganh.name());
    }
}
