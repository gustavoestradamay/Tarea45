import java.util.Scanner;

public class venAcien {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num1=20,num2=100,suma=0,canP=0,canI=0;
        System.out.println("_-Calculando numeros impares entre 20 y 100-_");
        for(int i=20;i<=100;i++){
            
            if (i%2==0) {
                canP++;
            } else {
                canI++;
                suma=suma+i;
            }
        }
        System.out.println("La suma de los numeros del 20 a 100: "+suma);
        System.out.println("Se encontraron "+canI+" numeros impares");
    }
}
