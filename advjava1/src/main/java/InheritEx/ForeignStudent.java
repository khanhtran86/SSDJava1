package InheritEx;

public class ForeignStudent extends Student{
    public String QuocTich;

    @Override
    public void Print() {
        super.Print();

        //System.out.println("Quoc Tich: "+ this.QuocTich);
    }
}
