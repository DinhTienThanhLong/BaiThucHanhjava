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
   private Point A;
    private Point B;
    private Point C;
    public Triangle(Point d1, Point d2, Point d3) {
            A = d1;
            B = d2;
            C = d3;
        }
        public double a () {
            double a = A.tinhKC(B);
            return (a);
        }

        public double b () {
        double b = B.tinhKC(C);
        return (b);
        }
        public double c () {
            double c = A.tinhKC(C);
            return (c);
        }

    public static void main(String[] args) {
        Point a=new Point();
        a.nhap();
        Point b=new Point();
        b.nhap();
        Point c=new Point();
        c.nhap();
        Triangle tri= new Triangle ( A,B,C);
        if( (tri.a()+tri.b()>tri.c()) || (tri.b()+tri.c()>tri.a()) || (tri.a()+tri.c()>tri.b())){

         if( tri.a()==tri.b() && tri.b()==tri.c() && tri.c()==tri.a())
            System.out.println("day la tam giac deu");
        else if( (tri.a()==tri.b() || tri.b()==tri.c() || tri.c()==tri.a()) && ( (tri.a()*tri.a()==tri.b()*tri.b()+tri.c()*tri.c())
                || (tri.b()*tri.b()==tri.a()*tri.a()+tri.c()*tri.c()) || (tri.c()*tri.c()==tri.a()*tri.a()+tri.b()*tri.b()) ) )
            System.out.println("day la tam giac vuong can");
        else if( tri.a()==tri.b() || tri.b()==tri.c() || tri.c()==tri.a() )
            System.out.println("day la tam giac can");
        else if( (tri.a()*tri.a()==tri.b()*tri.b()+tri.c()*tri.c()) || (tri.b()*tri.b()==tri.a()*tri.a()+tri.c()*tri.c())
                || (tri.c()*tri.c()==tri.a()*tri.a()+tri.b()*tri.b()))
            System.out.println("day la tam giac vuong");
        else
            System.out.println("day la tam giac thuong");}

        else
            System.out.println(" 3 ??i???m kh??ng t???a th??nh tam gi??c. ");

    }
}