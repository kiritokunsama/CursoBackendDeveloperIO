package one.digitalinnovation.classes.usuario;

public class SuperUsuario {
    //Tipo PRIVATE não esta acessevel fora da classe
    private String login;
    private String senha;
    String nome;

    public SuperUsuario(final String login, final String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {

        return login;
    }
    /* Tipo PROTECTED esta acessivel dentro do mesmo bloco
    ou por herança*/
    protected String getSenha() {

        return senha;
    }

}
