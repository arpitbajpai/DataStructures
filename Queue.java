/**
 * Queue class with defined enqueue, dequeue operation
 * @author Arpit
 *
 */
public class Queue {
	int front;
	int rear;
	double []arr;
	int size;
	int consumed;
	
	/**
	 * Constructor to set the initial values of front, rear and the queue size.
	 * @param size
	 */
	public Queue(int size) {
		this.size = size;
		consumed = 0;
		front = 0;
		rear = -1;
		arr = new double[size];
		
	}

	/**
	 * Method to insert element in the queue.
	 * @param element
	 */
	public void enqueue(int element)
	{
		if(isFull())
			throw new RuntimeException("Queue is Full!");
		rear = (rear+1)%size;
		arr[rear]=element;
		consumed++;
	}
	
	/**
	 * Method to remove element from the queue
	 * @return element
	 */
	public double dequeue()
	{
		if(isEmpty())
			throw new RuntimeException("Queue is Empty!");
		
		double element = arr[front];
		front = (front+1)%size;
		consumed--;
		return element;
	}
	
	/**
	 * Method to check if queue is empty or not
	 * @return boolean
	 */
	public boolean isEmpty()
	{
		return (consumed == 0);
	}
	
	/**
	 * Method to check if queue is full or not
	 * @return boolean
	 */
	public boolean isFull()
	{
		return (size==consumed);
	}
	
}
