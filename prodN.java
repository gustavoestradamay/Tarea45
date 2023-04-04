import java.util.Scanner;

public class prodN {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int cant,num,res=0,con=1;
        System.out.println("_-Producto de n numeros-_");
        System.out.println("Ingrese la cantidad de numeros a multiplicar");
        cant=a.nextInt();
        for(int i=0;i<cant;i++){
            System.out.println("ingrese el numero a multiplicar en la posicion "+(i+1));
            num=a.nextInt();
            con=con*num;
        }
        System.out.println("El producto de "+cant+" numeros es de: "+con);
    }
}
