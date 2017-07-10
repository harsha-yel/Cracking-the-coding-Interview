public class q2_4_partition{

	static void partition(myLinkedList.LinkedList list,int x){
		myLinkedList.Node currentNode=list.head;
		myLinkedList.Node left=null;
		myLinkedList.Node right=null;
		while(currentNode!=null){
			int data=currentNode.getData();
			if(data<x){
				left=currentNode;

			}
				
			currentNode=currentNode.getNext();
		}		
   		System.out.println("partition-->"+x+"\n"+list.getList());

	}
	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		list.generateRandom(10);
		System.out.println(list.getList());
		int x=Integer.parseInt(list.getList().split(" ")[(int)(Math.random()*10)]);
		partition(list,x);

	}
}