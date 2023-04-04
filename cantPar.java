import java.util.Scanner;

public class cantPar {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num,cpa=0,cim=0,cn;
        System.out.println("_-contando la cantidad de pares e impares de n numeros-_");
        System.out.println("Ingrese la cantidad de numeros a evaluar ");
        cn=a.nextInt();
        for(int i=1;i<=cn;i++){
            System.out.println("Ingrese el numero a evaluar en la posicion: "+i);
            num=a.nextInt();
            if (num%2==0) {
                cpa++;
            } else {
                cim++;
            }
        }
        System.out.println("Se ingreso la cantidad de: "+cn);
        System.out.println("Se registro: "+cpa+" numeros pares");
        System.out.println("Se registro: "+cim+" numeros impares");
    }
}
