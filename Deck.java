import java.util.ArrayList;

public class Deck<T> implements Deque<T>{

    private ArrayList<T> queue;
    private int size;

    public Deck(){
	size = 0;
	queue = new ArrayList<T>();
    }
    
    public T peekFront(){
	return queue.get(0);
    }

    public T peekEnd(){
	return queue.get(size-1);
    }

    public void addFront(T q){
		queue.add(0, q);
		size++;
    }

    public void addEnd(T q){
		queue.add(q);
		size++;
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

    public static void main (String[] args){
		Deck q = new Deck();
		q.addFront("w");
		q.addFront("e");
		q.addFront("r");
		q.addEnd("T");
		q.addEnd("y");
		
		System.out.println(q.size());
		
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
