/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app5;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class app5 {
    private static Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0, a;
    System.out.println("\n\nNhập vào số cần kiểm tra: ");
    a = s.nextInt();
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        sum+=i;
    }
    if(sum==a){
      System.out.println(a + " là số hoàn hảo");
    }
    else {
      System.out.println(a + " không phải là số hoàn hảo");
    }// TODO code application logic here
    }
    
}
