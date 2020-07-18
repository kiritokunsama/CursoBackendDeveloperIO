package one.digitalinnovation.abstracts;

public abstract class FormaGeometrica {
    /*
    Esse modificador não pode ser aplicado em variaveis,
    apenas em classes e metodos.
    Uma  lasse abstrata não pode ser instânciada (não pode
    virar objeto, ele é uma "ideia" de classe).
    Se uma classe possui um metodo abstrato, a
    classe também deve ser abstrata (não tem "corpo" {} ).    
    */
    public abstract String nome();
    public abstract Double area();

    public String descreveLados(double x , double y) {
        return "Um dos lados vale:"+x+" un. e o outro vale:"+y+" un.";
    }
}
