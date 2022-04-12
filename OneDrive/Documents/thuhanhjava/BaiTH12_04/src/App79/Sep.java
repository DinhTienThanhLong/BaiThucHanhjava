/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App79;

/**
 *
 * @author Admin
 */
public class Sep extends NhanVien{
       private int gioLamViec;
   
   public Sep(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "sep";
   }
   public void tinhLuong(){
       luong= Configs.LUONG_FULL_TIME_SEP * gioLamViec;
   }
    
}
