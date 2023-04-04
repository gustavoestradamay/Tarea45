import java.util.Scanner;
public class numerosN {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num,con=0,acum=0,sumar,cantCer=0;
        System.out.println("ingrese la cantidad de numeros a sumar");
        num=a.nextInt();
        for(int s=1;s<=num;s++){
            System.out.println("ingrese el numero a sumar");
            sumar=a.nextInt();
            con=con+sumar;
            acum=acum+con;
            if (sumar==0) {
                cantCer++;
            }
        }
        System.out.println("Resultado de la suma de "+num+" numeros es de: "+con);
        System.out.println("Cantidad de ceros ingresados: "+cantCer);
    }
}
