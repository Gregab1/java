
import java.util.Scanner;


public class multiplomodi {
    public static void main(String orgs[]) {
        System.out.println("ingrese un numero");
        Scanner Leer = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0,num4;
        num1 = Leer.nextInt();
        System.out.println("ingrese un otro numero");
        num2 = Leer.nextInt();
        System.out.println("inglese el multiplo que desea");
        num3 = Leer.nextInt();
       num4=num1-num2;
       if (num3>=num4){
       
         if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if(i%num3!=0){
                    System.out.println("."+i);
                }
                
            }
        } else{
            for (int i = num2; i <= num1; i++) {
                 if(i%num3!=0){
                    System.out.println("."+i);
                }
                
            }
        }
       }else{
           System.out.println("el numero ingresado no es permitido");
       }
       
        
       
    

    }
}
