package MyStackNQueue;
import java.util.NoSuchElementException;
public class MyQueue<T>{
	static class QueueNode<T>{
		T data;
		QueueNode<T> next;
		public QueueNode(T data)
		{
			this.data=data;
		}
	}

	private QueueNode<T> front=null;
	private QueueNode<T> rear=null;
	public void add(T element){
		QueueNode<T> t=new QueueNode<T>(element);
		if(rear!=null) rear.next=t;
		rear=t;
		if(front==null)	front=rear;
	}

	public T remove(){
		if(isEmpty()) throw new NoSuchElementException();
		T element=front.data;
		front=front.next;
		if(front==null) rear=null; 
		return element;
	}

	public boolean isEmpty(){
		return front==rear;
	}
	public T peek(){
		if(isEmpty()) throw new NoSuchElementException();
		return front.data;
	}

	public String display(){
		if(isEmpty()) System.out.println("Empty");
		String out="";
		QueueNode<T> node=front;
		while(node!=null){
			out=out+node.data+" ";
			node=node.next;
		}
		return out;
	}
}