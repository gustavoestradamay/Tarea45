import java.util.Scanner;
public class vCilindro {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double radio,altura,volumen=0,pi=3.1416;
        System.out.println("_-Calculando el volumen de un cilindro-_");
        System.out.println("ingrese el radio del cilindro");
        radio=a.nextDouble();
        System.out.println("ingrese la altura del cilindro");
        altura=a.nextDouble();
        volumen=pi*Math.pow(radio, 2)*altura;
        System.out.println("el volumen del cilindro es de: "+volumen);
    }
}
