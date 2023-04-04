import java.util.Scanner;
public class interesDecapital {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int dinero,tiempo;
        double tasa,interes;
        System.out.println("_-Calculando el interes de un capital-_");
        System.out.println("ingrese la cantidad de capital a prestar");
        dinero=a.nextInt();
        System.out.println("Ingrese el tiempo de periodo de tiempo a pagar en meses");
        tiempo=a.nextInt();
        if (dinero<10000) {
            tasa=0.06;
            interes=dinero*tiempo*tasa;
            System.out.println("El interes del capital es de: "+interes);
        } else {
            tasa=0.07;
            interes=dinero*tiempo*tasa;
            System.out.println("El interes del capital es de: "+interes);
        }
    }
}