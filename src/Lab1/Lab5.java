/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.*;

/**
 *
 * @author Mitch
 */
public class Lab5 {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "John", "111-11-1111");
        Employee e2 = new Employee("Johnson", "John", "222-22-2222");
        Employee e3 = new Employee("Jackson", "John", "333-33-3333");
        Employee e4 = new Employee("Jones", "Jimothy", "444-44-4444");
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        //I decided to dynamically create an employee ID for each employee in the Employee constructor and then use it as the map keys
        //This ensures that a different value is used for each key
        map.put(e1.getEmpId(), e1);
        map.put(e2.getEmpId(), e2);
        map.put(e3.getEmpId(), e3);
        System.out.println("key 1003 before duplicating key: " + map.get(1003) + " size: " + map.size());
        map.put(e3.getEmpId(), e4);
        System.out.println("key 1003 after duplicating key: " + map.get(1003) + " size: " + map.size());
        map.put(e3.getEmpId(), e3);
        map.put(e4.getEmpId(), e4);
        System.out.println("key 1003 fixed: " + map.get(1003) + " size: " + map.size() + "\n");
        //If you add a map item with an exsisting key, it will overwrite the previous key/value pair
        
        
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            Employee found = map.get(key);
            //output each key and its value
            System.out.println("Key: " + key + " || Value: " + found);
        }System.out.println("");
        Collection<Employee> values = map.values();
        for(Employee emp : values) {
            System.out.println(emp);
        }
    }
}
