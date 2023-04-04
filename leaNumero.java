import java.util.Scanner;
public class leaNumero {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double x,res=0;
        System.out.println("si x<0 x a la potensia de 4");
        System.out.println("si x>0 x a la potensia de 2");
        System.out.println("Ingrese el valor de X");
        x=a.nextDouble();
        if (x>0) {
            res=Math.pow(x, 2);
            System.out.println(Math.round(x)+"^2= "+res);
        } else {
            res=Math.pow(x, 4);
            System.out.println(Math.round(x)+"^4= "+res);
        }
    }
}
