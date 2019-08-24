package solutions.techcircle.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TechCircleArrayList {

	public static void main(String[] args) {
		
		
		/* The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, 
is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want. 
The syntax is also slightly different:*/

		System.out.println("==========Older Array Declaration===========");

		String[] ArrayListOld = { "Ravi", "Vijay", "Ravi", "Ajay","adfl" };
		
		
		for (String arr : ArrayListOld) {

		System.out.println(arr);
		}

		///////
		System.out.println("==========ArrayList Generic===========");

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		// ArrayList list=new ArrayList(); //non Generic
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Shafkat");
		list.add("Aqeel");
		// Invoking arraylist object

		System.out.println(list);

		System.out.println("==========Iterating Using Iterator interface===========");

		// iterating
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("==========Iterating Using ForEach LOOP===========");
		// for.each LOOP
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==========Iterating Collection through other ways Examp.===========");

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> System.out.println(a));// Here, we are using lambda expression

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(b -> System.out.println(b));// Here, we are using lambda expression

		
		System.out.println("======ArrayList Examples to ADD Elements");
		
		 ArrayList<String> al=new ArrayList<String>(); 
		 
         System.out.println("Initial list of elements: "+al);  
         
         //Adding elements to the end of the list  
         al.add("Ravi");  
         al.add("Vijay");  
         al.add("Ajay");  
         System.out.println("After invoking add method: "+al);  
         
         //Adding an element at the specific position  
         al.add(1, "Gaurav");  
         System.out.println("After invoking add(int index, E element) method: "+al);  
         
         ArrayList<String> al2=new ArrayList<String>();  
         al2.add("Sonoo");  
         al2.add("Hanumat");  
         
         //Adding second list elements to the first list  
         al.addAll(al2);  
         System.out.println("After invoking addAll method: "+al);  
         
         ArrayList<String> al3=new ArrayList<String>();  
         al3.add("John");  
         al3.add("Rahul");  
         
         //Adding third list elements to the first list at specific position  
         al.addAll(1, al3);  
         System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
		
         System.out.println("======ArrayList Examples to remove elements");
         
         ArrayList<String> al1=new ArrayList<String>();  
         al1.add("Ravi");    
         al1.add("Vijay");    
         al1.add("Ajay");   
         al1.add("Anuj");  
         al1.add("Gaurav");  
         System.out.println("An initial list of elements: "+al1);  
         
         //Removing specific element from arraylist  
         al1.remove("Vijay");  
         System.out.println("After invoking remove(object) method: "+al1);   
         
         //Removing element on the basis of specific position  
         al1.remove(0);  
         System.out.println("After invoking remove(index) method: "+al1);   
           
         //Creating another arraylist  
         ArrayList<String> als=new ArrayList<String>();    
         als.add("Ravi");    
         als.add("Hanumat");
         
         //Adding new elements to arraylist  
         al1.addAll(als);  
         System.out.println("Updated list : "+al1);   
         
         //Removing all the new elements from arraylist  
         al1.removeAll(als);  
         System.out.println("After invoking removeAll() method: "+al1);   
         
         //Removing elements on the basis of specified condition  
         al1.removeIf(a -> a.contains("Ajay"));   //Here, we are using Lambda expression   
         System.out.println("After invoking removeIf() method: "+al1);  
         
         //Removing all the elements available in the list  
         al1.clear();  
         System.out.println("After invoking clear() method: "+al1);   
         
         
         
         System.out.println("=================ArrayList Examples of RetainAll method");
         
         ArrayList<String> alc=new ArrayList<String>();  
         alc.add("Ravi");  
         alc.add("Vijay");  
         alc.add("Ajay");  
         
         ArrayList<String> al20=new ArrayList<String>();  
         al20.add("Ravi");  
         al20.add("Vijay"); 
         
         alc.retainAll(al20); 
         
         System.out.println("iterating the elements after retaining the elements of al2" + alc);  
         
         Iterator itr1=alc.iterator(); 
         
         while(itr1.hasNext()){  
          System.out.println(itr1.next());  
         }  
        
         
         System.out.println("===========ArrayList example of isEmpty() method=========");
         
         ArrayList<String> alz=new ArrayList<String>();  
         
         System.out.println("Is ArrayList Empty: "+alz.isEmpty());  
         
         alz.add("Ravi");    
         alz.add("Vijay");    
         alz.add("Ajay");    
         
         System.out.println("After Insertion");  
         
         System.out.println("Is ArrayList Empty: "+alz.isEmpty());   
         
         
         System.out.println("============ArrayList example of set() and get() method========");
         
         ArrayList<String> alsg=new ArrayList<String>();  
         
         alsg.add("Ravi");    
         alsg.add("Vijay");    
         alsg.add("Ajay");    
         
         System.out.println("Before update: "+alsg.get(1));   
         
         //Updating an element at specific position  
         alsg.set(1,"Gaurav");  
         
         System.out.println("After update: "+alsg.get(1));   
         
         
         
		
	}

}
