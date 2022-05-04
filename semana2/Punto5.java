package semana2;

import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, aux;
        boolean bandera;
        Scanner Leer = new Scanner(System.in);
        System.out.println("escriba 5 numeros");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();
        num3 = Leer.nextInt();
        num4 = Leer.nextInt();

        num5 = Leer.nextInt();
        System.out.println("orden decresiente");
        int vector[] = {num1, num2, num3, num4, num5};


        for (int i = 0; i < vector.length - 1; i++) {

            for (int j = 0; j < vector.length - 1; j++) {
                if(vector[j]>vector[j+1]){
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }

            }
        }
        for (int i=0;i< vector.length;i++){
            if(vector[i]%7!=0){
                System.out.println(vector[i]);
            }

        }


    }


}


