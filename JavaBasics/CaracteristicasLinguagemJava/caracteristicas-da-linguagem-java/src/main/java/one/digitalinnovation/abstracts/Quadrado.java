package one.digitalinnovation.abstracts;

public class Quadrado extends FormaGeometrica {

    private String nome;
    private Double area;

    public Quadrado(final String nome, final Double lado1,final Double lado2) {
        this.nome = nome;
        this.area = lado1 * lado2;
    }

    @Override
    public String nome() {

        return nome;
    }

    @Override
    public Double area() {
        return area;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()//
                .append("Quadrado [")//
                .append("nome=\"")//
                .append(nome).append("\"")//
                .append(",area=")//
                .append(area)//
                .append("]");
        return builder.toString();
    }
}
