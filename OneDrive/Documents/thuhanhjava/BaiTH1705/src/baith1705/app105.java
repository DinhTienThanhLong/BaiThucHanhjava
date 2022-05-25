/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class app105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeMap<Integer, Character> treemap = new TreeMap<>();
       treemap.put(6, 'A');
       treemap.put(5, 'B');
       treemap.put(1, 'C');
       treemap.put(2, 'D');
       treemap.put(8,'E');
       
          Set<Entry<Integer,Character>>settreeMap= treemap.entrySet();
          System.out.println("Các entry có trrong settreemap ");
          System.out.println(settreeMap);
    }
    
}
