public class q2_2_KtoLast{
	
	static int k2Last(int position,myLinkedList.Node head){
		myLinkedList.Node currentNode=head;
		myLinkedList.Node p1=head;
		myLinkedList.Node p2=head;
		int i=1;
		//if(size-posi)
		while(i<=position){
			p2=p2.getNext();
			i++;	
		}
		while(p2!=null)
		{	
			p1=p1.getNext();
			p2=p2.getNext();
		}
		return p1.getData();
	}
	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		int  position[]={3,6,1,2,8};
		list.generateRandom(10);
		System.out.println(list.getList());
		for(int Iterator:position)
			System.out.println("position-"+Iterator+":"+k2Last(Iterator,list.head));
	}
} 