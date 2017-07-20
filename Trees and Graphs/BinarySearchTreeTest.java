//package MyTrees;
import java.util.Arrays;
class Node{
	int data=-1;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
	public Node(){}
	public Node getLeft(){return left;}
	public Node getRight(){return right;}
	public void setRight(Node right){this.right=right;}
	public void setLeft(Node left){this.left=left;}
	public int getData(){return data;}
	public void setData(int data){this.data=data;}
}

class BinarySearchTree{
	static Node root=null;
	
	public void insert(int data){
		if(root==null)
		{
			root=new Node(data);
			return;
		}//	System.out.println(data);
		
		Node runner=root;
		while(true){
			if(runner.getData()>data){
				if(runner.getLeft()==null){
					runner.setLeft(new Node(data));
					return;
				}
				else runner=runner.getLeft();
			}
			else if(runner.getData()<data){
				if(runner.getRight()==null){
					runner.setRight(new Node(data));
					return;
				}
				else runner=runner.getRight();
			}
			else {
				System.out.println("already exists,cannot insert duplicate");
			}

		}

	}
/*
	public void delete(int data){
		if(root==null){System.out.println("Empty tree");return;}
		Node runner=root;
		while(true){
			if(runner.getData()==data){
				if(runner.getNext()==null)
			}
		}

	}
*/	
	public boolean search(int data){
			Node runner=root;
			while(true){
				if(runner==null) {
					System.out.println("Empty tree");
					return false;
				}
				else if(runner.getData()==data) return true;
				else if(data<runner.getData()) runner=runner.getLeft();
				else if(data>runner.getData()) runner=runner.getRight();
			}
			//return false;
				
	}
	
	public void inorder(Node root){
		if(root!=null){
			inorder(root.getLeft());
		 	System.out.print(root.getData()+",");
			inorder(root.getRight());
		}
	}

	public void postorder(Node root){
		if(root!=null){
			postorder(root.getLeft());
			postorder(root.getRight());
		 	System.out.print(root.getData()+",");

		}
	}
	public void preorder(Node root){
		if(root!=null){
		 	System.out.print(root.getData()+",");
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}

	public void arrayToTree(int[] ar){
		for(int i=0;i<ar.length;i++)
			insert(ar[i]);
	}

}

public class BinarySearchTreeTest{
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		int ar[]={6,1,4,2,3,7,9,8,10};
		tree.arrayToTree(ar);
		System.out.println("Elements inserted:"+Arrays.toString(ar));
		System.out.print("\nIn Order:");
		tree.inorder(tree.root);
		System.out.print("\nPost Order:");
		tree.postorder(tree.root);
		System.out.print("\nPre Order:");
		tree.preorder(tree.root);
		System.out.println("\nElement searched:"+tree.search(11));
	}
}