package com.samsung;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private static List<Student> lstStudent = new ArrayList<>();

    public void Add(Student student)
    {
        lstStudent.add(student); //Them sinh vien vao kho
    }

    public void Remove(int studentIndex)
    {
        lstStudent.remove(studentIndex);
    }

    public static void Print()
    {
        for (Student s: lstStudent)
        {
            s.GetInfo();
        }
    }

    public static void main(String[] args) {

        //Create object
        Student student1 = new Student("Sinh vien 1");
        student1.Place = "Ha Noi";
        student1.DOB = "1990";
        student1.isPass = true;

        lstStudent.add(student1);

        //Create object
        Student student2 = new Student("Sinh vien 2");
        student2.Place = "Ha Noi";
        student2.DOB = "1999";
        student2.isPass = false;

        lstStudent.add(student2);

        Print();
    }

}
