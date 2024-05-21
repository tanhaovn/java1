package quan_ly_thu_vien;

import java.util.ArrayList;
import java.util.List;

class ArrayThongTin {
    List<ThongTin>thongtin;
    
    public ArrayThongTin(){
        this.thongtin = new ArrayList<>();
    }
    
    //them thong tin
    public void themThongTin(ThongTin them){
        this.thongtin.add(them);
    }
    //xoa thong tin
    public boolean xoaThongTin(String id){
        ThongTin chon = this.thongtin.stream().filter(them->them.getId().equals(id)).findFirst().orElse(null);
        if(chon==null){
            return false;
        }
        this.thongtin.remove(chon);
        return true;
    }
    
    //hien thi
    public void hienthi(){
        this.thongtin.forEach(thongtin->System.out.println(thongtin.toString()));
    }
    
    // tim kiem sach
    public void timkiemSach(){
        this.thongtin.stream().filter(chon->chon instanceof Book).forEach(chon->System.out.println(chon.toString()));
    }
    //tim kiem tap chi
    public void timkiemTapchi(){
        this.thongtin.stream().filter(chon->chon instanceof Journal).forEach(chon->System.out.println(chon.toString()));
    }
    //tim kiem bao
    public void timkiemBao(){
        this.thongtin.stream().filter(chon->chon instanceof Newspaper).forEach(chon->System.out.println(chon.toString()));
    }
}
