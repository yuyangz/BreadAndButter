public interface Deque<T>{
    public T peekFirst(); //returns the first value in the array
    public T peekLast(); //returns the last value in the array
    
    public void addFirst( T q); //adds a value to the front of the array
    public void addLast(T q); //adds a value to the end of the array
    
    public T removeFirst(); //removes a value from the front of the array
    public T removeLast(); //remove a value from the end of the array

    public void removeFirstOccurrence(T q); //removes the first occurance of the value in the array that is equal to q.
    public void removeLastOccurrence(T q); //removes the last occurance of the value in the array that is equal to q.

    public T pollFirst(); //error handling for removeFront
    public T pollLast(); //error handling for removeEnd

    public int size(); //the number of values in the array
    public boolean contains(T x); //if the value is present in the array. 
    public int atIndex(T q); //returns the index of the first occurance of q in the array.
}
