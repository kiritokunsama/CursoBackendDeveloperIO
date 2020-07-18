package one.digitalinnovation.tipos.naoprimitivos;

public class Unboxing {
    // contruimos um objeto e atribuimos a um tipo primitivo
    public static void main(String[] args) {
        // Esta depreciado desde a versão 9
        //int i = new Integer(3);
        //Ao invez disso usamos:
        int inteiro = Integer.valueOf(1024);
        //===================================

        // Esta depreciado 
        //boolean b = new Boolean(true);
        //Ao invez disso usamos:
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");

    }

}
