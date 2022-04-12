/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App79;

/**
 *
 * @author Admin
 */
public class NhanVien {
    protected String ten;
    protected long luong;
    
    public NhanVien(){
    }
    public NhanVien(String ten){
        this.ten=ten;
    }
    protected String loaiNhanVien(){
        return"";
    }
    public void xuatThongTin(){
        System.out.println("----- Nhan Vien : " + ten + "----------");
        System.out.println("-- Loai nhan vien:  "+ loaiNhanVien());
        System.out.println("- Luong: .." + luong +" (VND)");
    }
}
