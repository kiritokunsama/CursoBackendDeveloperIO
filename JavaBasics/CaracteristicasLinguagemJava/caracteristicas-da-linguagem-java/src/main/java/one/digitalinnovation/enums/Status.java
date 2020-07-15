package one.digitalinnovation.enums;
/*
ENUM é um dicionario de dados imuável.
Não é premitido criar novas instâncias
O Construtor é sempre declarado como "private"
Por convenção, por serem objetos constantes e imutaveis (static final),
os nomes são em MAIÚSCULO.
*/
public enum Status {
    OPEN(13, "Aberto"),
    CLOSE(02, "Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto) {

        this.cod = cod;
        this.texto = texto;
    }

    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}
