import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int edad;
        String nom;
        System.out.println("Ingrese el nombre del usuario");
        nom=a.nextLine();
        System.out.println("Ingrese la edad del usuario");
        edad=a.nextInt();
        if (edad<=13) {
            System.out.println("El usuario "+nom+" es un niño");
        } else {
            if (edad<=25) {
                System.out.println("El usuario "+nom+" es un joven adulto");
            } else {
                System.out.println("El usuario "+nom+" es un adulto");
            }
        }
    }
}
