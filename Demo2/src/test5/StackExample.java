package test5;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
public static void main(String args[]) {
	Stack<String> s=new Stack<String>();
	s.push("Ram");
	s.push("Kavi");
	s.push("Anu");
	s.push(null);
	s.push(" ");
	s.push("priya");
	
	System.out.println(s);
	s.pop();
	System.out.println("After pop the element:");

	for(String s1:s)
	{
		System.out.println(s1);
	}
	System.out.println("Head Element: "+s.peek());
	Iterator I=s.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	System.out.println("Element at position 1: ");
	System.out.println(s.elementAt(1));
	if(s.isEmpty())
	{
		System.out.println("Stack is empty");
	}
	else 
	{
		System.out.println("Stack is not empty");
	}
	System.out.println("Contains :"+s.contains("priya"));
	//System.out.println(s.replaceAll("Ravi"));
	System.out.println("Searching: "+s.search("Ram"));
	System.out.println(s.indexOf(2));
	
	boolean ss=s.equals(s);
	System.out.println(ss);
	
	s.set(1, "Gayu ");
	System.out.println(s);
	Stack<Integer> s1=new Stack<Integer>();
	s1.push(1);
	s1.push(2);
	s1.push(3);
	s1.push(4);
	
	Stack<Integer> s2=new Stack<Integer>();
	s2.push(1);
	s2.push(2);
	s2.push(3);
	s2.push(4);
	
	if(s2.equals(s1))
	{
		System.out.println("Equal");
	}
	else
	{
		System.out.println("Not equal");
	}
	
}
}
