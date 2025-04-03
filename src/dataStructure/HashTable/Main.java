package dataStructure.HashTable;


public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 324);
        Employee marySmith = new Employee("Mary", "Smith", 452);
        Employee mikeWilson = new Employee("Mike", "Wilson", 4342);
        Employee billEnd =  new Employee("Bill", "End", 678);
        HashTable ht = new HashTable();
        ht.put( "Jones",janeJones);
        ht.put( "Doe",johnDoe);
        ht.put( "Wilson",mikeWilson);
        ht.put( "Smith",marySmith);

        ht.print();

        System.out.println("Retrieve key wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve Mary: " + ht.get("Smith"));

        System.out.println("remove two employees: ");
        System.out.println("Find key wilson: :" + ht.get("Wilson"));
        ht.remove("Wilson");
        System.out.println("Find key Smith: " + ht.get("Smith"));
        ht.remove("Smith");

        ht.print();

        ht.put( "Smith",marySmith);
        ht.print();
    }
}
