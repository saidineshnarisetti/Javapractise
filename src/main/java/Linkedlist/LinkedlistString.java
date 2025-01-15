package Linkedlist;

import java.security.AlgorithmConstraints;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedlistString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Dinesh");
		ls.add("Sai");
		ls.add("Anusha");
		
		java.util.Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedList<String> ls2 = new LinkedList<String>();
        ls2.add("John");
        ls2.add("Alice");
        ls2.add("Bob");
        ls.addAll(ls2);
        System.out.println("After appending");
        java.util.Iterator<String> itr2 = ls.iterator();
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }
        ls.remove(4);
        System.out.println("After removing an element");
        System.out.println(ls);
        ls.removeFirst();
        System.out.println("After removing first element");
        System.out.println(ls);
        ls.removeLast();
        System.out.println("After removing last element");
        System.out.println(ls);
       
	}

}
