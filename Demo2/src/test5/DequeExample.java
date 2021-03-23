package test5;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeExample {
public static void main(String args[])
{
	ArrayDeque<Integer> que=new ArrayDeque<Integer>();
	{
		que.add(5);
		que.add(3);
		que.add(1);
		que.add(7);
		que.add(6);		
		System.out.println(que);
		
		for(Integer I:que)
		{
			System.out.println(I);
		}
		System.out.println("Descending Order:");
		Iterator I1=que.descendingIterator();
		while(I1.hasNext())
		{
			System.out.println(I1.next());

		}
		System.out.println("First Element: "+que.getFirst());
		System.out.println("Last Element: "+que.getLast());
		que.offerFirst(8);
		System.out.println(que);
		
		que.offerLast(10);
		System.out.println(que);
		
		System.out.println("Head Element: "+que.peek());
		que.remove();
		que.poll();
		System.out.println(que);
		que.pollFirst();
		System.out.println(que);
		que.pollLast();
		System.out.println(que);
		que.removeFirst();
		System.out.println(que);
		que.removeLast();
		System.out.println(que);
		que.clone();
		System.out.println(que);
	}
}
}
