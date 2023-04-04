import java.util.Scanner;

public class posOneg {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Double y,num;
        System.out.println("Ingrse un numero cualquiera");
        num=a.nextDouble();
        if (num<0) {
            y=num+5;
            System.out.println("Y="+Math.round(num)+"+5");
        } else {
            y=Math.pow(2, num);
            System.out.println("Y=2^"+num);
        }
        System.out.println("Y="+y);
    }
}
