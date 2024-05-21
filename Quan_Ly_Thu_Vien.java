package quan_ly_thu_vien;

import java.util.Scanner;

public class Quan_Ly_Thu_Vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayThongTin a = new ArrayThongTin();
        while (true){
            System.out.println("QUAN LY THU VIEN ");
            System.out.println("1.Them thong tin.");
            System.out.println("2.Tim kiem thong tin.");
            System.out.println("3.Hien thi thong tin.");
            System.out.println("4.Xoa thong tin bang id.");
            System.out.println("5.Thoat.");
            System.out.println("  ");
            String chon = sc.nextLine();
            switch(chon){
                case "1":{
                    System.out.println("a.Them thong tin nguoi muon SACH.");
                    System.out.println("b.Them thong tin nguoi muon TAP CHI.");
                    System.out.println("c.Them thong tin nguoi muon BAO");
                    String chon1 = sc.nextLine();
                    switch(chon1){
                        case "a":{
                            System.out.print("Nhap id:");
                            String id = sc.nextLine();
                            System.out.print("Nhap ho va ten:");
                            String ten = sc.nextLine();
                            System.out.print("Nhap ma so:");
                            int maSo = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhap ten sach:");
                            String tenSach = sc.nextLine();
                            System.out.print("Nhap so luong sach:");
                            int soLuong = sc.nextInt();
                            ThongTin sach = new Book(tenSach,id,soLuong,ten,maSo);
                            a.themThongTin(sach);
                            System.out.println(sach.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b":{
                            System.out.print("Nhap id:");
                            String id = sc.nextLine();
                            System.out.print("Nhap ho va ten:");
                            String ten = sc.nextLine();
                            System.out.print("Nhap ma so:");
                            int maSo = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhap so bao muon:");
                            int soBao = sc.nextInt();
                            System.out.print("Nhap thang muon bao:");
                            int thangMuon = sc.nextInt();
                            ThongTin tapchi = new Journal(id,ten,soBao,thangMuon,maSo);
                            a.themThongTin(tapchi);
                            System.out.println(tapchi.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c":{
                            System.out.print("Nhap id:");
                            String id = sc.nextLine();
                            System.out.print("Nhap ho va ten:");
                            String ten = sc.nextLine();
                            System.out.print("Nhap ma so:");
                            int maSo = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nhap so luong bao:");
                            int soLuongMuon = sc.nextInt();
                            ThongTin bao = new Newspaper(id,ten,soLuongMuon,maSo);
                            a.themThongTin(bao);
                            System.out.println(bao.toString());
                            sc.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.println("a.Tim kiem sach.");
                    System.out.println("b.Tim kiem tap chi.");
                    System.out.println("c.Tim kiem bao.");
                    String chon2=sc.nextLine();
                    switch(chon2){
                        case "a":{
                            a.timkiemSach();
                            break;
                        }
                        case "b":{
                            a.timkiemTapchi();
                            break;
                        }
                        case "c":{
                            a.timkiemBao();
                            break;
                        }
                        default:
                            System.out.println("Khong hop le!");
                            break;
                    }
                    break;
                }
                case "3":{
                    a.hienthi();
                    break;
                }
                case "4":{
                    System.out.print("Nhap id can xoa:");
                    String id=sc.nextLine();
                    System.out.println(a.xoaThongTin(id) ? "Thanh cong":"That bai");
                }
                break;
                case "5":{
                    return;
                }
                default:
                    System.out.println("Khong hop le!");
                    continue;
            }
        }
   }
    
}
