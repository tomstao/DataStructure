package dataStructure.EnhancedQueue;

import java.util.NoSuchElementException;

/*

- Abstract data type
- FIFO -- first in, first out
- add = also called enqueue - add an item to the end of the queue
- remove - also called dequeue - remove the item at the front of the queue
- peek - get the item at the font of the queue, but don't remove it

 */
public class EnhancedArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public EnhancedArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        int numItems = size();
        if (size() == queue.length - 1) {
            Employee[] newQueue = new Employee[queue.length * 2];

            System.arraycopy(queue, front, newQueue, 0, queue.length - front);
            System.arraycopy(queue, 0, newQueue, queue.length - front, queue.length);

            queue = newQueue;

            front = 0;
            back = numItems;
        }
        queue[back] = employee;
        if(back < queue.length - 1) {
            back++;
            return;
        } else back = 0;
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
        } else if(front == queue.length) {
            front = 0;
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
        if(front <= back){
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        if(front <= back) {
            for(int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for(int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }

            for(int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
