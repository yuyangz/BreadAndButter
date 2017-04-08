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
    
    public T peekFirst(){
	return queue.get(0);
    }

    public T peekLast(){
	return queue.get(size-1);
    }

    public void addFirst(T q){
	if(maxSize==-1 || maxSize>size){
	    queue.add(0, q);
	    size++;
	}
    }

    public void addLast(T q){
	if(maxSize==-1 || maxSize>size){
	    queue.add(q);
	    size++;
	}
    }

    public T removeFirst(){
	if ( size == 0 ){
	    System.out.println("There are no elements");
	    return null;
	}	
	T q = queue.get(0);
	queue.remove(0);
	size--;
	return q;
    }

    public T removeLast(){
	if ( size == 0 ){
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
	
    public void removeFirstOccurrence(T q){
	int x = this.atIndex(q);
	if(x != -1){
	    queue.remove(x);
	    size--;
	}
    }
	
    public void removeLastOccurrence(T q){
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
