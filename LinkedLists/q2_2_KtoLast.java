public class q2_2_KtoLast{
	
	static int k2Last(int position,int size,myLinkedList.Node head){
		myLinkedList.Node currentNode=head;
		if(size-position<0){
			System.out.println("Entry exceeds the size");
			return 0;
		}
		for(int i=1;i<=size-position;i++)
				currentNode=currentNode.getNext();			
		return currentNode.getData();
	}
	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		int  position[]={155,6,1,2,8};
		list.generateRandom(10);
		int size=list.size();
		System.out.println(list.getList());
		for(int Iterator:position)
			System.out.println("position-"+Iterator+":"+k2Last(Iterator,size,list.head));
	}
}