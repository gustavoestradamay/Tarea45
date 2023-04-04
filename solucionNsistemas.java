import java.util.Scanner;

public class solucionNsistemas {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c,d,e,f,x,y;
        int delta,deltax,deltay;
        int op;
        boolean boo=false;
        System.out.println("_-Determinando la solucion de n sistemas de ecuaciones lineales con dos incognitas con el metodo Cramer-_");
            System.out.println("sistema de ecuaciones a solucionar: ");
            System.out.println("ax+by=c");
            System.out.println("dx+ey=f");
            System.out.println("ingrese el valor de a");
            a=s.nextInt();
            System.out.println("ingrese el valor de b");
            b=s.nextInt();
            System.out.println("ingrese el valor de c");
            c=s.nextInt();
            System.out.println("ingrese el valor de d");
            d=s.nextInt();
            System.out.println("ingrese el valor de e");
            e=s.nextInt();
            System.out.println("ingrese el valor de f");
            f=s.nextInt();
            delta=(a*e)-(d*b);
            deltax=(c*e)-(b*f);
            deltay=(a*f)-(c*d);
            x=deltax/delta;
            y=deltay/delta;
            System.out.println(a+"x+"+b+"y="+c);
            System.out.println(d+"x+"+e+"y="+f);
            System.out.println("Delta y: "+deltay);
            System.out.println("Delta x: "+deltax);
            System.out.println("Delta: "+delta);
            System.out.println("y= "+y);
            System.out.println("x= "+x);
        System.out.println("Fin del programa...");
    }
    
}