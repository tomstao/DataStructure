package dataStructure.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 456));
        stack.push(new Employee("Mary", "Smith", 789));
        stack.push(new Employee("Mike", "Wilson", 342));
        stack.push(new Employee("Bill", "End", 784));

        stack.printStack();
        System.out.println("Peek:");
        System.out.println(stack.peek());

        System.out.println("Pop:");
        System.out.println(stack.pop());
        System.out.println("Peek: " + stack.peek());
    }
}
