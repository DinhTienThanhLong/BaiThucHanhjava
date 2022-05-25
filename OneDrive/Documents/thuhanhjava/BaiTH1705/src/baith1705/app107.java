/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class app107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<Integer, Double> treemap = new TreeMap<>();
        treemap.put(1,9d);
        treemap.put(4,10.2d);
        treemap.put(2,7.2d);
        treemap.put(8,20.28d);
        System.out.println(" các phần tử trong treemap là: ");
        Set<Map.Entry<Integer,Double>>settreeMap= treemap.entrySet();
        System.out.println(settreeMap);
        treemap.replace(4, 20.11d);
        treemap.replace(2, 7.2d, 7.7d);
        System.out.println(" các thành phần có trong treemap sau khi thay thế : ");
        settreeMap = treemap.entrySet();
        System.out.println(settreeMap);
    }
    
}
