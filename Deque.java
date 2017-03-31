public interface Deque<T>{
    public T peekFront();
    public T peekEnd();
    
    public void addFront( T q);
    public void addEnd(T q);
    
    public T removeFront();
    public T removeEnd();

    public int size();
    public boolean contains(T x);
}
