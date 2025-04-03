package dataStructure.HashTable;

/*
Abstract data type
Provide access to data using keys
Key doesn't have to be an integer
Consists of key/value pairs -data types don't have to match
Optimized for retrieval(when you know the key)
Associative array is one type of hash table
 */
public class HashTable {

    private StoredEmployee[] hashTable;

    public HashTable() {
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        if (occupied(hashKey)) {
            int stopIndex = hashKey;
            if (hashKey == hashTable.length - 1) {
                hashKey = 0;
            } else {
                hashKey++;
            }

            while (occupied(hashKey) && hashKey != stopIndex) {
                hashKey = (hashKey + 1) % hashTable.length;
            }
        }
        if (occupied(hashKey)) {
            System.out.println("Sorry, key " + hashKey + " already exists");
        } else {
            hashTable[hashKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }

        return hashTable[hashKey].employee;
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void print() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + " : " + hashTable[i].employee);
            }
        }
    }

    private int findKey(String key) {
        int hashKey = hashKey(key);
        if (hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)) {
            return hashKey;
        }

        int stopIndex = hashKey;

        if (hashKey == hashTable.length - 1) {
            hashKey = 0;
        } else {
            hashKey++;
            System.out.println("Increment:" + hashKey);
        }

        for (int i = hashKey; i < hashTable.length; i++) {
            if (hashKey == hashTable.length - 1) hashKey = 0;
            if (hashTable[i] == null) continue;
            if (hashTable[i].key.equals(key)) {
                return i;
            }
        }
//        while (hashKey != stopIndex && hashTable[hashKey] != null && !hashTable[hashKey].key.equals(key)) {
//            hashKey = (hashKey + 1) % hashTable.length;
//            System.out.println("Increment2:" + hashKey);
//        }
//
//        if (hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)) {
//            return hashKey;
//        } else {
//            return -1;
//        }
        return -1;
    }

    public Employee remove(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }

        Employee employee = hashTable[hashKey].employee;
        hashTable[hashKey] = null;
        return employee;

    }


    private boolean occupied(int index) {
        return hashTable[index] != null;
    }

}
