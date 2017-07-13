import myLinkedList.*;
import java.lang.Math.*;
public class q2_5_SumLists_reverse2Recursive{

	static Node sumLists(Node list1,Node list2, int carry){
		if(list1==null&&list2==null&&carry==0)
			return null;
		Node out=new Node(0);
		int value=carry;
		
		if(list1!=null) value+=list1.getData();
		if(list2!=null) value+=list2.getData();
		out.setData(value%10);
		if(list1!=null||list2!=null){
			Node more=sumLists(list1==null?null:list1.getNext(),list2==null?null:list2.getNext(),value>9?1:0);
			out.setNext(more);
			}
		return out;
	}


	public static void main(String[] args) {
		LinkedList list1= new LinkedList();
		LinkedList list2= new LinkedList();
		Node out= new Node(0);
		list1.generateRandom(3);
		list2.generateRandom(5);
		out=sumLists(list1.head,list2.head,0);
		System.out.println(list1.getList()+" \n"+list2.getList());
		while(out!=null){
			System.out.print(out.getData()+" ");
			out=out.getNext();
		}
	}
}