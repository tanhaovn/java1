package quan_ly_thu_vien;
public class Journal extends ThongTin {
    //tap chi
    private int soBao;
    private int thangMuon;

    public Journal(String id, String ten, int soBao, int thangMuon, int maSo) {
        super(id, ten, maSo);
        this.soBao = soBao;
        this.thangMuon = thangMuon;
    }

    public int getSoBao() {
        return soBao;
    }

    public void setSoBao(int soBao) {
        this.soBao = soBao;
    }

    public int getThangMuon() {
        return thangMuon;
    }

    public void setThangMuon(int thangMuon) {
        this.thangMuon = thangMuon;
    }
    @Override
    public String toString(){
        return "Tap chi :"+"So tap chi:"+soBao+","+"So thang muon:"+thangMuon+","+"id:"+id+","+"Ten:"+ten+","+"Ma so:"+maSo;
    }
}
