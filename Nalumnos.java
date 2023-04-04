import java.util.Scanner;

public class Nalumnos {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double prom,suma,nota;
        String nom;
        int cn,reprobados=0,aprobados=0,op;
        boolean b=true;
        System.out.println("_-Sistema de notas para n alumnos-_");
        while (b=true) {
            a.nextLine();
            System.out.println("ingrese el nombre del estudiante");
            nom=a.nextLine();
            System.out.println("ingrese la nota del estudiante");
            nota=a.nextDouble();
            if (nota<=60) {
                System.out.println("Este alumno esta reprobado");
                reprobados++;
            } else {
                System.out.println("El alumno "+nom+" esta aprobado");
                aprobados++;
            }
            System.out.println("Quiere ver cuantos alumnos han aprobado/reprobado ? 1.no 2.si");
            op=a.nextInt();
            if (op==2) {
                System.out.println("Se reportan:");
                System.out.println("Alumnos aprobados: "+aprobados);
                System.out.println("Alumnos reprobados: "+reprobados);
            }
        }
        
    }
}
