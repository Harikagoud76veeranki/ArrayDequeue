package com.collections;
//Demonstrating the array dequeue
import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		//creating an array dequeue
        ArrayDeque<String> ad = new ArrayDeque<>();
        
        //Adding elements to the front
        ad.addFirst("Good Morning");
        ad.addFirst("Hai....");
      //Adding elements to the end
        ad.addLast("How are you all...!!");
        ad.add("I'm Harika");
        
        //Displaying the elements
        System.out.println("Array Dequeue List: "+ad);
        
        //Displaying array first and last peek element
        System.out.println("Array First peek element is: "+ad.peekFirst());
        System.out.println("Array last peek element: "+ad.peekLast());
       
        //Removing elements from the front and end
        System.out.println("Removed element from the front: "+ad.removeFirst());
        System.out.println("Removed element from the end: "+ad.removeLast());
        
        //Displaying the dequeue after removal
        System.out.println("ArrayDeque after removal: "+ad);
        
        //Displaying array get first and last element
        System.out.println("Array get first element: "+ad.getFirst());
        System.out.println("Array get Last element: "+ad.getLast());
        
        //Adding elements at first and last and return boolean value after adding
        System.out.println("First Element: "+ad.offerFirst("Harika"));
        System.out.println("Last Element: "+ad.offerLast("manasa"));
        System.out.println(ad);

        
        
	}

}
