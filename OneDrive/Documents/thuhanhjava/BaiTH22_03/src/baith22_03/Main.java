/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith22_03;
/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
            ht.nhapBankinh();
            ht.tinhChuVi();
            ht.tinhDienTich();
            ht.inChuvi();
            ht.inDientich();
        HinhChuNhat hcn = new HinhChuNhat();
            hcn.nhapChieudai();
            hcn.nhapChieurong();
            hcn.tinhChuvi();
            hcn.tinhDientich();
            hcn.inChuvi();
            hcn.indientich();
        PhuongTrinhBacHai ptb2 =new PhuongTrinhBacHai();
            ptb2.nhapA();
            ptb2.nhapB();
            ptb2.nhapC();
            ptb2.giaiPT();
        Person ps = new Person();
            ps.NhapPersonID();
            ps.NhapPersonName();
            ps.NhapGender();
            ps.NhapAddress();
            ps.In();
        
        
    }
    
}
