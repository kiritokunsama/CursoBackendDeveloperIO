package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> personagens = new ArrayList<>();
        
        personagens.add("Katarina");
        personagens.add("Jessica");
        personagens.add("Alistar");
        personagens.add("Xerath");
        personagens.add("Karma");
        personagens.add("Lion");

        System.out.println(personagens);
        personagens.set(1, "Lisbeth");  //Substitui o que temos no index (posição) 1 pelo nome escolhido
        System.out.println(personagens); // Printa lista


        Collections.sort(personagens);   // Ordena alfabeticamente a lista
        System.out.println(personagens); // Printa lista
        

        personagens.add("Alice"); // Adicionamos o nome ao final da lista
        System.out.println(personagens);  // Observe que foi para o final da lista

        personagens.set(3, "Shinon");
        System.out.println(personagens);
        System.out.println("");

        // METODO REMOVE
        personagens.remove(5); //Remove o item do index fornecido
        System.out.println(personagens);

        personagens.remove("Karma"); //Remove um objeto baseado no nome
        System.out.println(personagens);
        System.out.println("");

        //METODO GET
        String nome = personagens.get(3); //Retorna o nome do elemento correspondente ao indice
        System.out.println(nome + " esta nessa posicao!");
        System.out.println("");

      
       // String nome = personagens.get(3); //ERRO: Não existe essa posição na lista
       //System.out.println(nome);

       //METODO SIZE
        var tamanho = personagens.size(); //Retorna um inteiro com o tamnha da lista
        System.out.println("Objetos na Lista: " + tamanho);
        
        personagens.add("Sion");
        System.out.println("Objetos na Lista: " + personagens.size());
        System.out.println("");

        //METODO CONTAINS - Retorna um booleano indicando se tal elemento existe na lista
        System.out.println("Comtem Asuna na Lista? R: " + personagens.contains("Asuna"));
        System.out.println("Comtem Lisbeth na Lista? R: " + personagens.contains("Lisbeth"));
        System.out.println("Comtem lisbeth na Lista? R: " + personagens.contains("lisbeth")); // É case sensitive
        System.out.println("");

        //METODO ISEMPTY - Reportana um booleano true se a lista estiver vazia ou false caso tenha algo nela
        System.out.println("A lista esta vazia? R: " + personagens.isEmpty());
        System.out.println("");

        //METODO CLEAR - Limpa completamente a Lista
        System.out.println("Limpando Lista --> personagens ...");
        personagens.clear();
        System.out.println("A lista esta vazia? R: " + personagens.isEmpty());

        System.out.println("Itens da lista: " + personagens); //Imprime a Lista
        System.out.println("");

        //Adicionando novos itens a lista
        personagens.add("Kirito");
        personagens.add("Alice");
        personagens.add("Eugeo");
        
        Collections.sort(personagens);
        System.out.println("Itens da lista personagens: " + personagens); //Imprime a Lista
        System.out.println("");

        List<String> personagensSecundarios = new ArrayList<>();
        personagensSecundarios.add("Tiese");
        personagensSecundarios.add("Ronie");
        System.out.println("Itens da lista personagensSecundarios: " + personagensSecundarios); //Imprime a Lista
        System.out.println("");

        System.out.println("Aguarde... transferindo itens da Lista personagensSecundarios para a Lista personagens...");
        personagens.addAll(personagensSecundarios);
        System.out.println("");

        Collections.sort(personagens);
        System.out.println("Itens da lista personagens: " + personagens); //Imprime a Lista
        System.out.println("");

        //METODO INDEXOF - Retorna o index do objeto com o nome correspondente
        nome = "James";
        if  (personagens.indexOf(nome) == -1) {
            System.out.println("O personagem " + nome + " não esta na lista");
        } else {
            System.out.println("O personagem " + nome + " esta na posição: " + personagens.indexOf(nome));
        }
        //=============================================================================================================//
        
        System.out.println("");
        System.out.println("Imprimindo cada item da Lista:");
        for (String nomeItem: personagens) //Vai executar para toda a lista, um item por vez
        {
            System.out.println(personagens.indexOf(nomeItem) + ": " + nomeItem);
        }
        System.out.println("");
        
        //OBJETO ITERATOR - 
        Iterator<String> iterator = personagens.iterator();
        while (iterator.hasNext()){
            System.out.println(" >>" + iterator.next());
        }

       /*
        personagens.add("Kirito");
        personagens.add("Asuna");
        personagens.add("Yui");
        personagens.add("Klein");
        personagens.add("Lisbeth");
        personagens.add("Shinon");
        personagens.add("Alice");
        personagens.add("Eugeo");
        personagens.add("Silica");
        personagens.add("Selka");
        personagens.add("Tiese");
        personagens.add("Ronie");
        personagens.add("Sorteliena");
        personagens.add("Bercouli");
        personagens.add("Vecta");
        personagens.add("Eldrie");
        personagens.add("Fizel");
        personagens.add("Linel");
       */

    }

}
