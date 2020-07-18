package aulas.oo.paradigma.exemplo001;

public class Pessoa {

    private String nome = "KiritoKunSama";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é " + getNome();
    }

    public String estudar() {
        return "Estudando...";
    }
    
    public String beberCafe() {
        return "Tomando café...";
    }
}
