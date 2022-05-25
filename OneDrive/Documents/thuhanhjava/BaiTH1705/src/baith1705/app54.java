/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.Scanner;
import java.util.HashSet;
/**
 *
 * @author Admin
 */
public class app54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print ("Số phần tử muốn nhập : ");
        int n= sc.nextInt();
        HashSet<Integer> hashSetInt = new HashSet<>();
        for(int i=0; i<n;i++)
        {
            System.out.print("Thông tin phần tử " + (i+1) + " là :");
            int x = sc.nextInt();
            hashSetInt.add(x);
        }
        for ( Object x : hashSetInt) {
            System.out.print(" " +    x   + "  ");
            
        }
        System.out.print ("\nSố phần tử muốn thêm : ");
         int m= sc.nextInt();
         HashSet<Integer> hashSetInt1 = new HashSet<>();
        for(int i=0; i<m;i++)
        {
            System.out.print("\nThông tin phần tử " + (i+1) + " là :");
            int y = sc.nextInt();
            hashSetInt1.add(y);
        }
        hashSetInt.addAll(hashSetInt1);
        for ( Integer y : hashSetInt) {
            System.out.print(" " +    y  + "  ");
    }
    }
}
