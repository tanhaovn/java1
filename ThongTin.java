package quan_ly_thu_vien;
public class ThongTin {
    protected String id;
    protected String ten;
    protected int maSo;

    public ThongTin(String id, String ten, int maSo) {
        this.id = id;
        this.ten = ten;
        this.maSo = maSo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    
}
