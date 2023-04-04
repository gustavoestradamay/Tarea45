import java.util.Scanner;
public class vFuerza {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double ma,acc,fu;
        System.out.println("_-Calculando la fuerza de un objeto-_");
        System.out.println("ingrese la masa del objeto");
        ma=a.nextDouble();
        System.out.println("Ingrese la acceleracion del objeto");
        acc=a.nextDouble();
        fu=ma*acc;
        System.out.println("La fuerza de un objeto de masa "+ma+" con una acceleracion de "+acc+" es igual a: "+fu);
    }
}
