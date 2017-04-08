import java.util.ArrayList;

public class Deck<T> implements Deque<T>{

    private ArrayList<T> queue;
    private int size;
    private int maxSize;

    public Deck(){ //initializes the Deck
	size = 0;
	queue = new ArrayList<T>();
	maxSize = -1;
    }
	
    public Deck(int max){
	size = 0;
	queue = new ArrayList<T>();
	maxSize = max; //gives max size to deck
    }
    
    public T peekFirst(){ //returns first val
	return queue.get(0);
    }

    public T peekLast(){ //returns last val
	return queue.get(size-1);
    }

    public void addFirst(T q){ //add val to front of array
	if(maxSize==-1 || maxSize>size){ //checks if array is maxed
	    queue.add(0, q);
	    size++;
	}
	System.out.println("ARRAY MAXED");   
    }

    public void addLast(T q){ //add val to end of array
	if(maxSize==-1 || maxSize>size){ //checks if array is maxed
	    queue.add(q);
	    size++;
	}
	System.out.println("ARRAY MAXED");	  
    }

    public T removeFirst(){ //removes val at front of array
	if ( size == 0 ){ //check if the array is empty before removing
	    System.out.println("There are no elements");
	    return null;
	}	
	T q = queue.get(0);
	queue.remove(0);
	size--;
	return q;
    }

    public T removeLast(){ //removes val at end of array
	if ( size == 0 ){ //checks if the array is empty before removing
	    System.out.println("There are no elements");
	    return null;
	}
	else{
	    T q = queue.get(size-1);
	    queue.remove(size-1);
	    size--;
	    return q;
	}
    }

    public int size(){
	return size;
    }

    public boolean contains(T x){ //whether or not val is in array
	for(int q = 0; q < size; q++){ //goes through array
	    if(queue.get(q).equals(x)){
		return true;
	    }
	}
	return false;
    }
	
    public int atIndex(T q){ //returns index of first occurance of q
	for(int w = 0; w < size; w++){
	    if(queue.get(w).equals(q)){
		return w;
	    }
	}
	return -1;
    }
	
    public void removeFirstOccurrence(T q){ //removes first q
	int x = this.atIndex(q);
	if(x != -1){
	    queue.remove(x);
	    size--;
	}
    }
	
    public void removeLastOccurrence(T q){ //removes last q
	for(int w = size-1; w > -1; w--){
	    if(queue.get(w).equals(q)){
		queue.remove(w);
		size--;
		break;
	    }
	}
		
    }
	
    public T pollFirst(){
	if(size == 0){
	    return null;
	}
	else{
	    return this.removeFirst();
	}
    }
	
    public T pollLast(){
	if(size == 0){
	    return null;
	}
	else{
	    return this.removeLast();
	}
    }

    public String toString(){
	String q = "";
	for(T w : queue){
	    q += w + ", ";
	}
	return q;
    }
    
}
