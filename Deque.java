public interface Deque<T>{
    public T peekFront();
    public T peekEnd();
    
    public void addFront();
    public void addEnd();
    
    public T removeFront();
    public T removeEnd();

    public int size();
    public boolean contains();
}
