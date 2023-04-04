import java.util.Scanner;

public class aprobado {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String nom;
        Double nota;
        char seccion;
        System.out.println("_-Sistema de aprobado o no-_");
        System.out.println("Ingrese el nombre del estudiante");
        nom=a.nextLine();
        System.out.println("ingrese el grupo del estudiante: a,b,c");
        seccion=a.next().charAt(0);
        System.out.println("Ingrese la nota del estudiante");
        nota=a.nextDouble();
        if (nota<60) {
            System.out.println("El estudiante "+nom+" del grupo "+seccion+" esta reprobado con una nota de: "+Math.round(nota));
        } else {
            System.out.println("El estudiante "+nom+" del grupo "+seccion+" esta aprobado con una nota de: "+Math.round(nota));
        }
    }
}
