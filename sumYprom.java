import java.util.Scanner;

public class sumYprom {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int c;
        int nums;
        int suma=0;
        int prom=0;
        System.out.println("_-Sumando n numeros cualesquiera-_");
        System.out.println("Ingrese la cantidad de numeros a sumar");
        c=a.nextInt();
        for(int i=1;i<=c;i++){
            System.out.println("ingrse el valor en la poscion: "+i);
            nums=a.nextInt();
            suma=suma+nums;
        }
        prom=suma/c;
        System.out.println("La suma de los tres numeros es de: "+suma);
        System.out.println("Y su promedio es de: "+prom);
    }
}
