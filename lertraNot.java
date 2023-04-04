import java.util.Scanner;

public class lertraNot {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int notas;
        String nom;
        char letra;
        System.out.println("Ingrese el nombre del estuduiante");
        nom=a.nextLine();
        System.out.println("Ingrese la nota del estudiante");
        notas=a.nextInt();
        if (notas>=90) {
            letra='A';

        } else {
            if (notas>=80) {
                letra='B';
            } else {
                if (notas>=65) {
                    letra='C';
                } else {
                    letra='E';
                }
            }
        }
        System.out.println("El estudiante posee una nota de "+notas+" lo cual es una: "+letra);
    }
}
