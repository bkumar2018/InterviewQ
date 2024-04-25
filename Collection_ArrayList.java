package Collection_Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareTwoStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> data1 = new ArrayList<>();
		data1.add("QA"); 
		data1.add("test1");
		data1.add("test2");
		
		//List<String> data2 = new ArrayList<>(data1);
		
		List<String> sorteddata1 = new ArrayList<>(data1); 
		sorteddata1.sort(Comparator.reverseOrder());
		
		System.out.println(data1);
		System.out.println(sorteddata1);
		
		if(data1.equals(sorteddata1)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}

		List<String> sorteddata2 = new ArrayList<>(data1); 
		sorteddata2.sort(Comparator.naturalOrder());
		System.out.println(data1);
		System.out.println(sorteddata2);
		
		if(data1.equals(sorteddata2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	}

}
//////////
Hashset_demo
/////////////
  package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	//Java HashSet class is used to create a collection that uses a hash table for storage. 
	//It inherits the AbstractSet class and implements Set interface

	
//	The important points about Java HashSet class are:
//
//		HashSet stores the elements by using a mechanism called hashing.
//		HashSet contains UNIQUE elements only.
//		HashSet allows null value.
//		HashSet class is non synchronized.
//		HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their HASHCODE.
//		HashSet is the best approach for SEARCH operations.
//		The initial default capacity of HashSet is 16, and the load factor is 0.75
		
		
	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
	
		//Add elements to Hash Set
		hset.add("Apple");
		hset.add("Banana");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("PineApple");
		
		//return false if already element is present
		//HashSet doesn't allow duplicate elements its ignore its and return false
		System.out.println(hset.add("Apple"));		
		if(hset.add("Apple")) {
			System.out.println("Added Apple!!");	
		}else {
			System.out.println(" Apple is allready added !!");
		}
		
		//Search for element in Hashset
		if(hset.contains("Apple")) {
			System.out.println("Apple is present!!!");
		}
		
		//Get the total elements present in HashSet
		System.out.println("size of hash set: "+ hset.size());
	
	
		//Iterate through all the elements
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			
			String fruits = itr.next();
			if(fruits.equals("Orange")) {
				System.out.println("Orange is present");
				//break;
			}else {
				System.out.println(fruits);
			}
			
		}
		
		//Taking out element from hash set
		hset.remove("Orange");
		
		HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav");  
        
        //Add this new hashset to previous original hashset
        hset.addAll(set1);  
        System.out.println("Updated List: "+hset);  
        
        
        //Removing all the new elements from HashSet  
        hset.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+hset);  
	
	
        //Removing elements on the basis of specified condition  
        hset.removeIf(str->str.contains("Ajay"));    
        System.out.println("After invoking removeIf() method: "+hset);
     
        //Removing all the elements available in the set  
        hset.clear();  
        System.out.println("After invoking clear() method: "+hset);  
        
        
        //HashSet from another Collection
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Bijay");
        list.add("Cjay");
        list.add("Djay");
        list.add(0, "1st element");
        
        hset.addAll(list);
        System.out.println("After invoking addAll() method from another Collection : "+hset);  
        
        HashSet<String> newhashset1 = new HashSet<>(list);
        System.out.println("After invoking new HashSet from another Collection : "+newhashset1);  
        
        
        //Add class Obect in HashSet
        HashSet<Book> hsetBook = new HashSet<>();
        
        Book bk1 = new Book(1, "Charlie And Chocalate Factory", "Roald Dahl", "Quentin Blake", 5);
        Book bk2 = new Book(2, "Great Glass Elevator","Roald Dahl", "Quentin Blake", 3);
        Book bk3 = new Book(3, "Fantastic Mr Fox", "Roald Dahl", "Quentin Blake", 5);
        Book bk4 = new Book(4, "Diary of a Wimpy Kid Dog Days", "Jeff Kinney", "puffinbooks.com", 1);
        
        hsetBook.add(bk1);
        hsetBook.add(bk2);
        hsetBook.add(bk3);
        hsetBook.add(bk4);
        
        System.out.println("List of books: ");
        Iterator<Book> itrBook = hsetBook.iterator();
        while(itrBook.hasNext()) {
        	Book b = itrBook.next();
        	System.out.println(b.bookName + " - By " + b.bookAuthName);
        }
      //Traversing HashSet  
