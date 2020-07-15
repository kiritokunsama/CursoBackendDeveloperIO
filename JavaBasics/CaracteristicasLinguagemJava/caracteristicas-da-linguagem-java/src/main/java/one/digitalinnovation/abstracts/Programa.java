package one.digitalinnovation.abstracts;

public class Programa {

    public static void main(String[] args) {

        //final FormaGeometrica formaGeometrica = new FormaGeometrica();
        var lado1 = 10.0;
        var lado2 = 5.0;
        final FormaGeometrica quadadro = new Quadrado("quadadro", lado1,lado2);
        
        System.out.println(quadadro);
        
        System.out.println(quadadro.descreveLados(lado1,lado2));
        System.out.println(quadadro.nome());
        System.out.println(quadadro.area());
    }

}
