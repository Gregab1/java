package semana2;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        int  aux;

        Scanner Leer = new Scanner(System.in);
        System.out.println("escriba 5 numeros");





        System.out.println("orden decresiente");
        int vector[] = new int[5];

        boolean bandera = false;
        int l;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un dato N°[" + i + "]");
            int numero = Leer.nextInt();
            l = 0;
            while (l <= 4) {

                if (vector[l] == numero) {
                    System.out.println("numero ya escrito");
                    i = i - 1;
                    bandera = true;
                }
                l = l + 1;
            }
            if (bandera != true) {
                System.out.println("ingrese el siguiente nuemro");
                vector[i] = numero;
            }
        }
        System.out.println("--------------------------------------------------------");


        for (int i = 0; i < vector.length-1; i++) {

            for (int j = 0; j < vector.length-1; j++) {
                if(vector[j]>vector[j+1]){
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }

            }
        }




        for(int i=0;i< vector.length;i++){
            if(vector[i]%7!=0){
                System.out.println(vector[i]);
            }

        }


            }
        }



