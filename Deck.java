import java.util.ArrayList;

public class Deck<T> implements Deque<T>{

    private ArrayList<T> queue;
    private int size;
    private int maxSize;

    public Deck(){
	size = 0;
	queue = new ArrayList<T>();
	maxSize = -1;
    }
	
    public Deck(int max){
	size = 0;
	queue = new ArrayList<T>();
	maxSize = max;
    }
    
    public T peekFront(){
	return queue.get(0);
    }

    public T peekEnd(){
	return queue.get(size-1);
    }

    public void addFront(T q){
	if(maxSize==-1 || maxSize>size){
	    queue.add(0, q);
	    size++;
	}
    }

    public void addEnd(T q){
	if(maxSize==-1 || maxSize>size){
	    queue.add(q);
	    size++;
	}
    }

    public T removeFront(){
	T q = queue.get(0);
	queue.remove(0);
	size--;
	return q;
    }

    public T removeEnd(){
	T q = queue.get(size-1);
	queue.remove(size-1);
	size--;
	return q;
    }

    public int size(){
	return size;
    }

    public boolean contains(T x){
	for(int q = 0; q < size; q++){
	    if(queue.get(q).equals(x)){
		return true;
	    }
	}
	return false;
    }
	
    public int atIndex(T q){
	for(int w = 0; w < size; w++){
	    if(queue.get(w).equals(q)){
		return w;
	    }
	}
	return -1;
    }
	
    public void removeFirst(T q){
	int x = this.atIndex(q);
	if(x != -1){
	    queue.remove(x);
	    size--;
	}
    }
	
    public void removeLast(T q){
	for(int w = size-1; w > -1; w--){
	    if(queue.get(w).equals(q)){
		queue.remove(w);
		size--;
		break;
	    }
	}
		
    }
	
    public T pollFront(){
	if(size == 0){
	    return null;
	}
	else{
	    return this.removeFront();
	}
    }
	
    public T pollEnd(){
	if(size == 0){
	    return null;
	}
	else{
	    return this.removeEnd();
	}
    }

    public String toString(){
	String q = "";
	for(T w : queue){
	    q+= w + ", ";
	}
	return q;
    }
	
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
