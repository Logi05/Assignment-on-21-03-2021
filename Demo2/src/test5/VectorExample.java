package test5;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
public static void main(String args[])
{
	Vector<String> v=new Vector<String>();
	v.add("Rose");
	v.add("Jasmine");
	System.out.println(v);
	
	System.out.println("Size before adding elements: "+v.size());
	System.out.println("Capacity before adding elements: "+v.capacity());
	
	v.addElement("Lotus");
	v.addElement(null);
	System.out.println(v);
	
	System.out.println("Size after adding elements: "+v.size());
	System.out.println("Capacity after adding elements: "+v.capacity());
	
	Vector<String> v1=new Vector<String>();
	v1.add("SunFlower");
	v.addAll(v1);
	System.out.println(v);
	
	System.out.println(v.get(2));
	System.out.println("Index value: "+v.indexOf(v1));
	if(v.isEmpty())
	{
		System.out.println("Vector is empty");
	}
	else
	{
		System.out.println("Vector is not empty");
	}
	Vector<String> v2=new Vector<String>();
	if(v2.isEmpty())
	{
		System.out.println("Vector is empty");
	}
	else
	{
		System.out.println("Vector is not empty");
	}
	
	System.out.println("First Element: "+v.firstElement());
	System.out.println("Last Element: "+v.lastElement());
	
	v.insertElementAt("Baby Rose", 2);
	System.out.println(v.clone());
	
	//System.out.println(v.insertElementAt(Lily, 0));
	System.out.println(v.contains("Jasmine"));
	v.remove(1);
	System.out.println(v);
	
	v1.clear();
	System.out.println(v1);
	Iterator I=v.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	//System.out.println(v);
	}
}
