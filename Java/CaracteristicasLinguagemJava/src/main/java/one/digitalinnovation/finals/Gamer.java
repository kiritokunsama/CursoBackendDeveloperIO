package one.digitalinnovation.finals;

public class Gamer {

    public String keyboard() {
        return "Keyboard Gamer!";
    }
/*
Quando o metodo FINAL é aplicado em uma classe, não permite estender,
nos métodos impede que o mesmo seja sobrescrito (overriding) na
subclasse, e nos valores devariáveis não podem ser alterados depois
que já tanha sido atribuido um valor.
*/
    public final String mouse() {
        return "Mouse Gamer!";
    }



}
