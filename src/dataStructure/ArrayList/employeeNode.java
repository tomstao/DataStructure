package dataStructure.ArrayList;

public class employeeNode {
    private Employee employee;
    private employeeNode next;
    private employeeNode prev;

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

    public employeeNode getPrev() {
        return prev;
    }

    public void setPrev(employeeNode prev) {
        this.prev = prev;
    }
}
