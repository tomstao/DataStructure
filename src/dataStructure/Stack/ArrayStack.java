package dataStructure.Stack;

import java.util.EmptyStackException;

/*

- Abstract data type
- LIFO -- last in, first out.
- push -- adds an item as the top item on the stack
- pop -- removes the top item on the stack
- peel -- gets the top item on the stack without popping it
- Ideal backing data structure: linked list

** choose array as the backing data structure if you don't expect to resize it frequently.
** if you do, maybe the linked list will be the better choice.

 */
public class ArrayStack {

    private Employee[] stack;
    private int top;
    // Top is default by 0, therefore, we don't need to initialize it.

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {

        if (top == stack.length) {
            System.out.println("The stack is full, resizing......");
            // need to resize the backing array

            Employee[] newArray = new Employee[stack.length * 2];
            // To double the array is the common way to resize the backing array.
            System.arraycopy(stack, 0, newArray, 0, stack.length); // O(n) for resizing the array.
            stack = newArray;
        }

        stack[top++] = employee;// O(1);
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[-- top];
        // Top always holds the next available position in the array.
        // the data on the top is stored at the top position minus 1.

        stack[top] = null; // we popped the top - 1, so we need to make the current top to be null.
        return employee;

        // if we don't worry about to resize the array after popping enough data, pop will be O(1).
        // if we do, it becomes O(n). And the choice is based your actual needs such as memory consideration.
    }

    public Employee peek() {
        // We only take the data on the top of the stack, but don't pop it.
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1]; // Unlike the decrement prefix above, this way we don't change the top.
        // Because we only need to get the data, not to pop it.
    }

    public int size() {
        return top;
        // Size will be equal to the number of top. This is always O(1).
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            Employee employee = stack[i];
            System.out.println(employee);
            // it prints data from the top to the bottom.
        }
    }

    private boolean isEmpty() {
        return top == 0;
    }


}
