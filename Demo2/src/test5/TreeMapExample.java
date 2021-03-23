package test5;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
public static void main(String args[])
{
	TreeMap<Integer,Integer> tree=new TreeMap<Integer,Integer>();
	tree.put(1, 500);
	tree.put(2, 1000);
	tree.put(3, 1500);
	tree.put(4, 2000);

	System.out.println(tree);
	for(Map.Entry<Integer, Integer> m:tree.entrySet())
	{
		System.out.println("Key is: "+m.getKey()+" "+"Value is: "+m.getValue());
	}
	
	System.out.println("Descending Order: "+tree.descendingMap());
	System.out.println("First Key value: "+tree.firstKey());
	System.out.println(tree.containsKey(3));
	System.out.println(tree.containsValue(null));
	
	System.out.println(tree.get(2));
	System.out.println("Last Key: "+tree.lastKey());

	tree.remove(2);
	System.out.println("After removing an element: ");
	System.out.println(tree);
	
	System.out.println("First Entry: "+tree.pollFirstEntry());
	System.out.println("Last Entry: "+tree.pollLastEntry());

	System.out.println("After polling an element: "+tree);
}
}
