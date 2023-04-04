import java.util.Scanner;
public class convercion2 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double f,c=0;
        System.out.println("_-Convercion de grados fahrenheit a celcius-_");
        System.out.println("Ingrese el valor en fahrenheit a convertir");
        f=a.nextDouble();
        c=(f-32)*5/9;
        System.out.println(f+"° fahrenheit son: "+c+"° celcius");
    }
}
