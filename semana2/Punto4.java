package semana2;

import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;
        Scanner Leer= new Scanner(System.in);
        System.out.println("escriba 5 numeros");
        num1=Leer.nextInt();
        num2=Leer.nextInt();
        num3=Leer.nextInt();
        num4=Leer.nextInt();
        num5=Leer.nextInt();

        int vector []={num1,num2,num3,num4,num5};
        System.out.println("Los numeros ingresados son;");
        for(int i=0;i<vector.length;i++){
            if(vector[i] % 7!=0){
                System.out.println("numero; "+vector[i]);
            }

        }
    }
}
