/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import java.util.Scanner;
import baith19_04.Person;
/**
 *
 * @author Admin
 */
public class Customer extends Person{
        private int sdt;
        private String hanghoadamua;
        
        public int getSĐT(){
            return sdt;
        }
        public void setSĐT(int sdt){
            this.sdt=sdt;
               
        }
        public String getHanghoadamua(){
            return hanghoadamua;
        }
        public void setHanghoadamua(String hanghoadamua){
            this.hanghoadamua=hanghoadamua;
        }
        public void nhapthongtin(){
            super.nhapthongtin();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập sdt khách hàng : ");
               sdt=sc.nextInt();
            System.out.print("Nhập hàng hóa đã được khách hàng mua :  ");
                hanghoadamua = sc.nextLine();
        }
}
