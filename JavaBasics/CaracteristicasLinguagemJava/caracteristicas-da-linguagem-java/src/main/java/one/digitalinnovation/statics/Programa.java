package one.digitalinnovation.statics;

public class Programa {
    /*
  
    É usada para a criação de uma variável que poderá ser
    acessda por todas as instancias de objetos desta classe
    como uma variável comum, ou seja, a variável criada
    será a mesma em todas as instâncias e quando seu contúdo
    é modificado numa das inatâncias, a modificação ocorre
    em todas as demais.
        E nas declarações de métodos ajudam no acesso diretp à
    classe, portanto não é necessário instanciar um objeto
    para acessar o método,
    */
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        System.out.println(Cachorro.late());
    }

}
