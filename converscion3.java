import java.util.Scanner;
public class converscion3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int op;
        double y,f,i,c;
        System.out.println("_-convercion a centimetros-_");
        System.out.println("1.convercion de yardas");
        System.out.println("2.convercion de pies");
        System.out.println("3.convercion de pulgadas");
        op=a.nextInt();
        switch (op) {
            case 1:
                System.out.println("ingresen el valor en yardas");
                y=a.nextDouble();
                c=y*91.44;
                System.out.println(y+" yardas son "+c+" en centimetros");
                break;
            case 2:
                System.out.println("ingresen el valor en pies");
                f=a.nextDouble();
                c=f*30.48;
                System.out.println(f+" pies son "+c+" en centimetros");
                break;
            case 3:
                 System.out.println("ingresen el valor en pulgadas");
                i=a.nextDouble();
                c=i*2.54;
                System.out.println(i+" pulgadas son "+c+" en centimetros");
                break;    
            default:
                break;
        }

    }
}