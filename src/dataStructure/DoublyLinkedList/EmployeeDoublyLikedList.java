package dataStructure.DoublyLinkedList;

public class EmployeeDoublyLikedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        }  else {
            head.setPrev(node);
        }

        head = node;
        size++;
    }

    public EmployeeNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            System.out.println("This is empty");
            return null;
        }
        EmployeeNode removedNode = head;
       head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println(current);
        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
