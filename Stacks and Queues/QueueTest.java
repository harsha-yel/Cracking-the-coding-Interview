import MyStackNQueue.*;
public class QueueTest{
	//generates random stack of integers of given size
	public static void generateRandom(MyQueue queue,int n){
		for(int i=0;i<n;i++)
			queue.add((int)(Math.random()*10));
	}
	public static void main(String[] args) {
		MyQueue<Integer> queue=new MyQueue<Integer>();
		generateRandom(queue,10);	
		System.out.println(queue.display());
		queue.remove();
		queue.remove();
		System.out.println(queue.peek());
		System.out.println(queue.display());		
	}
}