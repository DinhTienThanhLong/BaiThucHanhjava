/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class appbai5 {
    private static Scanner a = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ,sum =0; 
        do{
             
		System.out.print("nhập số nguyên: ");
			  n=a.nextInt();
			sum+=n;
        }
      while( sum < 100);
		System.out.println("tổng các số vừa nhập là: "+sum);
    }
    
}
