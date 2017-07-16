import MyStackNQueue.*;
public class StackTest{
	
	//generates radom stack of integers of given size
	public static void generateRandom(MyStack stack,int n){
		for(int i=0;i<n;i++)
			stack.push((int)(Math.random()*10));
	}
	public static void main(String[] args) {
		MyStack<Integer> stack=new MyStack<Integer>();
		generateRandom(stack,10);	
		System.out.println(stack.display());
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.display());		
	}
}