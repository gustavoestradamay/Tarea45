import java.util.Scanner;
public class triangulos {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int lad1,lad2,lad3;
        System.out.println("###-calculando el tipo de triangulos-###");
        System.out.println("ingrese el lado #1");
        lad1=a.nextInt();
        System.out.println("ingrese el lado #2");
        lad2=a.nextInt();
        System.out.println("ingrese el lado #3");
        lad3=a.nextInt();
        if (lad1==lad2 && lad1==lad3 && lad2==lad3) {
             System.out.println("todos sus lados son iguales, es decir es un triangulo equilatero");
        } else {
            if (lad1==lad2 || lad1==lad3 || lad2==lad3) {
                System.out.println("dos de sus lados son distintos es decir es un triangulo isocel");
            } else {
                if (lad1!=lad2 && lad1!=lad3 && lad2!=lad3) {
                    System.out.println("todos sus lados son distintos es decir es un triangulo escaleno");
                }
            }
        }
    }
}
