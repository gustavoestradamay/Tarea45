import java.util.Scanner;

public class numYX {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        double x,y;
        double res=0;
        System.out.println("ingrese el valor de X");
        x=a.nextDouble();
        System.out.println("ingrese el valor de Y");
        y=a.nextDouble();
        if (x<0&&y<0) {
            res=Math.pow(y, 2)+Math.pow(x, 2);
            System.out.println("ambos son numeros negativos por ende se suman la potencia cuadrada de ambos");
        } else {
            if (x<0) {
                res=y-x;
                System.out.println("El X es un numero negativo por ende se restan");
            } else {
                if (y<0) {
                    res=x/y;
                    System.out.println("La Y es un numero negativo por ende se dividen");
                } else {
                    if (x>0&&y>0) {
                        if (x>y) {
                            res=x+y;
                            System.out.println("ambos son numeros positivos pero Y es menor a X por ende se suman ambos");
                        } else {
                            res=Math.sqrt(x);
                            System.out.println("ambos son numeros positivos pero Y es mayor a X por ende se saca raiz cuadrada a");
                        }
                    }
                }
            }
        }
        System.out.println("Y la respuesta es: "+res);
    }
}
