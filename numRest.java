import java.util.Scanner;

public class numRest {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num1,num2,res;
        System.out.println("ingrese dos numeros cualquieras");
        num1=a.nextInt();
        num2=a.nextInt();
        res=num1-num2;
        System.out.println("Entre estos dos numeros se encuentran: "+Math.abs(res)+" numeros");
    }
}
