/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class app38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add(1,"java");
        list.add(1,"c++");
        list.add(1,"PhP");
        list.add(1,"Python");
    System.out.println("Vi du phuong thuc addAll()");
    System.out.println("-----------------------");
    LinkedList<String>listA= new LinkedList<>();
    listA.addAll(list);
    System.out.print("listA");
    showList(listA);
    System.out.println("\n vi du su dung phuong thuc retainall()");
    System.out.println("----------------");
    LinkedList<String>listB = new LinkedList<String>();
    listB.add("java");
    
    listA.retainAll(listB);
    System.out.print("ListA :");
    showList(listA);
    
    System.out.println("\n vi du su dung phuong thuc removeall()");
    System.out.println("----------------");
    list.removeAll(listB);
    System.out.print("List :");
    showList(listA);
        // TODO code application logic here
    }

    public static void showList(LinkedList<String> list) {
       for(String obj : list){
           System.out.print("\t"  + obj + ",");
           
       }
       System.out.println();
       
    }
    
}
