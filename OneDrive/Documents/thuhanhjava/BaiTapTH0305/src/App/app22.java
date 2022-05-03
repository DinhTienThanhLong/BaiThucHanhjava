/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app22 {
    public static void main(String[] args) {
        ArrayList<Integer>arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Nhap so phan tu cua Arraylist : ");
        int n = sc.nextInt();
        
        for(int i = 0 ; i< n; i++){
            System.out.print("Nhap  phan tu thu"  +i  );
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        
        for ( int i = 1 ; i<arrListInteger.size(); i++ ){
            if(arrListInteger.get(i).compareTo(max)>0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println (" Phan tu lon nhat la :   " + max);
    }
    
}
