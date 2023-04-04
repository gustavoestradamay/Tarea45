import java.util.Scanner;

public class nNotas {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int cant;
        double nota,prom,sum=0;
        System.out.println("_-Calculando el promedio de n notas-_");
        System.out.println("ingrese la cantidad de notas a evaluar");
        cant=a.nextInt();
        for(int i=0;i<cant;i++){
            System.out.println("ingrese la nota en la posicion "+(i+1));
            nota=a.nextDouble();
            sum=sum+nota;
        }
        prom=sum/cant;
        System.out.println("El promedio de los estudiantes es de: "+prom);
    }
}
