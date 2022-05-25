/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class app69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int number;
      TreeSet<Integer> treesetint = new TreeSet<>();
      Scanner sc = new Scanner(System.in);
      
      treesetint.add(0);
      treesetint.add(2);
      treesetint.add(3);
      treesetint.add(4);
      treesetint.add(5);
      
      System.out.println(" Các phần tử trong treeset");
      System.out.println(treesetint);
      System.out.println("nhập các phần tử cần thêm :   ");
      number = sc.nextInt();
      
      if(!treesetint.contains(number)){
          treesetint.add(number);
          System.out.println("Thêm thành công!");
          System.out.println("Các phần tử trong treeset sau khi thêm là : ");
          System.out.println(treesetint);
      }
      else{
          System.out.println("Phần tử " + number + "đã tồn tại");
      }
    }
    
}
