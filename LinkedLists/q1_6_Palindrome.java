import myLinkedList.*;
import java.util.*;
public class q1_6_Palindrome{

	static boolean palindrome(myLinkedList.LinkedList list){
		myLinkedList.Node p1=list.head;
		Stack<Integer> s=new Stack<Integer>();
		myLinkedList.Node p2=list.head;
		boolean flag=false;
		while(p2!=null){
			//In case of odd length list
			if(p2.getNext()==null) {flag=true;break;}
			s.push(p1.getData());
			p1=p1.getNext();
			p2=p2.getNext().getNext();
		}
		//For odd length list, middle element can be neglected for comaparison.
		if(flag==true) p1=p1.getNext();
		while(p1!=null){
			if(s.pop()!=p1.getData()) return false;
			p1=p1.getNext();
		}
	return true;
	}
	public static void main(String[] args) {
		myLinkedList.LinkedList list= new myLinkedList.LinkedList();
		int[] ar={1,2,3,2,1};
		list.generateFromArray(ar);
		System.out.println(list.getList());
		System.out.println(palindrome(list));
	}
}