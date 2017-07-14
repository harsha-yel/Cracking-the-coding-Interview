import myLinkedList.*;
public class q1_6_Palindrome{

	static boolean palindrome(LinkedList list){
		Node head=list.head;
		Node tail=list.tail;
		int i=0;
		while(i++<list.size()){
			if(head.getData()!=tail.getData()) return false;
			head=head.getNext();
			tail=tail.getPrev();
		}
	return true;
	}
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		int[] ar={1,2,1,2,1};
		list.generateFromArray(ar);
		System.out.println(list.getList());
		System.out.println(palindrome(list));
	}
}