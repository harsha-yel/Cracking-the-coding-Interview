package MyStackNQueue;
import java.lang.Math.*;
import java.util.EmptyStackException;
public class MyStack<T>{
	static class StackNode<T>{
		T data;
		StackNode<T> prev;
		public StackNode(T data)
		{
			this.data=data;
		}
	}

	private StackNode<T> top=null;
	public void push(T element){
		StackNode<T> t=new StackNode<T>(element);
		t.prev=top;
		top=t;
	}

	public T pop(){
		if(top==null) throw new EmptyStackException();
		T element=top.data;
		top=top.prev;
		return element;
	}

	public boolean isEmpty(){
		if(top==null) return true;
		else return false;
	}
	public T peek(){
		if(top==null) throw new EmptyStackException();
		return top.data;
	}
	public String display(){
		if(isEmpty()) System.out.println("Empty");
		String out="";
		StackNode<T> node=top;
		while(node!=null){
			out=out+node.data+" ";
			node=node.prev;
		}
		return new String(new StringBuffer(out).reverse());
	}
	
}