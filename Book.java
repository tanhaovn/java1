package quan_ly_thu_vien;
public class Book extends ThongTin{
    private String tenSach;
    private int soLuong;

    public Book(String tenSach, String id, int soLuong, String ten, int maSo) {
        super(id, ten, maSo);
        this.tenSach = tenSach;
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public String toString(){
        return "Sach :"+"Ten sach:"+tenSach+","+"So luong:"+soLuong+","+"id:"+id+","+"Ten:"+ten+","+"Ma so:"+maSo;
    }
}
