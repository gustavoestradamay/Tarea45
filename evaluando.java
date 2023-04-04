import java.util.Scanner;
public class evaluando {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int x=1,op;
        double y=0;
        System.out.println("_-Evaluando la Función Y= 5X^4 + 2X^3 + 3X^2 + 7-_");
        System.out.println("1.Para el valor de x=1");
        System.out.println("2.Para x=un numero cualquiera");
        op=a.nextInt();
        switch (op) {
            case 1:
                y=(5*Math.pow(x, 4))+(2*Math.pow(x, 3))+(3*Math.pow(x, 2))+7;
                System.out.println("el resultado es de: "+y);
                break;
            case 2:
                System.out.println("ingrese el valor de x");
                x=a.nextInt();
                y=(5*Math.pow(x, 4))+(2*Math.pow(x, 3))+(3*Math.pow(x, 2))+7;
                System.out.println("el resultado es de: "+y);
                break;
            default:
                break;
        }
    }
}
