package dataStructure.Queue;

import java.util.NoSuchElementException;

/*

- Abstract data type
- FIFO -- first in, first out
- add = also called enqueue - add an item to the end of the queue
- remove - also called dequeue - remove the item at the front of the queue
- peek - get the item at the font of the queue, but don't remove it

 */
public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == queue.length) {
            Employee[] newQueue = new Employee[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }
        queue[back++] = employee;
    }

    public Employee remove() {
        if(size() == 0){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front++] = null;
        if(size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        if(size() == 0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }

}
