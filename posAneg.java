import java.util.Scanner;

public class posAneg {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese el primer numero (positivo)");
        num1=a.nextInt();
        System.out.println("Ingrese el segundo numero (negativo)");
        num2=a.nextInt();
        if (num1>0&&num2<0) {
            System.out.println("Numeros originale: "+num1+" "+num2);
            num2=num2-num2-num2;
            num1=num1-num1-num1;
            System.out.println("Cambio de signo: "+num1+" "+num2);
        } else {
            System.out.println("Uno de los numero es incompatible (osea son dos positivos o dos negativoa)");
        }
    }
}
