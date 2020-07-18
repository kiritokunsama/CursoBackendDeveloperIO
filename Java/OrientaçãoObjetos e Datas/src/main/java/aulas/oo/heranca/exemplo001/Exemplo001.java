package aulas.oo.heranca.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQuantidadeDePortas());

        Motocicleta moto = new Motocicleta();
        moto.setMarca("DUCATI");
        moto.setModelo("STREETFIGHTER");
        moto.setCilindradas("850");
        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
        System.out.println(moto.getCilindradas());
    }

}
