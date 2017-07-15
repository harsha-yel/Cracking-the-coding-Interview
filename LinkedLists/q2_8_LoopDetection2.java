import myLinkedList.*;
import java.util.*;
public class q2_8_LoopDetection2{
	
	static Node loopDetect(myLinkedList.LinkedList list){
		HashSet<myLinkedList.Node> set=new HashSet<myLinkedList.Node>();
		myLinkedList.Node head=list.head;
		while(true){
		if(set.contains(head))
			return head;
		else
			set.add(head);
		head=head.getNext();
		}
	
	}
	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		int ar[]={1,2,3,4,5,6,7,8,9,10};
		list.generateFromArray(ar);
		System.out.println(list.getList());
		//making a linked list loop
		list.tail.setNext(list.head.getNext().getNext());
		//detect the loop node
		//we know the looping element, check with the written function:
		System.out.println("loop start node:"+list.head.getNext().getNext().getData());
		myLinkedList.Node out=loopDetect(list);
		System.out.println("detected loop start from function:"+out.getData());
	}
}
