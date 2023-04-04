import java.util.Scanner;
public class coseno {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double res=0;
        double num;
        System.out.println("obtener el valor del coseno de un numero n");
        System.out.println("ingrese el numero a evaluar");
        num=a.nextDouble();
        res=Math.cos(num);
        System.out.println("coseno de "+num+": "+res);
    }
}
