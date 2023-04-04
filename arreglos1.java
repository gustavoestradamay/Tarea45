import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arreglos1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n;
        boolean b=true;
        boolean b2=true;
        int min=0,max=0;
        double prom=0,suma=0,pot=0;
        System.out.println("Ingrese la cantidad de numeros");
        n=a.nextInt();
        int[]numero=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el valor en la posicion"+(i+1));
            numero[i]=a.nextInt();
            if (b==true) {
                max=numero[i];
                b=false;
            } else {
                if (numero[i]>max) {
                    max=numero[i];
                }
            }
            if (b2==true) {
                min=numero[i];
                b2=false;
            } else {
                if (numero[i]<min) {
                    min=numero[i];
                }
            }
            suma=suma+numero[i];
            pot=pot+Math.pow(numero[i], 2);
        }
        prom=suma/n;
        System.out.println("Suma de sus elementos: "+suma);
        System.out.println("Suma de sus potencias: "+pot);
        System.out.println("El menor de los elementos: "+min);
        System.out.println("El mayor de sus elementos: "+max);
        System.out.println("El promedio de sus elementos: "+prom);
        Arrays.sort(numero);
        for(int f=0;f<n;f++){
            System.out.println(numero[f]);
        }
        

    }
}
