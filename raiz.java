import java.util.Scanner;
public class raiz {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double num,raiz;
        System.out.println("_-Sacandon raiz cuadrada de cualquier numero-_");
        System.out.println("ingrese el numero a evaluar");
        num=a.nextInt();
        raiz=Math.sqrt(num);
        System.out.println("La raiz cuadrada de "+num+" es de: "+raiz);
    }
}
