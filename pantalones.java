import java.util.Scanner;
public class pantalones {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int npant;
        int Ctotal;
        System.out.println("Ingrese el numero de pantalones a comprar");
        npant=a.nextInt();
        if (npant<=3) {
            Ctotal=12*npant;
        } else {
            Ctotal=10*npant;
        }
        System.out.println("El coste total seria de:"+Ctotal+"$");
    }
}
