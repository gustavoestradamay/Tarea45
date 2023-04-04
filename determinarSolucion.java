import java.util.Scanner;

public class determinarSolucion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,x;
        System.out.println("_-Determinando la solucion de la ecuacion de primer grado ax+b=0-_");
        System.out.println("Ingrese el valor de a");
        a=s.nextDouble();
        System.out.println("Ingrese el valor de b");
        b=s.nextInt();
        if (a!=0 && b!=0) {
            x=b*a;
            System.out.println("El resultado de la equacion teniendo a="+a+" b="+b+" x sera igual a: "+x);
        } else {
            System.out.println("a y b no pueden ser igual a cero");
        }
    }
}
