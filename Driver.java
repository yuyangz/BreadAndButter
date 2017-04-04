public class Driver{
    public static void main (String[] args){
		
	Deck w = new Deck(5);
	w.addFront(2);
	w.addFront(4);
	w.addEnd(5);
	w.addEnd(7);
	w.addEnd(8);
	System.out.println(w);
		
	w.addFront(1);
	System.out.println(w);
	w.addEnd(0);
	System.out.println(w);
		
	Deck q = new Deck();
	q.addFront("w");
	q.addFront("e");
	q.addFront("r");
	q.addEnd("T");
	q.addEnd("y");
	q.addEnd("w");
	q.addEnd("e");
		
	System.out.println(q.size());
		
	System.out.println(q);
	q.removeFirst("w");
	System.out.println(q);
	q.removeLast("e");
		
	System.out.println(q);
		
	System.out.println(q.atIndex("v"));
	System.out.println(q.atIndex("w"));
		
	System.out.println(q.contains("v"));
	System.out.println(q.contains("w"));
		
	System.out.println(q.removeFront() + "...r");
	System.out.println(q.removeEnd() + "...y");
	System.out.println(q.removeEnd() + "...T");
	System.out.println(q.pollEnd() + "...w");
	System.out.println(q.pollFront() + "...e");
	System.out.println(q.size());

	System.out.println(q.pollFront());
	System.out.println(q.pollEnd());
    }
}
