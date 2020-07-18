package aulas.oo.encapsulamento.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("KiritoKunSama", 07, 10, 2008);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Kirigaya Kazuto");

        System.out.println(eu.getNome());

    }
}
