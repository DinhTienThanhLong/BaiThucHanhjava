/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java15.pkg2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Java152 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, Tong=0;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số dương bất kì:  ");
        n = scanner.nextInt();
        
        while (n>0){
        int sotach= n % 10;
        n = n /10;
        Tong += sotach;
        }
        System.out.println("Tổng các con số là =  " + Tong);
    }
    
}
