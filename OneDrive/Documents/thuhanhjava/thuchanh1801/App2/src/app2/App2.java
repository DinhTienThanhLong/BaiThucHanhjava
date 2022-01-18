/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App2 {
    public static void main(String[] args) {
        int [][] arr = nhap();
        giaihe(arr);
    }
    static void giaihe(int [][] arr){
        
    }
    static int[][] copy(int[][] arr){
     int [][] a=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr.length;j++){
                a[i][j]=arr[i][j];
             }
        }
    return a;
    }
      static int[][] nhap(){
      int cot;
      Scanner sc= new Scanner(System.in);
      System.out.println("nhap vao he so cua phuong trinh");
      cot = sc.nextInt();
      int[][] arr= new int[2][cot];
        for(int i=0;i<2;i++){
            for(int j=0; j<cot ;j++){
                System.out.println("a["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
          } 
        return arr;
      }
      static int det(int[][] arr){
      if(arr.length == 1)
          return arr[0][0]
      }
}