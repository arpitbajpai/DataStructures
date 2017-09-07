import java.util.Vector;

/**
 * @author Arpit
 *Node class to store a list for a particular key in case of collisions
 * @param <T>
 */
class Node<T>{
	String key;
	T value;
	
	public Node(String key, T value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}

/**
 * Hashtable Implementation without chaining
 *
 */
public class HashTable <T>{
	
	Vector<Node<T>> []arr = new Vector[20];
	
	/**
	 * @param key
	 * @return Simple Hashfunction to return hash based on the key
	 */
	private int hash(String key)
	{
		int hash = 7;
		for (int i = 0; i < key.length(); i++) 
		    hash = (hash*31 + key.charAt(i))%20;
		return hash;
	}
	
	/**
	 * Method to insert element in hashtable
	 * @param key
	 */
	public void insert(String key, T value)
	{
		if(arr[hash(key)]==null)
			arr[hash(key)] = new <Node>Vector();
		arr[hash(key)].addElement(new Node<T>(key,value));;
	}
	
	/**
	 * Method to check if the element is present in hashtable or not
	 * @param key
	 * @return
	 */
	public T retrieve(String key)
	{
		if(arr[hash(key)]==null)
			throw new RuntimeException("Key not found");
		for(int i=0;i<arr[hash(key)].capacity();i++)
		{
			if(arr[hash(key)].get(i).key==key)
				return (T) arr[hash(key)].get(i).value;	
		}
		throw new RuntimeException("Key not found");
	}

}
