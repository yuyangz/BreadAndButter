//Adeebur Rahman
//APCS2 pd1
//HW29 -- Stress is the Best
//2017-04-05

import java.util.NoSuchElementException;
import java.lang.NullPointerException;
import java.util.ArrayList;
import java.util.Iterator;

public class DequeTester {
    
    public static void main(String[] args) {

	/*
	System.out.println("\n\nException Checking");
	Deque<String> deck = new DLLDeque<String>();
	String s = test;

	//peek testing
	s = "test";
	try {
	    s = deck.peekFirst(); //s should be null;
	    if (s == null) { System.out.println("peekFirst() properly returned null"); }
	}
	catch (NoSuchElementException e) {
 	    System.out.println("peekFirst() wrongly threw an exception");
	}
	
	//removeFirst testing
	s = "test";
	try {
	    s = deck.removeFirst(); //should throw exception. s should still be test.
	    if (!s.equals("test")) { System.out.println("removeFirst() wrongly returned a value"); }
	}
	catch (NoSuchElementException e) {
	    System.out.println("removeFirst() properly threw an exception");
	}

	//poll testing
	s = "test";
	try {
	    s = deck.pollFirst(); //s should be null;
	    if (s == null) { System.out.println("pollFirst() properly returned null"); }
	}
	catch (NoSuchElementException e) {
	    System.out.println("pollFirst() wrongly threw an exception");
	}
	
	//add testing
	try {
	    deck.addFirst(null);
	    System.out.println("addFirst(null) should have thrown an exception but didn't");
	}
	catch (NullPointerException e) {
	    System.out.println("addFirst(null) properly threw an exception");
	}

	//contains testing
	try {
	    deck.contains(null);
	    System.out.println("contains(null) should have thrown an exception but didn't");
	}
	catch (NullPointerException e) {
	    System.out.println("contains(null) properly threw an exception");
	}

	System.out.println("\n\n\n\nGeneral Usage\n");

	System.out.println("Deque<Object> d = new DLLDeque<Object>()");
        Deque<Object> d = new DLLDeque<Object>();

        System.out.println("\ntesting various add methods");
        System.out.println("d.addFirst(\"b\")");
        d.addFirst("b");
        System.out.println("d: " + d); //d: [b]
        System.out.println("d.addLast(\"z\"): ");
        d.addLast("z");
        System.out.println("d: " + d); //d: [b, z]

        System.out.println("\ntesting various accessor methods");
        System.out.println("d.peekFirst(): " + d.peekFirst()); //d.peekFirst(): a
	System.out.println("d.peekLast(): " + d.peekLast()); //d.peekLast(): z

        System.out.println("\ntesting size() and isEmpty()");
        System.out.println("d: " + d); //d: [a, b, c, y, z]
        System.out.println("d.size(): " + d.size()); //d.size(): 5
        System.out.println("d.isEmpty(): " + d.isEmpty()); //d.isEmpty(): false

        System.out.println("\ntesting clear() and size() and isEmpty()");
        System.out.println("d: " + d); //d: [a, b, c, y, z]
        System.out.println("d.clear()");
        d.clear();
        System.out.println("d: " + d); //d: []
        System.out.println("d.size(): " + d.size()); //d.size(): 0
        System.out.println("d.isEmpty(): " + d.isEmpty()); //d.isEmpty(): true

        System.out.println("\ntesting misc methods");
        System.out.println("d.addLast(\"p\")");
        d.offer("p");
        System.out.println("d: " + d); //d: [p]
        System.out.println("d.addLast(\"L\")");
        d.addLast("L");
        System.out.println("d: " + d); //d: [p, L]
        System.out.println("d.addLast(\"b\")");
        d.addLast("b");
        System.out.println("d: " + d); //d: [p, L, b]
        System.out.println("d.addLast(\"L\")");
        d.addLast("L");
        System.out.println("d: " + d); //d: [p, L, b, L]
        System.out.println("d.addLast(\"p\")");
        d.addLast("p");
        System.out.println("d: " + d); //d: [p, L, b, L, p]
        System.out.println("d.addLast(\"L\")");
        d.addLast("L");
        System.out.println("d: " + d); //d: [p, L, b, L, p, L]
        System.out.println("d.addLast(\"b\")");
        d.addLast("b");
        System.out.println("d: " + d); //d: [p, L, b, L, p, L, b]

        System.out.println("\ntesting contains(Object o)");
        System.out.println("d.contains(\"L\"): " + d.contains("L")); //d.contains("L"): true

        System.out.println("\ntesting various remove methods");
        System.out.println("d.pollFirst(): " + d.pollFirst()); //d.pollFirst(): p
        System.out.println("d: " + d); //d: [b, L, p, b]
        System.out.println("d.removeFirst(): " + d.removeFirst()); //d.removeFirst(): b
        System.out.println("d: " + d); //d: [L, p, b]
        System.out.println("d.pop(): " + d.pop()); //d.pop(): L
        System.out.println("d: " + d); //d: [p, b]
        System.out.println("d.pollLast(): " + d.pollLast()); //d.pollLast(): b
        System.out.println("d: " + d); //d: [p]
        System.out.println("d.removeLast(): " + d.removeLast()); //d.removeLast(): p
        System.out.println("d: " + d); //d: []

        System.out.println("\ntesting for null output");
        System.out.println("d.peekFirst(): " + d.peekFirst()); //d.peekFirst(): null
        System.out.println("d.peekLast(): " + d.peekLast()); //d.peekLast(): null
        System.out.println("d.pollFirst(): " + d.pollFirst()); //d.pollFirst(): null
        System.out.println("d.pollLast(): " + d.pollLast()); //d.pollLast(): null

	*/
    }
}

