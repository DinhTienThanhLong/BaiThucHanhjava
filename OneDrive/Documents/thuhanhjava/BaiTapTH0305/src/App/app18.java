/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Admin
 */
public class app18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <String> arrListString = new  ArrayList<>();
        arrListString.add(1,"ab");
        arrListString.add(2,"bc");
        arrListString.add(3,"cd");
        arrListString.add(4,"de");
        arrListString.add(5,"ef");
        arrListString.add(6,"fg");
        
        Iterator<String> iterator = arrListString.iterator();
       
        System.out.println("Cac phan tu trong arrlistString la : ");
        while (iterator.hasNext()){
            System.out.print (iterator.next() + "\t");
        }// TODO code application logic here
    }
    
}
