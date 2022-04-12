/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App72;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SinhVien sv1=new SinhVien();
       SinhVien sv2=new SinhVien();
       sv1.setTen("");
       sv1.setTuoi(18);
       sv2.setTen("Pro");
       sv2.setTuoi(29);
       
       System.out.println("Sinh vien 1 co ten :  " +sv1.getTen()+ "va tuoi" +sv1.getTuoi());
       System.out.println("Sinh vien 2 co ten :  " +sv2.getTen()+ "va tuoi" +sv2.getTuoi());
       
    }
    
}
