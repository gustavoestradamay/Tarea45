import java.util.Scanner;
public class pares {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num=a.nextInt();
        if (num%2==0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("el numero ingresado es impar");
        }
    }
}
