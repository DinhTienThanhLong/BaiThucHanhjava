/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App54;
import App54.HinhChuNhat;
import App54.HinhVuong;
import App54.HinhTru;
import App54.Hinhtron;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hinhtron hinhtron = new Hinhtron();
       hinhtron.xuatten();
       hinhtron.nhapbk();
       hinhtron.tinhcv();
       hinhtron.tinhdt();
       hinhtron.incv();
       hinhtron.indt();
       
       HinhChuNhat hcn = new HinhChuNhat();
       hcn.xuatten();
       hcn.nhapcdcr();
       hcn.tinhcv();
       hcn.tinhdt();
       hcn.incv();
       hcn.indt();
        
       HinhTru hinhtru = new HinhTru();
       hinhtru.xuatten();
       hinhtru.nhapchieucao();
       hinhtru.tinhthetich();
       hinhtru.intt();
       
       
       HinhVuong hinhvuong = new HinhVuong();
       hinhvuong.xuatten();
       hinhvuong.nhapcanh();
       hinhvuong.tinhcv();
       hinhvuong.tinhdt();
       hinhvuong.incv();
       hinhvuong.indt();
       
    }
        
    
}
