/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Admin
 */
public class Triangle  extends Point{
    public double a;
     public double b;
      public double c;
if( (a+b==c) || (b+c==a) || (a+c==b) )
    System.out.println("day la 3 diem thang hang");
else if( a==b && b==c && c==a )
    System.out.println("day la tam giac deu");
else if( (a==b || b==c || c==a) && ( (a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==a*a+b*b) ) )
    System.out.println("day la tam giac vuong can");
else if( a==b || b==c || c==a )
    System.out.println("day la tam giac can");
else if( (a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==a*a+b*b) )
    System.out.println("day la tam giac vuong");
else
    System.out.println("day la tam giac thuong");
System.out.println(a+"\n"+b+"\n"+c);
}
