/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith152;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);  
     System.out.println("Các số chia hết cho 5 là: ");
  for (int i = 0; i <= 20; i++) {
     if (i % 5 != 0) {
            continue;
        }
  System.out.println(i);
  }// TODO code application logic here
    }
    
}
