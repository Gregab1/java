
import java.util.Scanner;


public class multiplo {
    public static void main(String orgs[]){
        System.out.println("ingrese un numero");
    Scanner Leer= new Scanner(System.in);
    int num1=0,num2=0;
    num1=Leer.nextInt();
     System.out.println("ingrese un otro numero");
      num2=Leer.nextInt();
      
      
      
      
      if(num1<num2){
          
        for(int i=num1;i<num2;i++){
            if(i%5==0){
                
                System.out.println("-");
            }else{
           System.out.println("-"+i); 
            }
         
         
         }
        
    
    
             
          
      
      
    
      }else if(num1>num2){
       for(int i=num2;i<num1;i++){
            if(i%5==0){
                
                System.out.println("-");
            }else{
        System.out.println("-"+i);
    
    }
      }
    
   
    }
    }
}