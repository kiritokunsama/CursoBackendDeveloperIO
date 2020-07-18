package one.digitalinnovation.arrays;

public class CriandoArrays {
    
public static void main(String[] args) {

	//Criamos um arrau vazio com 7 espaços
	int[] meuArray1 = new int[7]; 

	//Criamos um array com 7 espaços com seu respectivos valores
	int[] meuArray2 = {12,36,25,38,85,64,97};

	//Depois de cria um Array não pode ter seu tamanho mudado
	System.out.println("============ ");
	System.out.println("Sem index ");
	System.out.println(meuArray1);
	System.out.println(meuArray2);
	System.out.println("=============================== ");

	System.out.println("Com index ");
	System.out.println("Prosição 3 do Array 1 --> " + meuArray1[3]);
	System.out.println("Prosição 5 do Array 2 --> " + meuArray2[5]);
	System.out.println("=============================== ");

	System.out.println("Altera valor ");
	meuArray1[3] = 20;
	meuArray2[5] = 0;
	System.out.println("Prosição 3 do Array 1 --> " + meuArray1[3]);
	System.out.println("Prosição 5 do Array 2 --> " + meuArray2[5]);
	System.out.println("======================================== ");
	
	System.out.println("Comprimento dos Arrays");
	System.out.println(meuArray1.length);
	System.out.println(meuArray2.length);
	System.out.println("======================================== ");
}

}