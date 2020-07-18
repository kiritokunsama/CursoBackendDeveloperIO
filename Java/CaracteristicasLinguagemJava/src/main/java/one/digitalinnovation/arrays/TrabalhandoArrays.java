package one.digitalinnovation.arrays;

public class TrabalhandoArrays {
    public static void main(String[] args) {

	int[] meuArray1 = new int[7]; 
    int[] meuArray2 = {12,36,25,38,85,64,97};

    System.out.println("=== Array1 ===");
    for (int i = 0 ; i<meuArray1.length; i++) System.out.println("      " + meuArray1[i]);

    System.out.println("=== Array2 ===");
    for (int i = 0; i<meuArray2.length; i++) System.out.println("      " + meuArray2[i]);

    }
}