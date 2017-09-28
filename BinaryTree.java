

import java.util.LinkedList;
import java.util.Queue;


/**
 * @author Arpit
 * Node class to hold the data and pointers to left and right nodes.
 */
class Node{
	
	int data;
	Node leftNode;
	Node rightNode;
	public Node(int data, Node leftNode, Node rightNode) {
		super();
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
}

/**
 * @author Arpit
 * Traversing in BST can be classified into Preorder(DLR),inorder(LDR) and postorder(LRD) traversal.
 * All of these are Depth first. 
 * We can also do level order traversal i.e. Bredth first.
 * Assumption : Balancing is not handled
 */
public class BinaryTree {
	
	
	Node root;
	
	/**
	 * @param data
	 * @param trav
	 * Insert a new node in Binary Search tree
	 */
	public void insert(int data, Node trav)
	{
		Node temp = new Node(data,null,null);
		if(root == null)
		{
			root=temp;
			System.out.println(temp.data+"inserted as root!");
			return;
		}
		
		if(data<trav.data)
		{
			if(trav.leftNode!=null)
				insert(data,trav.leftNode);
			else
			{
				trav.leftNode=temp;
				System.out.println(temp.data+"inserted on left" + trav.data);
				return;
			}
		}
		else
		{
			if(trav.rightNode!=null)
				insert(data,trav.rightNode);
			else
			{
				trav.rightNode = temp;
				System.out.println(temp.data+"inserted on right"+trav.data);
				return;
			}
		}	
		
	}
	
	/**
	 * @param trav
	 * Traverse BST in preorder
	 */
	public void preorder(Node trav)
	{
		if(trav==null)
			return;
		System.out.println(trav.data);
		preorder(trav.leftNode);
		preorder(trav.rightNode);
		
	}
	
	/**
	 * @param trav
	 * Traverse BST in inorder
	 */
	public void inorder(Node trav)
	{
		if(trav==null)
			return;
		preorder(trav.leftNode);
		System.out.println(trav.data);
		preorder(trav.rightNode);
		
	}
	
	/**
	 * @param trav
	 * Traverse BST in postorder
	 */
	public void postorder(Node trav)
	{
		if(trav==null)
			return;
		preorder(trav.leftNode);
		preorder(trav.rightNode);
		System.out.println(trav.data);	
	}
	
	/**
	 * @param trav
	 * Traverse BST bredth first search
	 */
	public void bfs(Node trav)
	{
		Queue<Node> q = new <Node>LinkedList();
		q.add(trav);
		
		while(q.isEmpty()!=true)
		{
			Node temp = q.peek();
			System.out.println(temp.data);
			if(temp.leftNode!=null)
				q.add(temp.leftNode);
			if(temp.rightNode!=null)
				q.add(temp.rightNode);
			q.remove();
			
		}
		
	}
	
	/**
	 * @param trav
	 * Finding the maximum depth of the tree
	 */
	int maxDepth(Node node) 
    {
        if (node==null) 
            return 0;
        else
        {
             /* compute the depth of each subtree */
              int lDepth = maxDepth(node.leftNode);
              int rDepth = maxDepth(node.rightNode);

              /* use the larger one */
              if (lDepth > rDepth) 
                    return(lDepth+1);
              else 
                   return(rDepth+1);
       }
    } 
	
	

}
