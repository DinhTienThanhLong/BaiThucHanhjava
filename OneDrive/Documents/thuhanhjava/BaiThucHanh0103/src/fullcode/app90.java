/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fullcode;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
  String a;
  char kt;
  Scanner scanner = new Scanner(System.in);
  System.out.println("Nhập vào chuỗi bất kỳ: ");
  a = scanner.nextLine();
  System.out.println("Các ký tự có trong chuỗi là: ");
    for (int i = 0; i < a.length(); i++) {
        kt = a.charAt(i);
        System.out.println(kt);
    }
    }
    
}
