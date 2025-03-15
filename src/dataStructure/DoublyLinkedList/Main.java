package dataStructure.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLikedList list = new EmployeeDoublyLikedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd =  new Employee("Bill", "End", 4567);

        list.addToEnd(billEnd);
        System.out.println("After adding to the end we have " + list.getSize());
        list.printList();

    }

}
