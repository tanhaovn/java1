package quan_ly_thu_vien;
public class Newspaper extends ThongTin{
    //bao
    private int soLuongMuon;

    public Newspaper(String id, String ten, int soLuongMuon, int maSo) {
        super(id, ten, maSo);
        this.soLuongMuon = soLuongMuon;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }
    @Override
    public String toString(){
        return "Bao :"+"So luong bao:"+soLuongMuon+","+"id:"+id+","+"Ten:"+ten+","+"Ma so:"+maSo;
    }
    
}
