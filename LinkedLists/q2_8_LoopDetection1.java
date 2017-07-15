import myLinkedList.*;
public class q2_8_LoopDetection1{
	static Node loopDetect(LinkedList list){
		Node slow=list.head;
		Node fast=list.head;
		while(fast!=null&&fast.getNext()!=null){
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			if(slow==fast) break;
		}
		slow=list.head;
		while(slow!=fast){
			slow=slow.getNext();
			fast=fast.getNext();
		}
		return fast;		
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		int ar[]={1,2,3,4,5,6,7,8,9,10};
		list.generateFromArray(ar);
		System.out.println(list.getList());
		//making a linked list loop
		list.tail.setNext(list.head.getNext().getNext().getNext());
		//detect the loop node
		//we know the looping element, check with the written function:
		System.out.println("loop start node:"+list.head.getNext().getNext().getNext().getData());
		Node out=loopDetect(list);
		System.out.println("detected loop start from function:"+out.getData());
	}
}
