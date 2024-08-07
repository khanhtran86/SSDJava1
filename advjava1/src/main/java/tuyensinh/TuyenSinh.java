package tuyensinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    private List<ThiSinh> lstStore = new ArrayList<>();

    public void Add(ThiSinh thisinh) throws Exception {
        //1. check sdb existed or not
        List<ThiSinh> lstSDB = this.lstStore.stream().filter(
                    (s)->s.SoBaoDanh.equalsIgnoreCase(thisinh.SoBaoDanh)
                ).collect(Collectors.toList());

        //2. if sdb is not existed
        if(lstSDB.size()==0)
        {
            this.lstStore.add(thisinh);
        }
        else
        {
            //3. Throw excemtion if sbd is existed
            throw new Exception("SDB \""+thisinh.SoBaoDanh+"\" is in used");
        }
    }

    public List<ThiSinh> FilterKhoiThi(String Khoi)
    {
        //Comparator<ThiSinh> comparator = Comparator.comparingDouble(t->t.TongDiem());
        List<ThiSinh> lst = this.lstStore.stream().filter(
                (s)->s.GetKhoiThi().equalsIgnoreCase(Khoi)
            ).sorted(Comparator.comparingDouble(s->s.TongDiem()))
                .collect(Collectors.toList());

        Collections.reverse(lst);
        return lst;
    }

    public ThiSinh FindThiSinh(String sbd)
    {
        List<ThiSinh> lstResult = this.lstStore.stream().filter(
                (s)->s.SoBaoDanh.equalsIgnoreCase(sbd)
            ).collect(Collectors.toList());

        if(lstResult.size()>0) return lstResult.get(0);
        return null;
    }
}
