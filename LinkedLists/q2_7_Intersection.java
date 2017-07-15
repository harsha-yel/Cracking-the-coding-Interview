import myLinkedList.*;
public class q2_7_Intersection{
	static int getsize(LinkedList l){
		int len=0;
		Node p=l.head;
		while(p!=null){
			len++;
			p=p.getNext();
		}
		return len;
	}
	static Node nodeIntersect(LinkedList list1,LinkedList list2){
		int len1=getsize(list1);
		int len2=getsize(list2);
		Node p1=list1.head;
		Node p2=list2.head;
		if(len2>len1)
			for(int i=0;i<len2-len1;i++)
				p2=p2.getNext();

		if(len2<len1)
			for(int i=0;i<len1-len2;i++)
				p1=p1.getNext();
		while(p1!=null&&p2!=null){
			if(p1==p2) return p1;
			p1=p1.getNext();
			p2=p2.getNext();
		}
		return null;
	}
	public static void main(String[] args) {
		LinkedList list1= new LinkedList();
		LinkedList list2= new LinkedList();
		//Generating two linked lists such that the scond list is merged to the node 
		// of the first list.
		list1.addBegin(15);
		list1.head.setNext(new Node(5));
		list1.head.getNext().setNext(new Node(10));
		list1.head.getNext().getNext().setNext(new Node(15));

		list2.addBegin(3);
		list2.head.setNext(new Node(2));
		list2.head.getNext().setNext(new Node(1));
		list2.head.getNext().getNext().setNext(list1.head.getNext().getNext());

		System.out.println(list1.getList());
		System.out.println(list2.getList());
		System.out.println("Intersection Node:");
		Node out= nodeIntersect(list1,list2);
		System.out.print(out.getData());
	
}
}