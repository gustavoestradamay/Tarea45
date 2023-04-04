import java.util.Scanner;
public class determinando {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int op,x;
        double c=2.5,y=0;
        System.out.println("_-Determinando la exprecion Y= X*C-2 donde c=2.5-_");
        System.out.println("1.x con un valor inicial de 2");
        System.out.println("2.ingresando un valor cualquiera");
        op=a.nextInt();
        switch (op) {
            case 1:
            x=2;    
            y=x*c-2;
            System.out.println("El resultado es de: "+y);
                break;
            case 2:
            System.out.println("ingrese el valor de x");
            x=a.nextInt();
            y=x*c-2;
            System.out.println("El resultado es de: "+y);
                break;
            default:
                break;
        }

    }
}
