package InheritEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IDPreEx {
    public static void main(String[] args) {
        Random rdn = new Random();
        int number = rdn.nextInt();

        //Sử dụng interface để khai báo, không dùng class để khai báo.
        IStudentManager studentMgr;

        if(number%2==0)
        {
            studentMgr = new StudentManager();
        }
        else {
            studentMgr = new ForeignStudentManager();
        }

        studentMgr.SayHello();

        List<Student> lstStore = new ArrayList<>();
    }
}
