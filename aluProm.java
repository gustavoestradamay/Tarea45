import java.util.Scanner;

public class aluProm {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double n1,n2,n3,suma=0,prom=0,notafinal=0,nacom=0,prom2;
        int cn=25,op,cant=0;
        String nom;
        System.out.println("Calculando el promedio de n alumnos");
        for(int i=1;i<=25;i++){
            System.out.println("ingrese el nombre del alumno");
            nom=a.nextLine();
            nom=a.nextLine();
            System.out.println("Ingrese la nota del 1er examen");
            n1=a.nextDouble();
            System.out.println("Ingrese la nota del 2do examen");
            n2=a.nextDouble();
            System.out.println("Ingrese la nota del 3er examen");
            n3=a.nextDouble();
            suma=n1+n2+n3;
            prom=suma/3;
            System.out.println(i+"-El alumno "+nom+" tiene como promedio de notas: "+prom);
            nacom=nacom+n1+n2+n3;
            cant++;
            System.out.println("Desea continuar? 1.si 2.no");
            op=a.nextInt();
            if (op==2) {
                i=26;
            }
        }
        prom2=nacom/cant;
        System.out.println("el promedio de la cantidad de "+cant+" alumnos es de: "+prom2);
    }
}
