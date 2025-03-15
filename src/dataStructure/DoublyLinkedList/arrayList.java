package dataStructure.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane","Jones", 123));
        employeeList.add(new Employee("John","Doe", 4567));
        employeeList.add(new Employee("Mary","Smith", 22));
        employeeList.add(new Employee("Mike","Wilson", 3245));

        /*employeeList.forEach(System.out::println);
        System.out.println(employeeList.get(1));

        //System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John","Adam", 4568));
        employeeList.forEach(System.out::println);

        //System.out.println(employeeList.size());
        employeeList.add(3, new Employee("John","Doe", 4567));
        System.out.println("*".repeat(20));
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee:employeeList){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary","Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John","Doe", 4567)));
        employeeList.remove(2);

         */

        EmployeeLikedList list = new EmployeeLikedList();
        System.out.println(list.isEmpty() ? "This is empty" : "This is not empty");

        list.addToFront(employeeList.get(0));
        list.addToFront(employeeList.get(1));
        list.addToFront(employeeList.get(2));
        list.addToFront(employeeList.get(3));

        employeeNode head = list.getHead();
        System.out.println(list.getSize());

        while(list.getHead()!=null){
            Employee employee = head.getEmployee();
            System.out.println(employee);
            head = head.getNext();

            if(head == null){
                break;
            }
        }

        System.out.println(list.isEmpty() ? "This is empty" : "This is not empty");
    }
}
