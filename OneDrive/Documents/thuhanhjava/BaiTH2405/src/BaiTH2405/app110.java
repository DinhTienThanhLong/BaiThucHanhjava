/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTh2405;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Integer> arrListInteger = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int number; 
     
    System.out.println("Nhập số phần tử của ArrayList: ");
    int n = scanner.nextInt();
         
 
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i +": ");
        number = scanner.nextInt();
        arrListInteger.add(number);
    }
        
    int max = arrListInteger.get(0);    
         
    for (int i = 1; i < arrListInteger.size(); i++) {
 
        if (arrListInteger.get(i).compareTo(max) > 0) {
            max = arrListInteger.get(i);
             }
        }
    System.out.println("Phần tử lớn nhất trong arrListInteger = " + max);
    }
    
}
    

