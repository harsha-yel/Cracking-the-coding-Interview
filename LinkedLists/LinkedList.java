package myLinkedList;
import java.util.Scanner;
import java.lang.Math.*;

public class LinkedList{
	
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
	
	public String getList(){
		Node currentNode=head;
		String out="";
		if(currentNode==null)
			System.out.println("list is empty");
		else{
			while(currentNode!=null){
				//System.out.print(curreneNode.getData()+" ");
				out=out+currentNode.getData()+" ";
				currentNode=currentNode.getNext();
			}
		}
		return out;
	}
	public void addBegin(int d){
		Node newNode=new Node(d);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			newNode.setNext(head);
			newNode.getNext().setPrev(newNode);
			head=newNode;	
		}
		listSize++;
	}

	public void addEnd(int d){
		Node newNode=new Node(d);
		Node currentNode=tail;
		currentNode.setNext(newNode);
		newNode.setPrev(currentNode);
		tail=newNode;
		listSize++;
	}

	public void addPosition(int d,int pos){
		Node newNode=new Node(d);
		Node currentNode=head;
		int i=1;
		if(pos==1)
			addBegin(d);
		else if(pos>=listSize)
			addEnd(d);
		else{
			while(i++<pos-1)
				currentNode=currentNode.getNext();
			newNode.setNext(currentNode.getNext());
			newNode.setPrev(currentNode);
			currentNode.getNext().setPrev(newNode);
			currentNode.setNext(newNode); 
			listSize++;
		}
	}

	public void deleteBegin(){
		if(listSize==1)
			{head=null;tail=null;}
		else{
			head=head.getNext();
			head.setPrev(null);
		}
		listSize--;
	}

	public void deleteEnd(){
		if(listSize==1)
			{head=null;tail=null;}
		else{
			Node currentNode=tail.getPrev();
			currentNode.setNext(null);
			tail=currentNode;
		}
		listSize--;
	}

	public void deletePosition(int pos){
		Node currentNode=head;
		int i=1;
		if(pos==1) deleteBegin();
		else if(pos>=listSize) deleteEnd();
		else{
			while(i++<pos-1)
				currentNode=currentNode.getNext();
			currentNode.setNext(currentNode.getNext().getNext());
			currentNode.getNext().setPrev(currentNode);
			listSize--;
	}
}
	public void deleteElement(int ele){
		Node currentNode=head;
		if(currentNode.getData()==ele) deleteBegin();
		else if(tail.getData()==ele) deleteEnd();
		else
			{
				while(currentNode.getNext().getData()!=ele)
					currentNode=currentNode.getNext();
				currentNode.setNext(currentNode.getNext().getNext());
				currentNode.getNext().setPrev(currentNode);
				listSize--;
			}
		}

	public void generateRandom(int n){
		for(int i=1;i<n;i++)
			addPosition((int)(Math.random()*10),i);
		addEnd((int)(Math.random()*10));
	}

}

