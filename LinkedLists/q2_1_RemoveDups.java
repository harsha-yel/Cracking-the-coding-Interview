import java.util.*;
public class q2_1_RemoveDups{
	public static void main(String[] args) {
		myLinkedList.LinkedList	list=new myLinkedList.LinkedList();
		int size=10;
		list.generateRandom(size);
		System.out.println(list.getList());
		HashSet<Integer> set=new HashSet<Integer>();
		
		String str[]=list.getList().split(" ");	
		for(int i=0;i<size;i++){
			int element=Integer.parseInt(str[i]);
			if(set.contains(element))
				list.deleteElement(element);
			else
				set.add(element);
		}
		System.out.print(list.getList());

	}
}