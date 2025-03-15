package dataStructure.DoublyLinkedList;

public class EmployeeLikedList {

    private employeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        employeeNode node = new employeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public employeeNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public employeeNode removeFromFront() {
        if (isEmpty()) {
            System.out.println("This is empty");
            return null;
        }
        employeeNode removedNode = head;
       head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
}
