import java.util.*;
public class q2_1_RemoveDupsWithoutBuffer{
	public static void main(String[] args) {
		myLinkedList.LinkedList	list=new myLinkedList.LinkedList();
		int size=10;
		list.generateRandom(size);
		System.out.println(list.getList());
		myLinkedList.Node currentNode=list.head;
		while(currentNode!=null){	
			int data=currentNode.getData();
			myLinkedList.Node runner=currentNode.getPrev();
			while(runner!=null)
			{
				if(data==runner.getData())
				list.deleteElement(runner.getData());
				runner=runner.getPrev();
			}
			currentNode=currentNode.getNext();
		}
		System.out.println(list.getList());

	}
}