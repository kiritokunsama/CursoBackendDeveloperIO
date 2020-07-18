package aulas.oo.paradigma.exemplo001;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.falarMeuProprioNome());
        // Olá, meu nome é Marco

        System.out.println(pessoa.estudar());
        System.out.println(pessoa.beberCafe());
        System.out.println(pessoa.estudar());
    }
}
