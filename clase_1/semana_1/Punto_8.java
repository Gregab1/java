import java.util.Scanner;

public class Punto_8 {
    public static void main(String orgs[]){
        Scanner Leer=new Scanner(System.in);
        String frase;
        int contador=0;
        System.out.println("ingrese una frase");
        frase=Leer.nextLine();
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)!=' '){
                contador++;
            }

        }
        System.out.println("el n umero letras es " + contador);
    }
}