//        for(Book b:hsetBook){  
//        System.out.println("# "+b.bookName+" - By "+b.bookAuthName+" "+b.bookPublisherName+" "+b.bookQty);  
//        }  
        
	}

}



 class Book {
	int bookId ;
	String bookName ;
	String bookAuthName;
	String bookPublisherName;
	int bookQty;
	
	
	Book(int id, String name, String author, String publisher, int quantity){
	
		this.bookId = id;
		this.bookName = name;
		this.bookAuthName = author;
		this.bookPublisherName = publisher;
		this.bookQty = quantity;
	}
	
}
////////////
SetsDemo
////////////
  package Collection_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set is an unordered collection of objects in which duplicate values cannot be stored.
//1. Insertion order is not maintained
//2. No Duplicates allowed

public class SetsDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
//		Set<String> linkHashSet = new LinkedHashSet<String>();   // 
//		Set<String> treeSet = new TreeSet<String>();
		
		
		hashSet.add("India");
		hashSet.add("USA");
		hashSet.add("UK");
		hashSet.add("India");
		hashSet.add("India");
		
		System.out.println(hashSet);   // [USA, UK, India]   Duplicates not get added
		
		//Traverse using for each loop and compare
		for(String str: hashSet) {
			if(str.equalsIgnoreCase("india")) {
				System.out.println("My Country India !!!");
			}
		}
		
		//Check it contains 
		System.out.println("Contains: India : "+hashSet.contains("India"));
		
		//Traverse using Iterator 
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

		//set1 = [1,3,2,4,5,9,0]
		//set2 = [1,3,7,5,6,0,9]	
		
		
		//Union = [0,1,2,3,4,5,6,7,9]
		//Intersection = [1,3,5,9,0]
		//Difference = [2,4,6,7]
		
		setUnion();
		setIntersection();
		setDifference();
	
		
		//LinkedHashSet demo
		linkedHashSet();
		
		//TreeSet demo
		treeSet();
	}
	
	//adds all the elements in one set with the other. //Union = [0,1,2,3,4,5,6,7,9]
	public static void setUnion() {
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,5,6,0,9}));
		
		//For union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union of two sets ");
		System.out.println(union);
		
	}
	
	// To get all common element from given two sets.  //Intersection = [1,3,5,9,0]
	public static void setIntersection() {
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,5,6,0,9}));
		
		//For union
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection of two sets ");
		System.out.println(intersection);
		
	}
	

	// To get difference element from given two sets. //Difference = [2,4,6,7]
	public static void setDifference() {
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,5,6,0,9}));
		
		//For union
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference of two sets ");
		System.out.println(difference);
		
	}
	
	//LinkedHashSet: It is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
	//When the iteration order is needed to be maintained this class is used. 
	//When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. 
	public static void linkedHashSet() {

		Set<String> lh = new LinkedHashSet<>();
		lh.add("India");
		lh.add("USA");
		lh.add("Australia");
		
		lh.add("India");
		System.out.println(lh);   //[India, USA, Australia]    print o/p in order in which element inserted.
		
		lh.remove("Australia");
		System.out.println(lh);   //[India, USA]
		
		lh.add("UK");
		
		//Traverse using iterator
		Iterator<String> itr = lh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	//TreeSet : it stores elements in sorted format. 
	//TreeSet uses tree data structure for storage. Objects are stored in sorted, ascending order.
	public static void treeSet() {
		
		Set<String> ts = new TreeSet<>();
		ts.add("Zebra");
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Onion");
		ts.add("Papaya");
		
		System.out.println(ts);
		ts.remove("Onion");
		System.out.println(ts);
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
////////////
HashMap/ LinkedHashMap /TreeMp
  //////////////
  package ForTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

	//A Map is useful if you have to search, update or delete elements on the basis of a key.
	//A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
	//A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
	
	/*
	 *Class	Description
	HashMap - 	HashMap is the implementation of Map, but it doesn't maintain any order.
	LinkedHashMap	-	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
	TreeMap	-	TreeMap is the implementation of Map and SortedMap. It maintains ascending order. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		createMap();
		

	}
	
	
	public static Map<String, String> createMap(){
		
		//HashMap is the implementation of Map, but it doesn't maintain any order.
		System.out.println("HashMap is the implementation of Map, but it doesn't maintain any order");
		Map<String, String> hmap = new HashMap<>();
		hmap.put("Book", "The Time Machine");
		hmap.put("Movie", "Top Gun");
		
		for(Map.Entry<String, String> em: hmap.entrySet()) {
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		
		//LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
//		Map<String, String> lhmap = new LinkedHashMap<>();
//		lhmap.put("Book", "Theory of Relativity");
//		lhmap.put("Movie", "Maverik");
		Map<String, String> lhmap = new LinkedHashMap<>(hmap);
				
		for(Map.Entry<String, String> em: lhmap.entrySet()) {
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		//TreeMap is the implementation of Map and SortedMap. It maintains ascending order. 
//		Map<String, String> tmap = new TreeMap<>();
//		tmap.put("Book", "Diary of Young Girl: ANNE FRANK");
//		tmap.put("Movie", "ANNE FRANK");
//		tmap.put("Id", "1945");
		Map<String, String> tmap = new TreeMap<>(hmap);
		for(Map.Entry<String, String> em: tmap.entrySet()) {
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		return null;
		
	}

}
///////////////
ComparedTwoList
///////////////

  package ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CompareTwoLists {

	public static void main(String[] args) {
		
//		List<String> lstOne = new ArrayList<String>();		
//		List<String> lstTwo = new ArrayList<String>();
		


		compare2SortedListWithSameItemsAndAppearAtSameIndex();
		
		System.out.println(" ------------------------------------------------ ");
		compare2SortedListsForEqualityRegardlessOfTheirLocation();
		
		System.out.println(" ------------------------------------------------ ");
		compare2ListsAndFindDifferences();
		
	
		
	}
	
	

	public static void compare2SortedListWithSameItemsAndAppearAtSameIndex() {
		//Two compare two sorted list with same items and appear in the same index
		//equals() method compares the items and their location in the list.
		List<String> lstOne = Arrays.asList("a", "b", "c");		
		List<String> lstTwo = Arrays.asList("a", "b", "c");
		List<String> lstThree = Arrays.asList("c", "a", "b");
		
		boolean isEqual = lstOne.equals(lstTwo);
		System.out.println(isEqual);		
		isEqual = lstOne.equals(lstThree);
		System.out.println(isEqual);
		
		if(lstOne.equals(lstTwo)) {
			System.out.println("lstOne equals lstTwo");
		}else if (lstOne.equals(lstThree)) {
			System.out.println("lstOne equals lstThree");
		}else {
			System.out.println("No list is equals");
		}
	}
	
	
	public static void compare2SortedListsForEqualityRegardlessOfTheirLocation() {
		
		List<String> lstOne = Arrays.asList("a", "b", "c");		
		List<String> lstTwo = Arrays.asList("a", "b", "c");
		List<String> lstThree = Arrays.asList("c", "a", "b");
		
		//Compare two sorted lists for equality in terms of items regardless of their location,
		Collections.sort(lstOne);
		Collections.sort(lstTwo);
		Collections.sort(lstThree);
		
		boolean isEqual_sort = lstOne.equals(lstTwo);
		System.out.println(isEqual_sort);		
		isEqual_sort = lstOne.equals(lstThree);
		System.out.println(isEqual_sort);
	}
	
	public static void compare2ListsAndFindDifferences() {

		
		//Compare two lists and find differences.
		List<String> lstOne = Arrays.asList("a", "b", "c");		
		List<String> lstTwo = Arrays.asList("a", "b", "c");
		List<String> lstThree = Arrays.asList("c", "a", "b");
		
		//removeAll()  -->  method compares two lists and removes all the common items.
		List<String> lstFour = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
		lstFour.removeAll(lstOne);
		System.out.println("removeAll --> "+lstFour);
		
		
		//retainAll() ---> method only keeps the items that are common in both  lists.
		lstOne.retainAll(lstThree);
		System.out.println("retainAll --> "+lstOne);
		
	}
	
}
////////////////
