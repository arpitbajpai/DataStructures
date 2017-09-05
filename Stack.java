/**
 * Class to throw an Exception when the stack is empty.
 * @author Arpit
 * 
 */
class EmptyStackException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	public EmptyStackException(String message) {
		super(message);
		
	}
	
}

/**
 * Class to throw an Exception when the stack is empty.
 * @author Arpit
 * 
 */
class FullStackException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FullStackException(String message) {
		super(message);
		
	}
	
}

/**
 * Stack class with defined push, pop operations
 * @author Arpit
 *
 */
public class Stack {
	
	/**
	 * Pointer to the top of the stack
	 */
	int top;
	
	/**
	 * Data structure to hold stack elements
	 */
	double [] arr;
	
	/**
	 * Size of the stack
	 */
	int size;
		
	/**
	 * Constructor with given stack size
	 * @param size
	 */
	public Stack(int size) {
		this.top = -1;
		this.size = size;
		arr = new double[size];
	}

	/**
	 * Method to push element in the stack
	 * @param element
	 * @throws FullStackException if the stack is full
	 */
	public void push(double element)
	{
		if(top==size-1)
			throw new FullStackException("Stack is Full!");
		top++;
		arr[top]=element;
	}

	
	/**
	 * Method to pop element from the stack
	 * @return element
	 * @throws EmptyStackException if the stack is empty
	 */
	public double pop() throws EmptyStackException
	{
		if(top!=-1)
		{
			double element= arr[top];
			top--;
			return element;
		}
		else
			throw new EmptyStackException("Stack Already Empty!");
		
	}
	
	/**
	 * Method to check if stack is empty or not
	 * @return true if stack is empty
	 */
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
}




