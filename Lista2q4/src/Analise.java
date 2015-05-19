import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Analise {
	public static void main(String[] args) {
		
	    /**
	     * Citando estas duas caracteristicas iniciais do treeset e do LinkedHashSet 
	     * TreeSet = Pelo fato de ele implementar SortedSet 
	     * ele possui elementos ordenados automaticamente, 
	     * ou seja, independente da ordem que voc� inserir os elementos,
	     *  eles ser�o ordenados. Mas isso tem um custo, a complexidade 
	     *  para os m�todos add, remove e contains
	     *  
	     *  o Bate papo do facebook ou a sistema de envio 
	     *  eh categorizado da segunte forma
	     *  as mensagens nao precisam ser ordenada
	     *  somente precisa-se colocar elas na ordem de inser�ao
	     *  pois cada mensagem eh uma cadeia de falas
	     *  assim caracteristica de uma lista encadeada
	     *  
	     *  LinkedHashSet = que � um meio termo entre HashSet e TreeSet, 
	     *  ou seja, ela nos proporciona um pouco da performance do HashSet 
	     *  e um pouco do poder de ordena��o do TreeSet. O LinkedHashSet 
	     *  faz uso tamb�m do HashTable com linked list, ou seja, temos 
	     *  aqui a seguinte situa��o: Os elementos continuam na ordem que s�o inseridos
	     *  
	     *  dessa maneira nao eh necessario termons uma chave ou codigo para ordenar a conversa
	     *  apenas a inser�ao natura dos textos vai fazer ela funcionar conforme os requisitos 
	     *  naturalmente
	     *  
	     *  Segue abaixo o teste de performace do uso delas duas  
	     */
		
		
		
		Random r = new Random();
		Set<Mensagem> BatepapoComtreeSet = new TreeSet<>();
		Set<Mensagem> BatepapoComlinkedSet = new LinkedHashSet<>();
		long  startTime, endTime, durationTree,durationLinked;
	
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			BatepapoComtreeSet.add(new Mensagem(x, "aleatorio " + i));
		}
	
		endTime = System.currentTimeMillis();
		durationTree = endTime - startTime;
		System.out.println("Bate papo Com TreeSet: " + durationTree);
		// Tempo de Inicio
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			BatepapoComlinkedSet.add(new Mensagem(x, "aleatorio " + i));
		} // end time
		endTime = System.currentTimeMillis();
		durationLinked = endTime - startTime;
		System.out.println("Bate papo Com LinkedHashSet: " + durationLinked);
		
		System.out.println("Difenre�a (Tree-Linked) = "+(durationTree-durationLinked));
		
	}

}
