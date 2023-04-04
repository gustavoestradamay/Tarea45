import java.util.Scanner;
public class convercion1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double k,l;
        System.out.println("_-Convercion de kilos a libras-_");
        System.out.println("ingrese el valor de kilos a convertir");
        k=a.nextInt();
        l=k*2.20462;
        System.out.println("La medida de "+k+" kilogramos en libras es de: "+l);
    }
}
