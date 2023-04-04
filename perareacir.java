import java.util.Scanner;
public class perareacir {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double pi=3.1416,radio,area=0,per=0,dia=0;
        int d=2;
        System.out.println("_-Calculando el area y el perimetro-_");
        System.out.println("Ingrese el radio de la circunferencia");
        radio=a.nextDouble();
        area=pi*Math.pow(radio,d);
        per=(d*radio)*pi;
        dia=radio*d;
        System.out.println("El area del circulo es de: "+area);
        System.out.println("El perimetro de la circunferencia es de: "+per);
        System.out.println("Con un diametro de: "+dia);
    }
}
