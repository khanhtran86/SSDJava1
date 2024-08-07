package com.samsung;

public class Student {
    public String Name; //Thuoc tinh
    public String Place; //Thuoc tinh
    public String DOB; //Thuoc tinh
    public Boolean isPass; //Thuoc tinh

    //Contructor
    public Student(String Name)
    {
        this.Name = Name;
    }
    //Phuong thuc
    public void GetInfo()
    {
        System.out.println("Ten Sinh vien: "+ this.Name);
        System.out.println("Noi Sinh: "+ this.Place);
        System.out.println("Ngay Sinh: "+ this.DOB);
        System.out.println("Trang thai: "+ (this.isPass? "Trung tuyen": "Khong trung tuyen"));
    }
}
