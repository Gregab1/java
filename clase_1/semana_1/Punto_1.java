
import java.util.Scanner;

public class Punto_1 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner Leer= new Scanner(System.in);
        int num1=0,num2=0,suma=0;
        num1=Leer.nextInt();
        System.out.println("ingrese un otro numero");
        num2=Leer.nextInt();
        suma=num1+num2;
        System.out.println("la suma de ambos numro es de; "+suma);

    }
}
