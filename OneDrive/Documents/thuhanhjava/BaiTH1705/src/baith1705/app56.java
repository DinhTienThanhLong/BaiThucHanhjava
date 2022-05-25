/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name;
       HashSet<String>hashSetString = new HashSet<>();
       Scanner sc = new Scanner(System.in);
       hashSetString.add("wilson");
       hashSetString.add("Nike");
       hashSetString.add("Volvo");
       hashSetString.add("Kia");
       hashSetString.add("Lenovo");
       hashSetString.add("Lenovo");
       System.out.println("Các phần tử trong hashsetstring : ");
       System.out.println(hashSetString);
       System.out.println(" nhập các phần tử cần xóa : ");
       name = sc.nextLine();
       if(hashSetString.contains(name)){
           hashSetString.remove(name);
           System.out.println(" Xóa Thành công ");
           System.out.println(" các phần tử còn lại trong hashsetstring là: ");
           System.out.println (hashSetString);
       }
       else{
           System.out.println(" xóa không thành công");
       }
    }
    
}
