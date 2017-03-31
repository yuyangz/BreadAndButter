public class Deck<T> implements Deque<T>{

    private ArrayList<T> queue;
    private int size;

    public Deck(){
	size = 0;
	queue = new ArrayList<T>();
    }
    
    public T peekFront(){
	return null;
    }

    public T peekEnd(){
	return null;
    }

    public void addFront(){
	
    }

    public void addEnd(){
    }

    public T removeFront(){
	return null;
    }

    public T removeEnd(){
	return null;
    }

    public int size(){
	return size;
    }

    public boolean contains(T x){
	return false;
    }

    public static void main (String[] args){
	
    }
    
}
