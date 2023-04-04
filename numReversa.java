import java.util.Scanner;

public class numReversa {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int res=0,dig,num;
        System.out.println("Ingrese el numero a revertir");
        num=a.nextInt();
        while (num>0) {
            dig=num%10;
            res=(res*10)+dig;
            num=num/10;
        }
        System.out.println(res);
    }
}
