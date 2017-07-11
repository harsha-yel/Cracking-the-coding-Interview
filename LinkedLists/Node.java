package myLinkedList;
public class Node{
		public Node next;
		public Node prev;
		public int data;
		public Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		public void setData(int data){ this.data=data;}
		public int getData(){return data;}

		public void setNext(Node next){this.next=next;}
		public Node getNext(){return next;}
		
		public void setPrev(Node prev){this.prev=prev;}
		public Node getPrev(){return prev;}
	} 
