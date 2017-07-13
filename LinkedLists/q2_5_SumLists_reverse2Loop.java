import myLinkedList.*;
import java.lang.Math.*;
public class q2_5_SumLists_reverse2Loop{

	static LinkedList sumLists(LinkedList list1,LinkedList list2){
		LinkedList out=new LinkedList();
			Node currentNode1=list1.head;
			Node currentNode2=list2.head;
			int carry=0;
			while(currentNode1!=null||currentNode2!=null){
				int data1=(currentNode1==null)?0:currentNode1.getData();
				int data2=(currentNode2==null)?0:currentNode2.getData();
				int data=data1+data2;
				if(carry+data>9){
					int sum=(carry+data)%10;
					out.addEnd(sum);
					carry=1;
				}
				else{
					out.addEnd(data+carry);
					carry=0;
				}
				currentNode1=currentNode1==null?null:currentNode1.getNext();
				currentNode2=currentNode2==null?null:currentNode2.getNext();
			}
			if(carry==1) out.addEnd(1);
			return out;
		}

	public static void main(String[] args) {
		LinkedList list1= new LinkedList();
		LinkedList list2= new LinkedList();
		LinkedList out= new LinkedList();
		list1.generateRandom(3);
		list2.generateRandom(4);
		out=sumLists(list1,list2);
		System.out.println(list1.getList()+" \n"+list2.getList());
		System.out.println(out.getList());
	}
}