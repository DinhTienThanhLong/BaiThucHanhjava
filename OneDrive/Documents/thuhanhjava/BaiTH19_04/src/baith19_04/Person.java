/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith19_04;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Person {
   protected String ten;
   protected int tuoi;
   public Person(){
       
   }
   
   public Person (String ten , int tuoi){
       this.ten=ten;
       this.tuoi=tuoi;
   }
   public String getTen(){
       return ten;
   }
   public void setTen(String ten){
       this.ten=ten;
   }
   
   public int getTuoi(){
       return tuoi;
   }
   public void setTuoi(int tuoi){
       this.tuoi=tuoi;
   }
   
   public void nhapthongtin(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập Họ tên: ");
        ten=sc.nextLine();
       System.out.print (" Nhập tuổi:  ");
        tuoi=sc.nextInt();
   }
   public void inthongtin(){
       System.out.println(" Họ Tên là :  "  + ten);
       System.out.println("Tuổi là : " + tuoi);
   }
}

    /**
     * @param args the command line arguments
     */

