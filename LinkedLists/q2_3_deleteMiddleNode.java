import java.lang.Math.*;

public class q2_3_deleteMiddleNode{
	static void deleteMiddleNode(myLinkedList.Node currentNode)
	{
		currentNode.setData(currentNode.getNext().getData());
		currentNode.setNext(currentNode.getNext().getNext());
	}

	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		list.generateRandom(10);
		System.out.println(list.getList());
		String str[]=list.getList().split(" ");
		int ele=Integer.parseInt(str[(int)(Math.random()*10)]);
		//Get the node of the correspoding element(back tracked from the random linked list)
		myLinkedList.Node currentNode=list.head;
		while(currentNode.getData()!=ele)
			currentNode=currentNode.getNext();
		deleteMiddleNode(currentNode);
		System.out.println("Element of List-->"+ele+"-->"+list.getList());

	}
}