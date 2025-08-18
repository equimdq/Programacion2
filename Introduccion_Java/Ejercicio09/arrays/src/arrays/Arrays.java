
package arrays;


public class Arrays {

   
    public static void main(String[] args) {
        int[] edades = new int [6];
        double[] precios = new double [4];
        boolean[] flgas = new boolean [3];
        char [] simbolos = new char [5];
        String [] palabras = new String [2];
        
        int[] edades2 = {27,40,19,33,58,61};
        double[] precios2 = {2.5,37.148,-2,123.99};
        boolean[] flags2 = {false,true,false};
        char[] simbolos2 = {'Z','@','4','h','%'};
        String[] palabras2 = {"Hola","Mundo"};
        
        for (int i = 0; i < edades2.length; i++) {
            int elemento = edades2[i];
            System.out.print(elemento + " ");
            
        }
    }

}
