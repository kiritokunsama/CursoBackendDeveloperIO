package one.digitalinnovation.arrays;

public class ArraysDuasDimensoes {
    public static void main(String[] args) {
        
        int[][] meuArray1 = {{12,0,25,43},{85,64,97,15,39}};
    
        for (int i = 0 ; i<meuArray1.length; i++) {
            System.out.println("==");   
            for (int j = 0; j<meuArray1[i].length; j++) 
            System.out.println(meuArray1[i][j]);   
        }      
    }
}
