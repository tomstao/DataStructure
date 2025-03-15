package dataStructure.DoublyLinkedList;

public class employeeNode {
    private Employee employee;
    private employeeNode next;

    public employeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public employeeNode getNext() {
        return next;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setNext(employeeNode next) {
        this.next = next;
    }

}
