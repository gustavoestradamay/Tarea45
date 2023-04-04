import java.util.Scanner;

public class Nnumero {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int c,n;
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        c=a.nextInt();
        for(int i=1; i<=c; i++){
            System.out.println("Ingrese el numero en la posicion"+(i+1));
            n=a.nextInt();
            System.out.print(n);
            
        }

    }
}
