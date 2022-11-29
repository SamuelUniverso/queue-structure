package br.univates.test;

import org.junit.Test;

import br.univates.main.Queue;

public class TesteQueue {
	
	@Test
	public void testQueue()
	{
		Queue q = new Queue();
		q.enqueue("Frango com Catupiry");
		q.enqueue("Calabresa");
		q.enqueue("Quatro Queijos");
		
		q.print();
	}

}
