
public class ArrayQueue<E> implements Queue<E> {
	
	private E[] array;
	private int nElem;
	private int front;
	private int back;
	private int maxElem;
	
	public ArrayQueue(int nElem) {
		this.array = (E[]) new Object[nElem];
		this.nElem = 0;
		this.front = 0;
		this.back = -1;
		this.maxElem = nElem;
	}
	
	public boolean isFull() {
		return this.nElem == this.array.length;
	}
	
	public void enqueue(E x) {
		if(!this.isFull()) {
			this.back = (this.back + 1) % this.maxElem;
			this.array [this.back] = x;
			this.nElem ++;
			
		}
		else 
			System.out.println("Cannot add to a full queue......");
	}
	public E dequeue() throws ExceptionIsEmpty{
		if (this.isEmpty())
			throw new ExceptionIsEmpty("Cannot remove from an empty queue.....");
		E aux = this.array[this.front];
		this.front = (this.front + 1) % this.maxElem;
		this.nElem --;
		return aux;
		
	}
	public E front() throws ExceptionIsEmpty{
		return null;
		
	}
	public E back() throws ExceptionIsEmpty{
		return null;
		
	}
	
	public boolean isEmpty() {
		return this.nElem == 0 ;
	}

}
