//package SingleLinkedList;
import java.util.Scanner;
class Node{
	public Node next;
	public int data;
	public Node(int d){
		data=d;
		next=null;
	}
	public void setData(int d){ data=d;}
	public void setNext(Node p){next=p;}
	public Node getNext(){return next;}
	public int getData(){return data;}
	} 

class LinkedList{
	public Node head;
	public Node tail;
	public int listSize;
	public LinkedList(){
		head=null;
		tail=null;
		listSize=0;
	}

	public int size(){return listSize;}
	public boolean isEmpty(){ return listSize==0;}
	
	void printList(){
		Node currentNode=head;
		if(currentNode==null)
			System.out.println("list is empty");
		else{
			while(currentNode!=null){
				System.out.print(currentNode.getData()+" ");
				currentNode=currentNode.getNext();
			}
		}
	}
	void addBegin(int d){
		Node newNode=new Node(d);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			newNode.setNext(head);
			head=newNode;	
		}
		listSize++;
	}

	void addEnd(int d){
		Node newNode=new Node(d);
		Node currentNode=head;
		while(currentNode.getNext()!=null)
			currentNode=currentNode.getNext();
		currentNode.setNext(newNode);
		listSize++;


	}

	void addPosition(int d,int pos){
		Node newNode=new Node(d);
		Node currentNode=head;
		int i=1;
		if(pos==1)
			addBegin(d);
		else if(pos==listSize)
			addEnd(d);
		else{
			while(i++<pos-1)
				currentNode=currentNode.getNext();
			newNode.setNext(currentNode.getNext());
			currentNode.setNext(newNode);
			listSize++;
		}
	}

	void deleteBegin(){
		if(listSize==1)
			head=null;
		else
			head=head.getNext();
		listSize--;
	}

	void deleteEnd(){
		if(listSize==1)
			head=null;
		else{
			Node currentNode=head;
			while(currentNode.getNext().getNext()!=null)
				currentNode=currentNode.getNext();
			currentNode.setNext(null);
		}
		listSize--;
	}

	void deletePosition(int pos){
		Node currentNode=head;
		int i=1;
		if(pos==1) deleteBegin();
		else if(pos==listSize) deleteEnd();
		else{
			while(i++<pos-1)
				currentNode=currentNode.getNext();
			currentNode.setNext(currentNode.getNext().getNext());
			listSize--;
	}
}
	void deleteElement(int ele){
		Node currentNode=head;
		while(currentNode.getNext().getData()!=ele)
			currentNode=currentNode.getNext();
		currentNode.setNext(currentNode.getNext().getNext());
		listSize--;
	}
}

public class SingleLinkedList{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int ele=0;
		int pos=0;
		while(true){
		System.out.println("\nLinked list operations:");
		System.out.println("1.Add element at beginning");
		System.out.println("2.Add element at position");
		System.out.println("3.Add element at ending");
		System.out.println("4.Delete a element at begining");
		System.out.println("5.Delete an element at a position");
		System.out.println("6.Delete an element at ending");
		System.out.println("7.Delete an element:");
		System.out.println("Enter a choice:");

		int n=sc.nextInt();
		switch(n){
			case 1: System.out.println("Enter element to be inserted:");
					ele=sc.nextInt();
					list.addBegin(ele);
					list.printList();
					break;

			case 2: System.out.println("Enter element to be inserted and position:");
					ele=sc.nextInt();
					 pos=sc.nextInt();
					list.addPosition(ele,pos);
					list.printList();
					break;

			case 3: System.out.println("Enter element to be inserted:");
					ele=sc.nextInt();
					list.addEnd(ele);
					list.printList();
					break;

			case 4: System.out.println("delete at start:");
					list.deleteBegin();
					list.printList();
					break;


			case 5: System.out.println("delete at position:");
					pos=sc.nextInt(); 
					list.deletePosition(pos);
					list.printList();
					break;

			case 6: System.out.println("delete at end:");
					list.deleteEnd();
					list.printList();
					break;

			case 7: System.out.println("delete the element:");
					ele=sc.nextInt();
					list.deleteElement(ele);
					list.printList();
					break;

		}
	}
	}

}

