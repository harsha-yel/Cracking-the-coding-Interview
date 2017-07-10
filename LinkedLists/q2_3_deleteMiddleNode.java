import java.lang.Math.*;
public class q2_3_deleteMiddleNode{
	public static void main(String[] args) {
		myLinkedList.LinkedList list=new myLinkedList.LinkedList();
		list.generateRandom(10);
		System.out.println(list.getList());
		String str[]=list.getList().split(" ");
		int ele=Integer.parseInt(str[(int)(Math.random()*10)]);
		list.deleteElement(ele);
		System.out.println("Element of List-->"+ele+"-->"+list.getList());

	}
}