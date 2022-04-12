/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App79;
import App79.Configs;
/**
 *
 * @author Admin
 */
public class Nhanvienfulltime extends NhanVien{
     private int gioLamViec;
   
   public Nhanvienfulltime(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien chinh thuc";
   }
   public void tinhLuong(){
       luong= Configs.LUONG_FULL_TIME * gioLamViec;
   }
    
}


