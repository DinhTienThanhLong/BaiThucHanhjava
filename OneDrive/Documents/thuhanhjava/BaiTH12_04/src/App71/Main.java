/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App71;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HinhTron hinhtron = new HinhTron();
      hinhtron.setBK(5);
      float cv = hinhtron.tinhCV();
      float dt= hinhtron.tinhDT();
      System.out.println("chu vi hinh tron: " + cv +"; dien tich : " + dt);
    }
    
}
