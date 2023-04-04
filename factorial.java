import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int numero;
        double contador=1;//tiene que ser doble para factorar numeros altos
        System.out.println("-_Realisando factoriales_-");
        System.out.println("ingrese un numero");
        numero=a.nextInt();
        for(int i=1;i<=numero;i++){
            contador=contador*i;
        }
        System.out.println(i+"! = "+contador);

    }
}
