import java.util.Scanner;

public class energiaTotal {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double ET,EC,EP,m,v,h,g=9.8;
        System.out.println("_-Calculando la energia total-_");
        System.out.println("ingrese la masa");
        m=a.nextDouble();
        System.out.println("Ingrese la acceleracion/velocidad");
        v=a.nextDouble();
        System.out.println("Ingrese la altura");
        h=a.nextDouble();
        EC=(m/2)*Math.pow(v, 2);
        EP=m*h*g;
        ET=EC+EP;
        System.out.println("Energia cinetica: "+EC);
        System.out.println("Energia potencial: "+EP);
        System.out.println("Energia total: "+ET);
    }
}
