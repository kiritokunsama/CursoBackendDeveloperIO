package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    

   public static void main(String[] args) {
        String clienteAtual;
        String clienteProximo;
        System.out.println("");
        System.out.println("");
        System.out.println(" =============== INICIALIZANDO PROGRAMA =============== ");
        System.out.println("");
        System.out.println("");
        
        Queue<String> filaAtendimento = new LinkedList<>();

        filaAtendimento.add("Marina");
        filaAtendimento.add("Marco");
        filaAtendimento.add("Henrique");
        filaAtendimento.add("Alvaro");
        filaAtendimento.add("Pamela");

       /* System.out.println("Fila atual: " + filaAtendimento); //Imprime a fila
        String clienteAtual = filaAtendimento.poll();// Retorna o primeiro da fila e o remove dela
        System.out.println("Atenção cliente > " + clienteAtual + " < dirija-se ao atendimento." );
        System.out.println("");

        System.out.println("Fila atual: " + filaAtendimento);
        String clienteProximo = filaAtendimento.peek();// Retorna o primeiro elemento da fila sem remove-lo
        System.out.println("Atenção cliente > " + clienteProximo + " < você será chamado em breve.");
        System.out.println("");


        
        //filaAtendimento.clear();
        System.out.println("Fila atual: " + filaAtendimento);
        String clienteProximoOuErro = filaAtendimento.element();//Retorna o primeiro elemento da fila sem remove-lo casonão exista, retona um erro
        System.out.println("Atenção cliente > " + clienteProximoOuErro + " < você será chamado em breve.");
        System.out.println("");
        */
            
        Iterator<String> iteratorfilaAtendimento = filaAtendimento.iterator();

        while (iteratorfilaAtendimento.hasNext()) {
           try{ System.out.println("=========================================================================================================");
                System.out.println("Fila atual [" + filaAtendimento.size() + "]: " + filaAtendimento); //Imprime a fila
                clienteAtual = filaAtendimento.poll();// Retorna o primeiro da fila e o remove dela
                System.out.println("Atenção cliente > " + clienteAtual + " < dirija-se ao atendimento." );
                System.out.println("");
        
                System.out.println("Fila atual: " + filaAtendimento);
                clienteProximo = filaAtendimento.element();// Retorna o primeiro elemento da fila sem remove-lo
                System.out.println("Atenção cliente > " + clienteProximo + " < você será chamado em breve.");
                System.out.println("");
                System.out.println("");
             }   catch (java.util.NoSuchElementException e) {
                System.out.println(" A fila esta vazia? R: " + filaAtendimento.isEmpty());
                System.out.println(" ========== FILA VAZIA ========== ");
             }
        }
    }
}
