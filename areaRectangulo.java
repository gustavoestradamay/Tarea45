import java.util.Scanner;
public class areaRectangulo {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b,h,ar=0;
        System.out.println("calculando el area de un rectangulo");
        System.out.println("ingrese la altura del rectangulo");
        h=a.nextInt();
        System.out.println("ingrese la base del rectangulo");
        b=a.nextInt();
        ar=b*h;
        System.out.println("el area del rectangulo es de: "+ar);
    }
}
