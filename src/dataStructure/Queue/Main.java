package dataStructure.Queue;

public class Main {
    public static void main(String[] args) {
            Employee janeJones = new Employee("Jane", "Jones", 123);
            Employee johnDoe = new Employee("John", "Doe", 324);
            Employee marySmith = new Employee("Mary", "Smith", 452);
            Employee mikeWilson = new Employee("Mike", "Wilson", 4342);
            Employee billEnd =  new Employee("Bill", "End", 678);

            ArrayQueue queue = new ArrayQueue(10);
            queue.add(janeJones);
            queue.add(johnDoe);
            queue.add(marySmith);
            queue.add(mikeWilson);
            queue.add(billEnd);
            //queue.printQueue();

            queue.remove();
            queue.remove();
            //queue.printQueue();
            //System.out.println(queue.peek());
            //queue.printQueue();
            queue.remove();
            queue.remove();
            queue.remove();
            //queue.remove();
            queue.add(janeJones);
            queue.printQueue();


    }
}
