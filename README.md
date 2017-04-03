# BreadAndButter
## **METHOD SELECTIONS**
We decided to include peekFront and peekFront as a way to see what items we have at each end. This way we may check for items before adding additional or removing items. We felt that the add and remove methods were quite necessary as we may want to change the deque. While removeFront removes the first value in the array and removeEnd removes the last value in the array, removeFirst removes the first value it finds that that is equal its parameter. For example, if we have (1,1,2,3,5) and we do removeFirst(1), it will remove the first 1 in the array. As for removeLast, it will return the last value that is equal to the parameter. If there are no repeating values, it will just remove the value it finds that is equal to the parameter for both of these removes. We also added a contains methods to check whether or not a certain item is already in the deque. If it is, it will return true. If not, it will return false. We also had an atIndex to check what certain indexes held. By placing the index into atIndex, it will return the value at that index. As for pollFirst and pollEnd, we decided to have these methods to handle errors that would show up in removeFront and removeEnd. If the deque is not empty, it will remove the value and return it, otherwise it will return null.

## **Why ArrayList?**
We initially decided on ArrayLists simply because of our familiarity with it. However upon deeper analysis we discovered why ArrayLists were more helpful. ArrayLists provide a simpler design from the backend. The user may be unaware of the underlying container, but it is easier to implement mechanisms using ArrayLists because of their "at index" functionalities. Furthermore, ArrayLists provide a faster runtime when simply peeking at elements.

## **Runtimes**
`peekFront()` : O(1)

`peekEnd()` : O(1)

`addFront()` : O(n)

`addEnd()` : O(1)

`removeFront()` : O(n)

`removeEnd()` : O(1)

`size()` : O(1)

`contains()` : O(n)

`atIndex()` : O(n)

`removeFirst()` : O(n)

`removeLast()` : O(n)

`pollFront()` : O(n)

`pollEnd()` : O(1)

