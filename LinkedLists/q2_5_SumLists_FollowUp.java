import myLinkedList.*;
class PartialSum{
	int carry=0;
	Node sum=null;
}

public class q2_5_SumLists_FollowUp{

	static void paddingZeros(LinkedList list,int len){		
		for(int i=0;i<len;i++)
			 list.addBegin(0);
	}

	static Node sumLists(LinkedList list1,LinkedList list2){
		int len1=list1.size();
		int len2=list2.size();
		if(len1>len2) paddingZeros(list2,len1-len2);
		else paddingZeros(list1,len2-len1);
		PartialSum sum=add(list1.head,list2.head);
		if(sum.carry==0) return sum.sum;
		else{
			Node res=insertBefore(sum.sum,sum.carry);
			return res;
		}
		
	}

	static PartialSum add(Node list1,Node list2){
		if(list1==null&&list2==null){
			PartialSum sum=new PartialSum();
			return sum; 
		}
		PartialSum sum=add(list1.getNext(),list2.getNext());
		int val=sum.carry+list1.getData()+list2.getData();
		Node full_result=insertBefore(sum.sum,val%10);
		sum.sum=full_result;
		sum.carry=val/10;
		return sum;
	}

	static Node insertBefore(Node list,int data){
		Node node=new Node(data);
		if(list!=null)
			node.setNext(list);
		return node;
	}

	public static void main(String[] args) {
		LinkedList list1= new LinkedList();
		LinkedList list2= new LinkedList();
		Node out= new Node(0);
		list1.generateRandom(4);
		list2.generateRandom(4);
		out=sumLists(list1,list2);
		System.out.println(list1.getList()+" \n"+list2.getList());
		while(out!=null){
			System.out.print(out.getData()+" ");
			out=out.getNext();
		}	
	}
}