package aulas.oo.construtores.exemplo002;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getNome());
        pessoa.setNome("Yui");
        System.out.println(pessoa.getNome());
   
    }

}
