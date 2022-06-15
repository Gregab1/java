package casting;


import com.sun.security.jgss.GSSUtil;

public class Principal {
    public static void main(String[] args) {
       Grado G1=new Grado("ceil","terciario","desarrollo",12);



        System.out.println("-------------------------------------------------");
        System.out.println(G1);

        Escuela  E1 =(Escuela) G1;
        System.out.println(E1);
        System.out.println("----------------------------------------------------");
        Escuela EG=new Escuela("ceil","terciario");
        Escuela E4=new Escuela("alicia","secundario");
        Escuela E2=new Escuela("Galo","promario");
        Escuela E3=new Escuela("ceil","erciario");

        System.out.println("comparacion de objetos");
        System.out.println("combo 1");
        System.out.println(EG);
       /* Grado grad=(Grado) EG;
        System.out.println(grad);*/
        System.out.println(E4);
        System.out.println("combo 2 ");
        System.out.println(E2);
        System.out.println(E3);
        System.out.println("combo 3");
        System.out.println(E3);
        System.out.println(EG);
        System.out.println("---------------");
        System.out.println("combo 1; " + EG.equals(E4));
        System.out.println("combo 2; "+ E2.equals(E3));
        System.out.println("combo 3; "+ E3.equals(EG));





    }
}
