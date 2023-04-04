import java.util.Scanner;

public class cosientes3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num;
        System.out.println("_-multiplos de tres-_");
        System.out.println("ingrese cualquier numero");
        num=a.nextInt();
        if (num % 3==0) {
            System.out.println("El numero "+num+" es divisible de 3");
        } else {
            System.out.println("El numero "+num+" no es divisible");
        }
    }
}
