package dataStructure.EnhancedQueue;

public class Main {
    public static void main(String[] args) {
            Employee janeJones = new Employee("Jane", "Jones", 123);
            Employee johnDoe = new Employee("John", "Doe", 324);
            Employee marySmith = new Employee("Mary", "Smith", 452);
            Employee mikeWilson = new Employee("Mike", "Wilson", 4342);
            Employee billEnd =  new Employee("Bill", "End", 678);

            EnhancedArrayQueue queue = new EnhancedArrayQueue(5);

            queue.add(janeJones);
            queue.add(johnDoe);
            queue.remove();
            queue.add(marySmith);
            queue.remove();
            queue.add(mikeWilson);
            queue.remove();
            queue.add(billEnd);
            queue.add(janeJones);
            queue.printQueue();


    }
}
