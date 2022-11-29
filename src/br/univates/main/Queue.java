package br.univates.main;

/// Source: http://sites.poli.usp.br/p/fabio.cozman/Didatico/Comp/Material/estruturas.pdf

public class Queue {
	
	private Object queue[];
	private int size;
	private int indexOut;
	private int indexIn;
	static private final int DEFAULT = 10;
	
	public Queue()
	{
		queue = new Object[DEFAULT];
		clear();
	}
	
	public int size()
	{
		return size;
	}
	
	public void clear()
	{
		size = 0;
		indexOut = 0;
		indexIn = queue.length -1;
		
	}
	
	public int increment(int index)
	{
		index++;
		if(index == queue.length)
		{
			index = 0;
		}

		return index;
	}
	
	public void enqueue(Object o)	
	{
		if(size == queue.length)
		{
			doubleSize();
		}
		indexIn = increment(indexIn);
		queue[indexIn] = o;
		size++;
	}
	
	public Object dequeue()
	{
		if(size == 0)
		{
			return null;
		}
		size--;
		Object o = queue[indexOut];
		indexOut = increment(indexOut);

		return o;
	}
	
	public void doubleSize()
	{
		Object newQueue[] = new Object[2 * queue.length];
		for(int i = 0; i < size; i++)
		{
			newQueue[i]  = queue[indexOut];
			indexOut = increment(indexOut);
		}
		queue = newQueue;
		indexOut = 0;
		indexIn = size -1;
	}
	
	public void print() {
		System.out.print("[");
		for(int i = 0; i < queue.length; i++) {
			if(queue[i] != null) {
				System.out.print(queue[i] + ",");
			}
		}
		System.out.print("]");
	}
}
