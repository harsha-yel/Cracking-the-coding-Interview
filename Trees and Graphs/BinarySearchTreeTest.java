//package MyTrees;
import java.util.Arrays;
class TreeNode{
	int data=-1;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
	public TreeNode(){}
	public TreeNode getLeft(){return left;}
	public TreeNode getRight(){return right;}
	public void setRight(TreeNode right){this.right=right;}
	public void setLeft(TreeNode left){this.left=left;}
	public int getData(){return data;}
	public void setData(int data){this.data=data;}
}

class BinarySearchTree{
	static TreeNode root=null;
	
	public void insert(int data){
		if(root==null)
		{
			root=new TreeNode(data);
			return;
		}//	System.out.println(data);
		
		TreeNode runner=root;
		while(true){
			if(runner.getData()>data){
				if(runner.getLeft()==null){
					runner.setLeft(new TreeNode(data));
					return;
				}
				else runner=runner.getLeft();
			}
			else if(runner.getData()<data){
				if(runner.getRight()==null){
					runner.setRight(new TreeNode(data));
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
		TreeNode runner=root;
		while(true){
			if(runner.getData()==data){
				if(runner.getNext()==null)
			}
		}

	}
*/	
	public boolean search(int data){
			TreeNode runner=root;
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
	
	public void inorder(TreeNode root){
		if(root!=null){
			inorder(root.getLeft());
		 	System.out.print(root.getData()+",");
			inorder(root.getRight());
		}
	}

	public void postorder(TreeNode root){
		if(root!=null){
			postorder(root.getLeft());
			postorder(root.getRight());
		 	System.out.print(root.getData()+",");

		}
	}
	public void preorder(TreeNode root){
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