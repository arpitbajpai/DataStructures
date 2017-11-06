import java.util.HashMap;
import java.util.Map;

/**
 * @author Arpit
 * Trie Node class to hold the data and children
 */
class TrieNode
{
	char data;
	Map <Character,TrieNode> children;
	boolean leaf;
	
	public TrieNode()
	{
		children = new HashMap<Character,TrieNode> ();
	}
	
	public TrieNode(char data) {
		this.data = data;
		children = new HashMap<Character,TrieNode> ();
	}
	
	public TrieNode(char data, boolean leaf) {
		this.data = data;
		this.leaf = leaf;
		children = new HashMap<Character,TrieNode> ();
	}

}

/**
 * @author Arpit
 * Trie implementation with insert and search functions
 */
public class Trie {
	TrieNode root = new TrieNode();
	
	/**
	 * @param string
	 * Function to insert a String in Trie
	 */
	public void insert(String s)
	{
		TrieNode iter = root;
		for (int i=0;i<s.length();i++)
		{
			char temp = s.charAt(i);
		
			if(!iter.children.containsKey(temp))
			{
				if(i!=s.length()-1)
				{
					iter.children.put(temp,new TrieNode(temp));
					iter = iter.children.get(temp);	
				}
				else
					iter.children.put(temp,new TrieNode(temp,true));
			}
			else
				iter = iter.children.get(temp);				
		}
	}
	
	/**
	 * Function to check if the given key is present in Trie
	 * @param key
	 * @return true or false
	 */
	public boolean search(String key)
	{
		TrieNode iter = root;
		for(int i=0;i<key.length();i++)
		{
			char temp = key.charAt(i);
			if(iter.children.containsKey(temp))
				iter = iter.children.get(temp);
			else
				return false;
			
		}
		if(iter.leaf==true)
			return true;
		return false;
	}
	
}
