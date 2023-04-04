import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Double l1,l2,l3,p,s,res,rai;
        System.out.println("_-Calculando el area de un triangulo por sus lados-_");
        System.out.println("Ingrse el lado 1");
        l1=a.nextDouble();
        System.out.println("Ingrse el lado 2");
        l2=a.nextDouble();
        System.out.println("Ingrse el lado 3");
        l3=a.nextDouble();
        p=l1+l2+l3;
        s=p/2;
        rai=s*(s-l1)*(s-l2)*(s-l3);
        res=Math.sqrt(rai);
        System.out.println("El area del triangulo es de: "+res);

    }
}
