package one.digitalinnovation.tipos.tipagem;

public class TipoInferido {
    /*
    Significa que criamos as variaveis sem especificar
    o tipo delas apenas usando "var" antes do nome.
    
    O proprio compilador atribui o tipo de acordo
    com o valor que ela vai receber.
    */
    public static void main(String[] args) {

        var numero = Integer.valueOf("123456");

        var texto = "O Numero é : " ;

        System.out.println(texto + numero);

    }

}
