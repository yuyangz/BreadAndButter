public interface Deque<T>{
    public T peekFront(); //returns the first value in the array
    public T peekEnd(); //returns the last value in the array
    
    public void addFront( T q); //adds a value to the front of the array
    public void addEnd(T q); //adds a value to the end of the array
    
    public T removeFront(); //removes a value from the front of the array
    public T removeEnd(); //remove a value from the end of the array

    public void removeFirst(T q); //removes the first occurance of the value in the array that is equal to q.
    public void removeLast(T q); //removes the last occurance of the value in the array that is equal to q.

    public int size(); //the number of values in the array
    public boolean contains(T x); //if the value is present in the array. 
    public int atIndex(T q); //returns the index of the first occurance of q in the array.
}
