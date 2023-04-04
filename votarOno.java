import java.util.Scanner;

public class votarOno {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int edad;
        String nom;
        System.out.println("Progama de edad de votacion");
        System.out.println("ingrese su nombre");
        nom=a.nextLine();
        System.out.println("ingrese su edad actual");
        edad=a.nextInt();
        if (edad>16) {
            System.out.println("Usted "+nom+" puede votar ya que su edad es de: "+edad+" años");
        } else {
            System.out.println("usted "+nom+" aun no puede votar ya que su edad es de: "+edad+" años");
        }
    }
}
