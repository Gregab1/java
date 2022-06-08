package semana2;

public class punto7 {
    public static void main(String[] args) {


        int vector[]=new int [10];

        for( int i=0;i<vector.length;i++){
            vector[i]=(int) (Math.random()*20);
            for (int j=0;j<i;j++){
                if(vector[i]==vector[j]){
                    i--;
                }
            }
        }

        for (int i = 0; i < vector.length-1 ; i++) {

            for (int j = 0; j < vector.length-1; j++) {
                if(vector[j]>vector[j+1]){
                  int  aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }

            }
        }
        for (int k=0;k<vector.length;k++){
            if(vector[k]%7!=0){
                System.out.println(vector[k]);
            }
        }
    }
}
