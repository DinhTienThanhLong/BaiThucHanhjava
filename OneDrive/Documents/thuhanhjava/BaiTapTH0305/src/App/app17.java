/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class app17 {
    public static void main(String[] args) {
        ArrayList <Integer> arrListInt = new  ArrayList<>();
        arrListInt.add(1,1);
        arrListInt.add(2,9);
        arrListInt.add(3,3);
        arrListInt.add(4,4);
        arrListInt.add(5,5);
        
        
       
        System.out.println("Cac phan tu trong arrlistString la : ");
        for(int number : arrListInt){
            System.out.print (number + "\t");
        }
    }
}
