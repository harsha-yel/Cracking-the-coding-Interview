public class q2_4_partition{

	static void partition(myLinkedList.Node head,int x){
		myLinkedList.Node currentNode=head;
		myLinkedList.LinkedList left=new myLinkedList.LinkedList();
		myLinkedList.LinkedList right=new myLinkedList.LinkedList();
		while(currentNode!=null){
			int data=currentNode.getData();
			if(data<x){
				if(left.head==null)
					left.addBegin(data);	
				else 
					left.addEnd(data);
			}	
			else if(data==x) right.addBegin(data);
			else{
				if(right.head==null)
					right.addBegin(data);		
				else
					right.addEnd(data);
			}	
			currentNode=currentNode.getNext();
		}		
		
		left.tail.setNext(right.head);
		System.out.println("parition-->"+x+"\n"+left.getList());
	}
	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		list.generateRandom(10);
		System.out.println(list.getList());
		int x=Integer.parseInt(list.getList().split(" ")[(int)(Math.random()*10)]);
		partition(list.head,x);

	}
}