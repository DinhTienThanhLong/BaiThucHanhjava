/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author Admin
 */
public class app19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <String> arrListString = new  ArrayList<>();
        arrListString.add(0,"ab");
        arrListString.add(1,"bc");
        arrListString.add(2,"cd");
        arrListString.add(3,"de");
        arrListString.add(4,"ef");
        arrListString.add(5,"fg");
       
        ListIterator<String>listIterator = arrListString.listIterator();
        
        System.out.println(" cac phan tu trong arrListString la : ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + "\t");
            
        }
    }
    
}
