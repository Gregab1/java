package actividad;
import java.util.Scanner;
public class ejercicioOne {
    public static void main(String[] args) {

Scanner Leer=new Scanner(System.in);
        String vector []= new String[4];

        for ( int i=0;i<vector.length;i++){
            System.out.println("ingrese texto en la pocicion : "+i);
          String texto=Leer.nextLine();
          vector[i]=texto;
        }
        for ( int i=0;i<vector.length;i++){{

            System.out.print(vector[i]+"-");
        }
        }
    }
}
