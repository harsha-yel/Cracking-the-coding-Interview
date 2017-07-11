import myLinkedList.*;
import java.lang.Math.*;
public class q2_5_SumLists_reverse1{
	static LinkedList sumLists(LinkedList list1,LinkedList list2){
		int num1=getNumber(list1);
		int num2=getNumber(list2);
		int result=num1+num2;
		//convert the result into a linked list
		LinkedList out=new LinkedList();
		int length=0;int res=result;
		while(res>0){
			res=res/10;
			length++;
		}
		while(length>0)
		{
			out.addBegin(result/(int)Math.pow(10,length-1));
			result=result%(int)Math.pow(10,length-1);
			length--;
		}

		return out;
	}

	static int getNumber(LinkedList list){
		Node currentNode=list.head;
		int length=1;
		currentNode=list.head;
		int num=0;
		while(currentNode!=null){
			num=num+(length*currentNode.getData());
			currentNode=currentNode.getNext();
			length=length*10;
		}
		return num;
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