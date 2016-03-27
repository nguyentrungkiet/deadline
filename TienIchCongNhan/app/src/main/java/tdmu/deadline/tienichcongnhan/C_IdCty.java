package tdmu.deadline.tienichcongnhan;

/**
 * Created by Trinh on 3/26/2016.
 */
public class C_IdCty {
    public String TenCty;
    public String IDcty;
    public String DiadiemThanhpho;
    public String DiadiemHuyen;
    public Integer Luong;
    public String Bophan;

    public C_IdCty(String tenCty, String IDcty, String diadiemThanhpho, String diadiemHuyen, Integer luong, String bophan) {
        TenCty = tenCty;
        this.IDcty = IDcty;
        DiadiemThanhpho = diadiemThanhpho;
        DiadiemHuyen = diadiemHuyen;
        Luong = luong;
        Bophan = bophan;
    }
}
